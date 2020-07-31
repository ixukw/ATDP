<?php session_start();
if (!isset($_SESSION['currentplayer']) || !isset($_SESSION['validCheckout'])) {
	header("Location: shoppage.php");
}
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Purchase
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
		<style>
		</style>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar(); ?>
		<div class="mainpage">
			<h1>Purchase</h1>
			<?php
			$sth = $dbh->prepare("DELETE FROM cart WHERE user_id = :sessionID");
			$sth->bindValue(":sessionID", $_SESSION['currentplayer']);
			$status=$sth->execute();
			if ($status==true) {
				echo
				"
				<h2>Your order has been placed. You should expect to receive it in 1e+9999 days.</h2>
				<em>Your cart has been cleared. Due to lawsuits filed for improper use of purchase history data, your purchase history will not be recorded.</em>
				";
			}
			unset($_SESSION['validCheckout']);
			footer();
			?>
		</div>
	</body>
</html>
