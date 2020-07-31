<html>
<body>
<?
	require 'credentials.php';
	try {
		$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
		$sth = $dbh->prepare("SELECT * FROM comic ");
		$sth->execute();
		$comic1 = $sth->fetchAll();
	}
	catch (PDOException $e) {
		echo "<p>Error connecting to database!</p>";
	}
	foreach ($comic1 as $i) {
		$myDate = new DateTime($i["date"]);
		$dateFormatted = $myDate->format("m-d-Y");
		echo "<h1>Comic {$i["comicID"]}</h1>";
		echo "<h4>Title of Comic: {$i['title']}</h4>";
		echo "<h4>Date posted: {$dateFormatted}</h4>";
		echo "<img src=\"http://chalkboardmanifesto.com/{$i['fileName']}\">";
		echo "<br><a href=\"http://chalkboardmanifesto.com/{$i['fileName']}\">Link to this comic.</a>";
		echo "<hr>";
	}
?>
</body>
</html>
