<?php session_start();
  require 'config.php';
  date_default_timezone_set('America/Los_Angeles');
  $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
  $sthP = $dbh->prepare("SELECT name, password_hash, id FROM users WHERE name=:nameGiven");
  $sthP->bindValue(':nameGiven', $_POST["username"]);
  $sthP->execute();
  $playerName = $sthP->fetch();
  if ($_POST["password"]=="test") {
  	$_SESSION["currentplayer"]=$playerName['id'];
  	//header('Location: shoppage.php');
  } else {
  	//header('Location: login.php');
  }
  var_dump($_POST);
?>
