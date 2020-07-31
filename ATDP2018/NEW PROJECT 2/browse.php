<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Browse
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
		<style>
			td {
				width: 250px;
				height: 500px;
				box-shadow: 5px 4px 8px 0 rgba(0, 0, 0, 0.2);
				padding: 10px;
				margin-left: 60px;
				margin-right: 60px;
				background: linear-gradient(to bottom right, rgb(240,240,240), rgb(255,255,255));
				text-align: center;
			}
			td:hover {
			background: linear-gradient(to bottom right, rgb(230,230,230), rgb(255,255,255));
			box-shadow: 5px 8px 8px 0 rgba(0, 0, 0, 0.4);
			}
			table {
				border-collapse: separate;
				border-spacing: 75px;
			}
			input[type=submit], div.fakeButton {
				border: none;
				outline: 0;
				display: inline-block;
				padding: 8px;
				background-color: #000;
				text-align: center;
				cursor: pointer;
				width: 100%;
				color: white;
			}
			input[type=submit]:hover {
				background-color: #555;
			}
			input.noStock {
				opacity: 0;
				cursor: auto;
			}
		    .browsecell p {
				height: 65px;
			}
			tr {
			margin: auto
			}
			td img {
				width: 250px;
				height: 250px;
			}
			table {
				margin-left: 100px;
			}
		</style>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar(); ?>
		<div class="mainpage">
			<?php
			function printItem($array, $header, $case) {
				$ended=false;
				if ($case==false) {
					echo "<h1 class=\"catagoryHeader\">{$header}</h1>";
				} else {
					echo "<h1 class=\"catagoryHeader\">{$header}</h1>";
				}
				$count = count($array);
				if ($count==0) {
					echo "<em>Your search query returned 0 results. This could be because of an invalid query.</em>";
				} else {
					echo "<em>{$count} items found.</em><br>";
				}
				echo "<table>";
				for ($i = 0; $i < $count; $i++) {
					if ($i%3==0) {
						echo "<tr>";
						$ended=false;
					}
					echo "<td><img class='imgZoom' src=\"{$array[$i]['url']}\" alt='{$array[$i]['name']}'>
					<h2>{$array[$i]['name']}</h2><h5>\${$array[$i]['cost']}</h5><div class='browsecell'><p>{$array[$i]['description']}</p></div>";
					if ($array[$i]['stock']>0) {
						echo "<p class=\"inStockText\">{$array[$i]['stock']} left in stock.</p><form action='addToCart.php' method='post'>
						<input type='hidden' name='item' value={$array[$i]['id']}><br>
						<input type='submit' class='browseSubmit' value='Add To Cart'><br></form>";
					} else {
						echo "<p class=\"noStockText\">Out of stock.</p><form action='addToCart.php' method='post'>
						<input type='hidden' name='item' value={$array[$i]['id']}><br>
						<input type='submit' class='noStock' value='Unavailable' disabled><br></form>";
					}
					echo "</td>";
					if ($i%3==2) {
						echo "</tr>";
						$ended=true;
					}

				}

				echo "</table>";
				}
					/*echo "</table>";
				 foreach ($array as $i => $i_value) {
 					echo "<tr><td class=\"itemImg\"><img src=\"https://www.webpagefx.com/blog/images/cdn.designinstruct.com/files/582-how-to-image-placeholders/generic-image-placeholder.png\"></td>
 					<td><h2>{$i_value['name']}</h2><h5>\${$i_value['cost']}</h5><p>{$i_value['description']}</p>
 					<form action='addToCart.php' method='post'>
 					<input type='hidden' name='item' value={$i_value['id']}><br>
 					<input type='submit' value='Add To Cart'><br>
 					</form>
 					";
 					if ($i_value['stock']>0) {
 						echo "<p class=\"inStockText\">{$i_value['stock']} left in stock.";
 					} else {
 						echo "<p class=\"noStockText\">Out of stock.";
 					}
 					echo "</p></td></tr>";
 				}
				echo "</table>";*/

			if (isset($_POST['searchysearch'])) {
				try {
		      		$sth = $dbh->prepare("SELECT * FROM shop WHERE type=:requested ORDER BY name");
					$sth->bindValue(":requested", $_POST['searchysearch']);
					$sth->execute();
		      		$items = $sth->fetchAll();

					$sth3 = $dbh->prepare("SELECT * FROM shop WHERE name LIKE CONCAT('%', :requested, '%') ORDER BY name");
					$sth3->bindValue(":requested", $_POST['searchysearch']);
					$sth3->execute();
					$items2 = $sth3->fetchAll();
					$sth2 = $dbh->prepare("SELECT * FROM shop WHERE type!=:requested ORDER BY name");
					$sth2->bindValue(":requested", $_POST['searchysearch']);
					$sth2->execute();
		      		$otherItems = $sth2->fetchAll();
			  	}
				catch (PDOException $e) {
			    	echo "<p>ERROR!</p>";
			    }
				if (isset($_POST['searchysearch'])) {
					try {
						$sth = $dbh->prepare("SELECT type FROM shop WHERE type=:name");
						$sth->bindValue(":name", $_POST['searchysearch']);
						$sth->execute();
						$type = $sth->fetch();
					}
					catch (PDOException $e) {
						echo "ERROR!";
					}
					$newTitle = $type['type'];
					if ($type==false) {
						$newTitle=htmlspecialchars($_POST['searchysearch']);
					}
				}
				if (empty($items)==false) {
					printItem($items, $newTitle, false);
				} else if (empty($items)==true) {
					printItem($items2, "Search: " . $newTitle, false);
				}
				printItem($otherItems, "Other Items", true);
			} else {
				try {
			      	$sth = $dbh->prepare("SELECT * FROM shop ORDER BY name");
					$sth->execute();
			      	$items = $sth->fetchAll();
				}
				catch (PDOException $e) {
			    	echo "<p>ERROR!</p>";
		    	}
				printItem($items, "All Items", true);
			}
			footer();
			?>
		</div>
	</body>
</html>
