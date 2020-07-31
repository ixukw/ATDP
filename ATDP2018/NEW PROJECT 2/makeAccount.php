<?php
session_start();
if (!isset($_SESSION['currentplayer'])) {
  header("Location: login.php");
}
  if (filter_var($_POST['email'], FILTER_VALIDATE_EMAIL) && isset($_POST['email'])
       && isset($_POST['username']) && isset($_POST['pass']) && isset($_POST['pass2']) && isset($_POST['address'])) {
    try {
      require 'config.php';
      date_default_timezone_set('America/Los_Angeles');
      $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
      $sth = $dbh->prepare("SELECT * FROM users");
      $sth->execute();
      $allUserInfo = $sth->fetchAll();
    }
    catch (PDOException $e) {
      echo "<p>ERROR!</p>";
    }
    $duplicate=false;
    foreach ($allUserInfo as $i => $i_value) {
        if ($i_value['email']==$_POST['email']) {
            $duplicate=true;
        }
    }
    if ($_POST['username']!==$_POST['pass'] && $duplicate==false && $_POST['pass']==$_POST['pass2'] && strlen($_POST['pass'])>=7 && strlen($_POST['pass2'])>=7) {
        $duplicate=true;
        $sth = $dbh->prepare("INSERT INTO users (username, password_hash, email) VALUES (:newUsername, :newPassword, :newEmail);");
        $sth->bindValue(":newUsername", $_POST['username']);
        $sth->bindValue(":newPassword", password_hash($_POST['pass'], PASSWORD_DEFAULT));
        $sth->bindValue(":newEmail", $_POST['email']);
        $test=$sth->execute();

        $sth = $dbh->prepare("SELECT id FROM users ORDER BY id DESC");
        $sth->execute();
        $newUserID=$sth->fetch();

        $sth = $dbh->prepare("INSERT INTO address (user_id, address) VALUES (:id, :newAddress);");
        $sth->bindValue(":id", $newUserID['id']);
        $sth->bindValue(":newAddress", $_POST['address']);
        $test=$sth->execute();

        try {
            $sth = $dbh->prepare("SELECT * FROM users ORDER BY id DESC");
            $sth->execute();
            $userInfo = $sth->fetch();
        }
        catch (PDOException $e) {
            echo "ERROR!";
        }
        session_destroy();
        session_start();
        $_SESSION['currentplayer']=$userInfo['id'];
        header("Location: shoppage.php?success=true");
    } elseif ($_POST['pass']!==$_POST['pass2']) {
        header("Location: signup.php");
        $_SESSION['status']=="A field was invalid. This could be because your password is not 7 characters, an invalid email was specified, or other reasons.";
    } else {
        header("Location: signup.php");
    }
  } else {
    header("Location: signup.php?email=bad");
  }
?>
