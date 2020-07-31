<html>
<head>
	<title>GAME</title>
</head>
<body>
	<h1>PARKAMON: Super Exciting Game</h1>
		<?
		try {
			require 'config.php';
			date_default_timezone_set('America/Los_Angeles');
			$dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
			$sth2 = $dbh->prepare("SELECT player.name, parkamon.breed, parkamon.location, ownership.nickname, ownership.parkamon_id FROM parkamon JOIN ownership ON parkamon.id=ownership.parkamon_id JOIN player ON ownership.player_id=player.id");
			$sth2->execute();
			$owned = $sth2->fetchAll();
		}
		catch (PDOException $e) {
			echo "<p>ERROR!</p>";
		}
		echo "<table><th>PLAYER</th><th>PARKA. BREED</th><th>PARKA. LOCATION</th><th>PARKA. NICKNAME</th>";
		foreach($owned as $i) {
			echo
			"
			<tr>
			<td>{$i['name']}</td>
			<td>{$i['breed']}</td>
			<td>{$i['location']}</td>
			<td>{$i['nickname']}</td>
			</tr>
			";
		}
		echo "</table>";
		?>
		<form action="rename.php" method="post">
		<p>PARKAMON TO RENAME:</p>
		<select name="renameParka">
			<?
				foreach ($owned as $i) {
					echo "<option value=\"{$i['parkamon_id']}\">{$i['breed']}</option>";
				}
			?>
		</select>
		<p>NEW NAME FOR THIS PARKAMON:</p><input type="text" name="newName">
		<input type="submit" value="Rename">
		</form>
		<form action="catch.php" method="post">
		<p>SELECT A PLAYER TO USE FOR CATCHING PARKAMON:</p>
		<select name="player">
			<?

			try {


			  $sth = $dbh->prepare("SELECT name, id FROM player");
			  $sth->execute();
			  $players = $sth->fetchAll();

			}
			catch (PDOException $e) {
			  echo "<p>Error connecting to database!</p>";
			}
			foreach ($players as $i) {
				echo "<option value=\"{$i['id']}\">{$i['name']}</option>";
			}
			?>
		</select>
		<input type="submit" value="Catch">
	</form>
	<p>RELEASE A PARKAMON:</p>
	<form action="release.php" method="post">
		<select name="parka">
			<?
				foreach ($owned as $i) {
					echo "<option value=\"{$i['parkamon_id']}\">{$i['breed']}</option>";
				}
			?>
		</select>
		<input type="submit" value="Release">
	</form>
</body>
</html>
