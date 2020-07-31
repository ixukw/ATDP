<html>
<head>
	<title>Index</title>
</head>
<body>
<?php
	#FORMAT: ITEM, DATE,LINK
	$hw = [1,2,3];
	$exercises = [];
	$project = [];
?>
<table>
<?php
	foreach ($hw as $i) {
		echo "<th>{$i}</th>";
	}
	echo "<tr>";
	foreach ($exercises as $i2) {
		echo "<th>{$i2}</th>";
	}
	echo "<tr>";
	foreach ($project as $i3) {
		echo "<th>{$i3}</th>";
	}
	echo "</tr>";
?>
</table>
</body>
</html>
