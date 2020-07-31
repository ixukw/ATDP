<?php session_start();
if (isset($_SESSION['validCheckout'])) {
	if (!isset($_SESSION['currentplayer']) || $_SESSION['validCheckout']==false) {
		header("Location: login.php");
	}
} else {
	header("Location: login.php");
}
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Checkout
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
		<style>
			table {
				width: 100%;
				margin: auto;
				text-align: left;
			}
			td.price {
				font-weight: bold;
				font-size: 30px;
			}
			input[type=submit] {
				margin-top: 20px;
			}
		</style>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar(); ?>
		<div class="mainpage">
			<h1>Checkout</h1>
			<?php
				try {
					$sth = $dbh->prepare("SELECT cart.*, shop.name, shop.cost, shop.url, shop.stock, shop.description FROM cart JOIN shop ON shop.id = cart.shop_id JOIN users ON users.id = cart.user_id WHERE user_id = :currentplayer");
					$sth->bindValue(':currentplayer', $_SESSION['currentplayer']);
					$sth->execute();
					$cartshow = $sth->fetchAll();
				}
				catch (PDOException $e) {
					echo "<p>Error connecting to database!</p>";
				}
				echo "<table>";
				echo "<tr><th>Product</th><th>Price</th></tr>";
				$addedprice = 0;
				for ($o = 0; $o < count($cartshow); $o++) {
					echo "<tr><td>{$cartshow[$o]['name']}</td><td class='price'>{$cartshow[$o]['cost']}</td></tr>";
					$addedprice = $addedprice + $cartshow[$o]['cost'];
				}
				echo "</table>";
				try {
					$sth = $dbh->prepare("SELECT user_id, address FROM address JOIN users ON users.id=address.user_id  WHERE user_id = :currentplayer");
					$sth->bindValue(':currentplayer', $_SESSION['currentplayer']);
					$sth->execute();
					$address = $sth->fetchAll();
				}
				catch (PDOException $e) {
					echo "<p>Error connecting to database!</p>";
				}
				echo
				"<div class='orderInfo'><h2>Shipment Information</h2>
				";
				echo "<p>We found the following addresses to ship to. Please select one.</p>";
				echo "<form action='dropcart.php' method='post'>";
				foreach ($address as $i) {
					echo "<input type='radio' value='{$i['address']}' name='address' required>{$i['address']}<br>";
				}
				echo "<h2>Payment Information</h2><em>ATDP Corp. will send you an email containing payment details. Unfortunately, ATDP Corp. has not gained authorization to use outside payment methods, such as credit, debit, or PayPal.</em>";

				echo "<br><input type='submit' value='Purchase'></form></div>";
				footer();
			?>
		</div>
	</body>
</html>
