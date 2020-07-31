<?php
  session_start();
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
  if (isset($_SESSION['currentplayer'])) {
    session_destroy();
    header("Location: login.php");
  }
?>
