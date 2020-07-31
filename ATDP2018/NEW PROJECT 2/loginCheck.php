<?php session_start();
try {
	require 'config.php';
	date_default_timezone_set('America/Los_Angeles');
	$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
	$sthP = $dbh->prepare("SELECT * FROM users WHERE username=:nameGiven");
	$sthP->bindValue(':nameGiven', $_POST["username"]);
	$sthP->execute();
	$playerName = $sthP->fetch();
}
catch (PDOException $e) {
	echo "ERROR!";
}
	if ($_POST["password"]==password_verify($_POST['password'], $playerName['password_hash'])) {
		$_SESSION["currentplayer"]=$playerName['id'];
		header('Location: shoppage.php');
		$_SESSION['currentPass']=$_POST['password'];
	} else {
		header('Location: login.php?i=1');
		$_SESSION['errorMessage']="Invalid username or password.";
	}
?>
