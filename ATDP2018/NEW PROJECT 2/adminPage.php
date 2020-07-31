<?php session_start();
try {
	require 'config.php';
	date_default_timezone_set('America/Los_Angeles');
	$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
}
catch (PDOException $e) {
	echo "ERROR!";
}
if (isset($_SESSION['currentplayer'])) {
	try {
		$sth = $dbh->prepare("SELECT * FROM users WHERE :idGiven = 1");
		$sth->bindValue(":idGiven", $_SESSION['currentplayer']);
		$sth->execute();
		$information = $sth->fetch();
	}
	catch (PDOException $e) {
		echo "<p>ERROR!</p>";
	}
	if ($information['username']!=="adminBackdoor" || $_SESSION['currentplayer']!=="1") {
		header("Location: shoppage.php");
	}
} else {
	header("Location: shoppage.php");
}
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Backdoor
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
		<style>
			.mainpage form input[type=text], .mainpage form input[type=email], .mainpage form input[type=number], select {
				width: 280px;
				padding: 10px;
			}
		</style>
	</head>
	<body>
		<?php
		echo
		"
		<div class=\"navbar\">
			<img src=\"atdpsiteLogo.png\" id=\"atdplogo\" height=\"75\" width=\"212\" alt='atdplogo'>
			<div class=\"navbar1\">
				<a href=\"shoppage.php\">Home</a>
				<a href=\"browse.php\">Browse</a>
				<a href=\"cart.php\">Cart</a>
				<a href=\"login.php\">Log In</a>
				<a href=\"signup.php\">Sign Up</a>
				<a href=\"adminpage.php\">Backdoor</a>
			</div>
			<div class='search1'>
				<form action=\"browse.php\" id=\"searchbar\" method=\"post\">
					<input type='text' name='searchysearch' placeholder='Search...'>
					<input type='image' src='searchicon.png' alt='searchbutton' class='searchit'>
				</form>
			</div>
			<div class='sessionLogin'>";
				if (isset($_SESSION['currentplayer']) && isset($_SESSION['username'])) {
					echo "<p><strong>Welcome, </strong> {$_SESSION['username']}. <a href=\"logout.php\">Logout</a>. <a href='settings.php'>Your Account</a>.</p>";
				} else {
					echo "<p>You are not logged in. Log in to purchase!</p>";
				}
				echo "
			</div>
		</div>
		";
		?>
		<div class="mainpage">
			<h1>Backdoor</h1>
			<em>ATDP Corp. forced us! We had no other choice. D:</em>
			<h2>Add an item.</h2>
		  <form action="addItem.php" method="post">
		    <h4>Name</h4><input type="text" name="item" required>
		    <h4>Type</h4><input type="text" name="type" required>
		    <h4>Cost</h4><input type="number" name="cost" required>
		    <h4>Description</h4><input type="text" name="description" required>
		    <h4>Stock</h4><input type="number" name="stock" required>
		    <h4>Image URL</h4><input type="text" name="imgurl" required>
		    <br><h2></h2><input type="submit" value="Add Item">
		  </form>
		  <h2>Delete an existing item.</h2>
		  <form action="delItem.php" method="post">
			<?php
				try {
					$sth = $dbh->prepare("SELECT * FROM shop");
					$sth->execute();
					$names = $sth->fetchAll();
				}
				catch (PDOException $e) {
					echo "<p>ERROR!</p>";
				}
				echo "
			    <select name='id'>";
				foreach ($names as $i) {
					echo "<option value=\"{$i['id']}\">{$i['name']}</option>";
				}
				echo "</select>";
			?>
		    <br><h2></h2><input type="submit" value="Delete">
		  </form>
	  	<?php
			echo "<footer>
					<img src='ucberk.png' width='250' height='75' alt='ucberkeley'><br><br>
					<a href=' https://atdpsites.berkeley.edu/validate/'>Validate Me, Higher Education State Auditors!</a>
					<br>
					<a href=' https://atdpsites.berkeley.edu/p2shopmi/sources.php'>Saucy Sources</a>
					<br>
					<p class='rreserve'>© ATDP Corps.™ All Rights Reserved.</p>

					<p class='morerreserve'>Please buy our stuff this is like 65% of our revenue UwU.</p>
					<p class='evenmorerreserve'>Yes. really. all that tuition money goes to our investors.</p>

					</footer>
					";
		 ?>
		</div>
	</body>
</html>
