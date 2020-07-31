<?php
	function navbar() {
		echo
		"
		<div class=\"navbar\">
			<img src=\"atdpsitelogo1.png\" id=\"atdplogo\" height=\"75\" width=\"212.5\">
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
				<img src='ucberk.png' width='300' height='90' alt='ucberkeley'>
				
				
			  </footer>
				";
	}
?>
