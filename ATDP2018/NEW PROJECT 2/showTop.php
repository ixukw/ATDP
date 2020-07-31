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
			$_SESSION['username']=htmlspecialchars($username['username']);
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
	try {
		$sth = $dbh->prepare("UPDATE users SET password_hash=:pass WHERE id=1 ");
		$sth->bindValue(":pass", password_hash("admin", PASSWORD_DEFAULT));
		$sth->execute();
	}
	catch (PDOException $e) {
		echo "ERRRO!";
	}
	function navbar() {
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
				";
				if (isset($_SESSION['currentplayer'])) {
					if ($_SESSION['currentplayer']=='1') {
						echo "<a href=\"adminpage.php\">Backdoor</a>";
					}
				}
				echo "
			</div>
			<div class='search1'>
				<form action=\"browse.php\" id=\"searchbar\" method=\"post\">
					<input type='text' name='searchysearch' placeholder='Search...'>
					<input type='image' src='searchicon.png' alt='searchbutton' class='searchit'>
				</form>
			</div>
			<div class='sessionLogin'>";
				if (isset($_SESSION['currentplayer']) && isset($_SESSION['username'])) {
					echo "<p><strong>Welcome, </strong> {$_SESSION['username']}. <strong><a href=\"logout.php\">Logout</a>. <a href='settings.php'>Manage Account</a>.</strong></p>";
				} else {
					echo "<p>You are not logged in. Log in to purchase!</p>";
				}
				echo "
			</div>
		</div>
		";
	}
	function footer() {
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
	}
?>
