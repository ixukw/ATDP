<?php
  session_start();
  if (!isset($_SESSION['currentplayer'])) {
    header("Location: login.php");
  }
  try {
    require 'config.php';
  	date_default_timezone_set('America/Los_Angeles');
  	$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
  }
  catch (PDOException $e) {
    echo "ERROR!";
  }
  if (isset($_POST)&&!empty($_POST)) {
    if (isset($_POST['newUsername'])&&!empty($_POST['newUsername'])) {
      try {
        $sth = $dbh->prepare("UPDATE users SET username=:nameGiven WHERE id=:sessionID");
      	$sth->bindValue(':nameGiven', $_POST["newUsername"]);
        $sth->bindValue(':sessionID', $_SESSION['currentplayer']);
      	$test=$sth->execute();
      }
      catch (PDOException $e) {
        echo "ERROR!";
      }
    }
    if (isset($_POST['newPass'])&&!empty($_POST['newPass'])) {
      try {
        $sth = $dbh->prepare("SELECT password_hash FROM users WHERE id=:sessionID");
        $sth->bindValue(':sessionID', $_SESSION['currentplayer']);
      	$sth->execute();
        $pass=$sth->fetch();
      }
      catch (PDOException $e) {
        echo "ERROR!";
      }
      if (password_verify($_POST['oldPass'], $pass['password_hash'])) {
        try {
          $sth = $dbh->prepare("UPDATE users SET password=:nameGiven WHERE id=:sessionID");
        	$sth->bindValue(':nameGiven', password_hash($_POST["newUsername"], PASSWORD_DEFAULT));
          $sth->bindValue(':sessionID', $_SESSION['currentplayer']);
        	$test=$sth->execute();
        }
        catch (PDOException $e) {
          echo "ERROR!";
        }
        $_SESSION['currentPass']=$_POST['newPass'];
      }
    }
    if (isset($_POST['newEmail'])&&!empty($_POST['newEmail'])&&filter_var($_POST['newEmail'], FILTER_VALIDATE_EMAIL)) {
      try {
        $sth = $dbh->prepare("UPDATE users SET email=:nameGiven WHERE id=:sessionID");
      	$sth->bindValue(':nameGiven', $_POST["newEmail"]);
        $sth->bindValue(':sessionID', $_SESSION['currentplayer']);
      	$test=$sth->execute();
      }
      catch (PDOException $e) {
        echo "ERROR!";
      }
    }
    if (isset($_POST['address'])&&!empty($_POST['address'])) {
      try {
        $sth = $dbh->prepare("DELETE FROM address WHERE address.user_id=:sessionID AND address=:name LIMIT 1");
        $sth->bindValue(':name', $_POST["address"]);
        $sth->bindValue(':sessionID', $_SESSION['currentplayer']);
        $test=$sth->execute();
      }
      catch (PDOException $e) {
        echo "ERROR!";
      }
    }
    if (isset($_POST['newAddress'])&&!empty($_POST['newAddress'])) {
      try {
        $sth = $dbh->prepare("SELECT user_id, address FROM address JOIN users ON users.id=address.user_id  WHERE user_id = :currentplayer");
        $sth->bindValue(':currentplayer', $_SESSION['currentplayer']);
        $sth->execute();
        $addresses=$sth->fetchAll();
      }
      catch (PDOException $e) {
        echo "ERROR!";
      }
      foreach ($addresses as $i) {
        if ($_POST['newAddress']==$i['address']) {
          $_SESSION['editStatus']='repeatAddress';
          header("Location: settings.php");
        }
      }
      try {
        $sth = $dbh->prepare("INSERT INTO address (user_id, address) VALUES (:sessionID, :name);");
        $sth->bindValue(':name', $_POST["newAddress"]);
        $sth->bindValue(':sessionID', $_SESSION['currentplayer']);
        $test=$sth->execute();
      }
      catch (PDOException $e) {
        echo "ERROR!";
      }
    }
    $_SESSION['success']=true;
    header("Location: settings.php");
  } else {
    $_SESSION['editStatus']='No fields contained valid input.';
    header("Location: settings.php");
  }
?>
