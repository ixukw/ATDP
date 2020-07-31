<?php session_start();
  if (isset($_SESSION['currentplayer'])) {
    try {
    	require 'config.php';
    	date_default_timezone_set('America/Los_Angeles');
    	$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
      $sth = $dbh->prepare("INSERT INTO cart (shop_id, user_id) VALUES (:itemToAdd, :sessionID);");
      $sth->bindValue(":itemToAdd", $_POST['item']);
      $sth->bindValue(":sessionID", $_SESSION['currentplayer']);
      $status=$sth->execute();

      $sth = $dbh->prepare("UPDATE shop SET stock = stock-1 WHERE id=:itemID;");
      $sth->bindValue(":itemID", $_POST['item']);
      $sth->execute();
    }
    catch (PDOException $e) {
      echo "<p>ERROR!</p>";
    }
    if ($status==true) {
      header("Location: browse.php");
      $_SESSION['success']=true;
    } else {
      echo "<h1>This message should not appear. What happens if it does? Please report this to ATDP Corp.</h1>";
    }
  } else {
    header("Location: login.php?loginStatus=notLoggedIn");
  }
?>
