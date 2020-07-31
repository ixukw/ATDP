<html>
<body>
  <?php
    require 'config.php';
    date_default_timezone_set('America/Los_Angeles');
	try {
	  $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);

	  $sth2 = $dbh->prepare("SELECT parkamon_id FROM ownership");
	  $sth2->execute();
	  $parkamonIDs = $sth2->fetchAll();
	}
	catch (PDOException $e) {
	  echo "<p>ERROR!</p>";
	}
	if (strlen($_POST["newName"])<=8 && strlen($_POST["newName"])>0 && filter_var($_POST['renameParka'], FILTER_VALIDATE_INT)) {
		try {
	    $sth = $dbh->prepare("UPDATE ownership SET nickname=:newNickname WHERE :renameID=ownership.parkamon_id");
		  $sth->bindValue(":newNickname", $_POST["newName"]);
		  $sth->bindValue(":renameID", $_POST["renameParka"]);
		  $test = $sth->execute();
	    }
	    catch (PDOException $e) {
	      echo "<p>ERROR!</p>";
	    }
		echo "<h4>Successfully renamed to: {$_POST["newName"]}.</h4>";
	} else {
		echo "<h4>ERROR! Maximum Character length is 8, and must be more than 0, and must be a valid parkamon.</h4>";
	}
  ?>
  <a href="game.php">Return to game</a>
</body>
</html>
