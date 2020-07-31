<html>
<body>
  <?php
    try {
      require 'config.php';
      date_default_timezone_set('America/Los_Angeles');
      $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
      $sth = $dbh->prepare("INSERT INTO shop (`name`, `type`, `cost`, `status`) VALUES (:name, :type, :cost, :status)");
      $sth->bindValue(':name', $_POST["item"]);
      $sth->bindValue(':type', $_POST["type"]);
      $sth->bindValue(':cost', $_POST["cost"]);
      $sth->bindValue(':status', $_POST["status"]);
      $status=$sth->execute();
    }
    catch (PDOException $e) {
      echo "<p>ERROR!</p>";
    }
    var_dump($status);
  ?>
  <a href="testShop.php">return</a>
</body>
</html>
