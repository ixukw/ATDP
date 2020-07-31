<html>
<body>
  <?php
    require 'config.php';
    date_default_timezone_set('America/Los_Angeles');
    /*try {
        $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
        $sth2 = $dbh->prepare("SELECT parkamon_id FROM ownership");
        $sth2->execute();
        $parkamonIDs = $sth2->fetch();
    }
    catch (PDOException $e) {
        echo "<p>ERROR!</p>";
    }*/
    //if (in_array($_POST["parka"], $parkamonIDs) && count($parkamonIDs)>0) {
        try {
          $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);

          $sth = $dbh->prepare("DELETE FROM ownership WHERE ownership.parkamon_id=:specifiedID");
          $sth->bindValue(":specifiedID", $_POST["id"]);
          $sth->execute();
          $parkamon = $sth->fetch();
        }
        catch (PDOException $e) {
          echo "<p>Error connecting to database!</p>";
        }
        echo "<h4>You just released the parkamon.</h4>";
    //} else {
    //    echo "<h4>Either you have no parkamon left to release, or you have specified an invalid parkamon.</h4>";
    //}
  ?>
  <a href="game.php">Return to game</a>
</body>
</html>
