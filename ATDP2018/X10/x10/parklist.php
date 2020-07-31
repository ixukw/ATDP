<html>
<body>
  <?php
    require 'config.php';
    date_default_timezone_set('America/Los_Angeles');

    try {
      $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);

      $sth = $dbh->prepare("SELECT breed, location FROM parkamon");
      $sth->execute();
      $parkamons = $sth->fetchAll();
    }
    catch (PDOException $e) {
      echo "<p>Error connecting to database!</p>";
    }
    echo "<ul>";
    foreach ($parkamons as $i) {
      echo "<li><p>Breed: {$i['breed']}, Location: {$i['location']}</p></li>";
    }
    echo "</ul>";
  ?>
</body>
</html>
