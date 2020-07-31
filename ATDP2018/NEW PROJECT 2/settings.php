<?php session_start();
if (!isset($_SESSION['currentplayer'])) {
	header("Location: login.php");
}
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Account Settings
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
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
			form h4 {
				width: 50%;
			}
			.mainpage form input[type=text], .mainpage form input[type=email], .mainpage form input[type=password] {
				width: 280px;
			}
			input[type=submit] {
				margin-top: 20px;
				margin-left: 38%;
			}
			hr {
				margin-top: 20px;
				margin-bottom: 20px;
			}
			select {
				width: 300px;
				padding: 10px;
			}
			input[type=submit]#delButton {
				border: 1px solid red;
				background-color: darkred;
				color: white;
			}
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar(); ?>
		<div class="mainpage">
			<h1>Account Settings</h1>
			<em>Enter information into fields to which you want to change.</em>
			<?php
			if (isset($_SESSION['editStatus'])) {
				echo "<h3 class='error'>{$_SESSION['editStatus']}</h3>";
			}
				try {
					$sth = $dbh->prepare("SELECT * FROM users WHERE id=:currentID");
					$sth->bindValue(":currentID", $_SESSION['currentplayer']);
					$sth->execute();
					$userInfo = $sth->fetch();

					$sth = $dbh->prepare("SELECT user_id, address FROM address JOIN users ON users.id=address.user_id  WHERE user_id = :currentplayer");
					$sth->bindValue(':currentplayer', $_SESSION['currentplayer']);
					$sth->execute();
					$address = $sth->fetchAll();
				}
				catch (PDOException $e) {
					echo "ERROR!";
				}
				$username=htmlspecialchars($userInfo['username']);
				$email=htmlspecialchars($userInfo['email']);
				if (isset($_SESSION['currentPass'])) {
					$pass=substr(htmlspecialchars($_SESSION['currentPass']), 0, 1);
					for ($i=0; $i < strlen($_SESSION['currentPass'])-1; $i++) {
						$pass=$pass . "*";
					}
				} else {
					$pass="This message should not appear. If it does, it is a bug.";
				}
				echo
				"
				<form action='editAccount.php' method='post'>
				<p><strong>Username: </strong>{$username}</p>
				<h4>Change Username:  </h4><input type='text' name='newUsername'>
				<hr>
				<p><strong>Password: </strong>{$pass}</p>
				<em>For security reasons, first input your old password, then input your new password.</em>
				<h4>Old Password: </h4><input type='password' name='oldPass'><br><h4>New Password:</h4><input type='password' name='newPass'>
				<hr>
				<p><strong>Email: </strong>{$email}</p>
				<h4>Change Email: </h4><input type='email' name='newEmail'>
				<hr>
				<h4>Valid Addresses: </h4><ul>";
				foreach ($address as $i) {
					$location=htmlspecialchars($i['address']);
					echo "<li>{$location}</li>";
				}
				echo "</ul>";
				if (count($address)>1) {
					echo "
					<em>Select an address to delete it.</em><br><select name='address'><option disabled selected value>Select an option</option>";
					foreach ($address as $i) {
						$location=htmlspecialchars($i['address']);
						echo "<option value='{$location}'>{$location}<br>";
					}
					echo "</select>";
				} else {
					echo "<em>Deleting addresses requires at least 2 addresses in your account.</em>";
				}
				echo
				"
				<h4>Add a new address:</h4>
				<input type='text' name='newAddress'><br>
				<input type='submit' value='Save changes'></form>
				<h2>
				<form action='delAcc.php' method='post'>
					<input id='delButton' type='submit' value='Delete Account'>
				</form>
				";
				footer();
			?>
		</div>
	</body>
</html>
