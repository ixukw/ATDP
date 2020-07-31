<?php
session_start();
if (isset($_SESSION["currentplayer"])) {
	header('Location: shoppage.php');
}
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Login
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script>
			$(document).ready(() => {
				$("input[type=checkbox]").on("click", (event) => {
					let type = $("input.password").attr("type");
					if (type=='password') {
						$("input.password").attr("type", "text");
					} else {
						$("input.password").attr("type", "password");
					}
				});
			});
		</script>
		<style>
			.error {
				color: red;
			}
			.mainpage input:not([type=submit])  {
				padding: 10px;
				border: 1px solid black;
			}
			.mainpage form {
				margin: auto;
				width: 300px;
			}
			input[type=checkbox] {
				width: 20px;
				height: 20px;
				border: 1px solid black;
				border-radius: 10px;
				cursor: pointer;
				margin-bottom: 20px;
				margin-top: 20px;
			}
			form h4 {
				width: 50%;
			}
			.mainpage form input[type=text], .mainpage form input[type=email], .mainpage form input[type=password] {
				width: 280px;
			}
			input[type=submit] {
				padding: 10px;
				margin-top: 20px;
				margin: auto;
				width: 300px;
				cursor: pointer;
				box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			}
		</style>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar(); ?>
		<div class="mainpage">
			<h1>Login</h1>
			<em>Specify a valid username and password.</em>
			<?php
				if (isset($_SESSION['errorMessage'])) {
					echo "<h3 class='error'>" . $_SESSION['errorMessage'] . "</h3>";
					unset($_SESSION['errorMessage']);
				}
			?>
			<form action="loginCheck.php" method="post">
				<h4>Username:</h4><input type="text" name="username" required><br>
				<h4>Password:</h4><input class="password" type="password" name="password" required><br>
				<input type="checkbox">Show Password<br>
				<input type="submit" value="Log In">
			</form>
			<p>Don't have an account? Create <a href="signup.php">one</a>!</p>
			<? footer(); ?>
		</div>
	</body>
</html>
