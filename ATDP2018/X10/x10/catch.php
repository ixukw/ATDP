<html>
<body>
	<?
	if (filter_var($_POST["player"], FILTER_VALIDATE_INT)) {
		require 'config.php';
		date_default_timezone_set('America/Los_Angeles');
		try {
		  $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
		  $sth3 = $dbh->prepare("SELECT id FROM player");
		  $sth3->execute();
		  $allPlayers = $sth3->fetchAll();
		  foreach($allPlayers as $i) {
			  $allPlayersNew[] = $i['id'];
		  }
		  if (in_array($_POST["player"], $allPlayersNew)) {
			  $sth = $dbh->prepare("SELECT * FROM parkamon ORDER BY RAND() LIMIT 1");
			  $sth->execute();
			  $randParka = $sth->fetch();
			  $sth2 = $dbh->prepare("INSERT INTO ownership (`player_id`, `parkamon_id`, `nickname`) VALUES (:player, :parkaID, :parkaBreed);");
			  $sth2->bindValue(':player', $_POST["player"]);
			  $sth2->bindValue(':parkaID', $randParka['id']);
			  $sth2->bindValue(':parkaBreed', $randParka['breed']);
			  $test = $sth2->execute();
			  if ($test==true) {
				  echo "<h4>Success!</h4>";
			  }
		  }

		}
		catch (PDOException $e) {
		  echo "<p>Error connecting to database!</p>";
		}
	}
	?>
	<a href="game.php">Back to game!</a>
</body>
</html>
