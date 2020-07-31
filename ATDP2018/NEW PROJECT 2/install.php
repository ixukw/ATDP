<html>
<body>
  <?php
    require_once "config.php";
    try {
      $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
      $query = file_get_contents("shop.sql"); //http://php.net/manual/en/function.file-get-contents.php, http://php.net/manual/en/pdo.exec.php
      $dbh->exec($query);
      echo "<p>Success!</p>";
    }
    catch (PDOException $e) {
      echo "<p>Error: {$e->getMessage()}</p>";
    }
  ?>
</body>
</html>
