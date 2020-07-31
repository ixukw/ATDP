<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Sign Up
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
			.mainpage input:not([type=submit])  {
				padding: 10px;
				border: 1px solid black;
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
			.mainpage form {
				margin: auto;
				width: 300px;
			}
			form h4 {
				width: 50%;
			}
			.mainpage form input[type=text], .mainpage form input[type=email], .mainpage form input[type=password] {
				width: 280px;
			}
			input[type=submit] {
				padding: 10px;
				margin-top: 10px;
				margin: auto;
				width: 300px;
				cursor: pointer;
				box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			}
			div.popup {
				float: right;
				float: bottom;
			}
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar();?>
		<div class="mainpage">
			<h1>Create a new account.</h1>
			<em>Extremely easy to create a new account! No excess information required! </em>
			<?php
				if (isset($_SESSION['status'])) {
					echo "<h3 class='error'>{$_SESSION['status']}</h3>";
					unset($_SESSION['status']);
				}
			?>
			<em>Passwords must be at least 7 characters. The same email cannot be used twice for two accounts. Usernames and passwords must be different.</em>
			<form action="makeAccount.php" method="post" autocomplete="off">
		      <h4>Username:</h4><input type="text" name="username" placeholder="Username" required>
		      <h4>Password:</h4><input type="password" class="password" placeholder="Password, 7+ characters" name="pass" required>
		      <h4>Confirm Password:</h4><input type="password" class="password" placeholder="Confirm Password" name="pass2" required>
		      <h4>Email:</h4><input type="email" name="email" placeholder="johnappleseed@atdp.corp" required>
					<h4>Confirm Email:</h4><input type="email" placeholder="Confirm Email Address" name="email2" required>
					<h4>Address:</h4><input type="text" placeholder="2999 Addison Street, Berkeley, CA"name="address" required><br>
					<br><input type="checkbox">Show Password<br>
		      <input type="submit" value="Create Account">
		  </form>
				<?php footer(); ?>
		</div>
		<div class="popup">
			<h1>TEST</h1>
		</div>
	</body>
</html>
