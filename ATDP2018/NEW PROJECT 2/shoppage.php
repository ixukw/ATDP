<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
			ATDP Home
		</title>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link href="dazzler.css" rel="stylesheet">
		
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar();
		try {
			$sth = $dbh->prepare("UPDATE users SET password=:pass WHERE id=1 ");
			$sth->bindValue(":pass", password_hash("admin", PASSWORD_DEFAULT));
			$sth->execute();
		}
		catch (PDOException $e) {
			echo "ERRRO!";
		}
		?>
		<div class="mainpage">
			<?php
				try {
		      		$sth = $dbh->prepare("SELECT * FROM shop");
							$sth->execute();
		      		$galler = $sth->fetchAll();
		      		echo "<div class='sliding'>";
		      		for ($i = 0; $i < count($galler); $i++) {
						echo "<img class='sliders w3-animate-right' src=\"{$galler[$i]['url']}\">";
		      		}
		      		echo "</div>";

			  	}
			  	catch (PDOException $e) {
		      	echo "<p>ERROR!</p>";
		   		}
		   		$sth = $dbh->prepare("SELECT * FROM shop ORDER BY RAND()");
					$sth->execute();
		      		$galler1 = $sth->fetchAll();
		      	$sth = $dbh->prepare("SELECT * FROM shop ORDER BY RAND()");
					$sth->execute();
		      		$galler2 = $sth->fetchAll();
				echo "<div class='faketd'><img src=\"{$galler1[0]['url']}\" alt='{$galler1[0]['name']}'>
					<h2>{$galler1[0]['name']}</h2><h5>\${$galler1[0]['cost']}</h5><hr><div class='browsecell'><p>{$galler1[0]['description']}</p></div><hr>";
				if ($galler1[0]['stock']>0) {
					echo "<p class=\"inStockText\">{$galler1[0]['stock']} left in stock.</p></div>";
				}
					else {
						echo "<p class=\"noStockText\">Out of stock.</p>";
					}
				echo "<div class='faketd'><img src=\"{$galler2[0]['url']}\" alt='{$galler2[0]['name']}'>
					<h2>{$galler2[0]['name']}</h2><h5>\${$galler2[0]['cost']}</h5><hr><div class='browsecell'><p>{$galler2[0]['description']}</p></div><hr>";
					if ($galler2[0]['stock']>0) {
						echo "<p class=\"inStockText\">{$galler2[0]['stock']} left in stock.</p>";
					}
						else {
							echo "<p class=\"noStockText\">Out of stock.</p>";
						}
				echo "</div>";
			
				footer()
			?>
		</div>
	</body>
</html>
