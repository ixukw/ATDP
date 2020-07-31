<?php
if (isset($_SESSION["currentplayer"])) {
	header('Location: shoppage.php');
}
session_start();
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar(); ?>
		<div class="mainpage">
			<form action="loginCheck.php" method="post">
				<p>Username:</p><input type="text" name="username"><br>
				<p>Password:</p><input type="password" name="password"><br>
				<input type="submit" value="Log In">
			</form>
			<? footer(); ?>
		</div>
	</body>
</html>
