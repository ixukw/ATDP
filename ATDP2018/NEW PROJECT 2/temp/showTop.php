<?php
	if (isset($_SESSION['currentplayer'])) {
		try {
			require 'config.php';
			date_default_timezone_set('America/Los_Angeles');
			$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
			$sth = $dbh->prepare("SELECT username FROM users WHERE id=:currentID");
			$sth->bindValue(":currentID", $_SESSION['currentplayer']);
			$sth->execute();
			$username = $sth->fetch();
			$_SESSION['username']=$username['username'];
		}
		catch (PDOException $e) {
			echo "<p>ERROR!</p>";
		}
	} else {
		try {
			require 'config.php';
			date_default_timezone_set('America/Los_Angeles');
			$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
		}
		catch (PDOException $e) {
			echo "<p>ERROR!</p>";
		}
	}
	function navbar() {
		echo
		"
		<div class=\"navbar\">
			<img src=\"atdpsitelogo1.png\" id=\"atdplogo\" height=\"75\" width=\"212.5\">
			<div class='sessionLogin'>";
			if (isset($_SESSION['currentplayer']) && isset($_SESSION['username'])) {
				echo "<p><strong>Welcome, </strong> {$_SESSION['username']}.";
			} else {
				echo "<p>You are not logged in. Log in to purchase!</p>";
			}
			echo "
			</div>
			<div class='search1'>
				<form action=\"browse.php\" id=\"searchbar\" method=\"post\">
					<input type='text' name='searchysearch' placeholder='Search...'>
					<input type='image' src='searchicon.png' alt='searchbutton' class='searchit' value=''>
				</form>
			</div>
			<ul class=\"navbar1\">
				<li><a href=\"shoppage.php\">Home</a></li>
				<li><a href=\"browse.php\">Browse</a></li>
				<li><a href=\"contact.php\">Contact</a></li>
				<li><a href=\"cart.php\">Cart</a></li>
				<li><a href=\"login.php\">Log In</a></li>
				<li><a href=\"signup.php\">Sign Up</a></li>
			</ul>
		</div>
		";
	}
	function footer() {
		echo "<footer>
				<img src='ucberk.png' width='250' height='75' alt='ucberkeley'>
				<a href=' https://atdpsites.berkeley.edu/validate/'>Validate Me, Higher Education State Auditors!</a>
				<br>
				<p class='rreserve'>© ATDP Corps.™ All Rights Reserved.</p>

				<p class='morerreserve'>Please buy our stuff this is like 65% of our revenue UwU.</p>
				<p class='evenmorerreserve'>Yes. really. all that tuition money goes to our investors.</p>

			  </footer>
				";
	}
?>
