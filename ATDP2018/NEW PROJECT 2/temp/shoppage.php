<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>
		</title>
		<link href="dazzler.css" rel="stylesheet">
		<script
      src="https://code.jquery.com/jquery-3.3.1.js"
      integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
      crossorigin="anonymous"></script>
    <script src="shop.js"></script>
	</head>
	<body>
		<?php require_once("showTop.php"); navbar()?>
		<div class="mainpage">
			<?php
				footer()
			?>
		</div>
	</body>
</html>
