<html>
<head>
	<title>X2: Getting to Know You</title>
	<style>
		h1,h2 {
			font-family: Helvetica;
		}
		h1 {
			text-align: center;
		}
		body {
			background-color: lightblue;
			margin-left: 20%;
			margin-right: 20%;
			border: 2px solid black;
			padding: 20px;
		}
	</style>
</head>
<body>
	<?php
		require_once("header.php");
		printHeader("X2: Getting to Know You");
		$names = ["<h2>Your Gender: </h2>"=>"gender","<h2>Your Age: </h2>"=>"age","<h2>How good you are with macOS: </h2>"=>"usability","<h2>What your favorite OS is: </h2>"=>"favOS", /*"<h2>You have used the following operating systems:</h2>"=>"os",*/ "<h2>Email:</h2>"=>"email"];

		foreach($names as $i => $i_value) {
			if (empty($_POST[$i_value])) {
				echo "<h1>FIELD LEFT BLANK. STOPPED PARSE.</h1>";
				exit();
			} else {
				#if ($i_value !== "os") {
					echo $i . htmlspecialchars($_POST[$i_value]);
				#} elseif ($i_value == "os") {
			#		$checklistOutput = $_POST[$i_value];
			#		echo $i;
			#		for ($i=0; $i<count($checklistOutput); $i++) {
						#echo htmlspecialchars($checklistOutput[$i]) . "<br>";
					#	echo "Unavailable.";
					#}

				#}
			}
		}

	?>

</body>
</html>
