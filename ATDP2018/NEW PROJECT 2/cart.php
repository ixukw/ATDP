<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Cart
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
		<style>
			td img {
				width: 250px;
				height: 250px;
				padding-right: 20px;
				padding: 5px;
			}
			tr {
				box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			}
			table {
				border-collapse: separate;
				border-spacing: 20px;
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
		<?php require_once("showTop.php");
			navbar();
		 ?>
		<div class="mainpage">
			<?php
				if (isset($_SESSION['currentplayer'])) {
					try {
						$sth = $dbh->prepare("SELECT cart.*, shop.name, shop.cost, shop.url, shop.stock, shop.description FROM cart JOIN shop ON shop.id = cart.shop_id JOIN users ON users.id = cart.user_id WHERE user_id = :currentplayer");
						$sth->bindValue(':currentplayer', $_SESSION['currentplayer']);
						$sth->execute();
						$cartshow = $sth->fetchAll();
					}
					catch (PDOException $e) {
						echo "<p>Error connecting to database!</p>";
					}
					$addedprice = 0;
					for ($o = 0; $o < count($cartshow); $o++) {
						$addedprice = $addedprice + $cartshow[$o]['cost'];
					}
					$c = count($cartshow);
					echo "<h1>Your Cart</h1><em>There are {$c} item(s) in your cart.</em><table>";
					if ($c!==0) {
						$_SESSION['validCheckout']=true;
					} else {
						$_SESSION['validCheckout']=false;
					}
					foreach ($cartshow as $i) {
						echo
						"<tr>
							<td><img src=\"{$i['url']}\" alt=\"{$i['name']}\"></td>
							<td><div class='content'>
								<h3>{$i['name']}</h3>
								<strong>\${$i['cost']}</strong>
								";
								if ($i['stock']>0) {
									echo "<p class=\"inStockText\">{$i['stock']} left in stock.</p>";
								} else {
									echo "<p class=\"noStockText\">Out of stock.</p>";
								}
								echo "
								<p>{$i['description']}</p>
							</div></td>
						</tr>";
					}
					echo "</table>";
					echo "<h2>Total Price: \${$addedprice}</h2>";
					if ($c!==0) {
						echo "<form action='checkout.php' method='post'>
						<input type='hidden' name='cartie' value='wut'><br>
						<input type='submit' value='Proceed to checkout.'><br>";
					} else {
						echo "<em>At least valid one item is required for checkout.</em>";
					}
					echo "</form>";
				}
					else {
					 echo "<h2>Not Signed In.</h2>Oops. looks like you are not signed in. Log in <a href=\"login.php\">here</a> to see your cart.";
					}
				footer();
			?>

		</div>
	</body>
</html>
