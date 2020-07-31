<?php session_start();
if (!isset($_SESSION['currentplayer'])) {
	header("Location: shoppage.php");
}
	require 'config.php';
	date_default_timezone_set('America/Los_Angeles');
	$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
  $sth = $dbh->prepare("DELETE FROM users WHERE id=:sessionID");
  $sth->bindValue(":sessionID", $_SESSION['currentplayer']);
  $status=$sth->execute();
	$sth = $dbh->prepare("DELETE FROM address WHERE user_id=:sessionID");
  $sth->bindValue(":sessionID", $_SESSION['currentplayer']);
  $status2=$sth->execute();
  if ($status==true) {
    header("Location: login.php");
    session_destroy();
  }
  else {
    echo "<h1>This message should not appear. What happens if it does? Please report this to ATDP Corp.</h1>";
  }
?>
