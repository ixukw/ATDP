<html>
<body>
  <?php
    try {
      require 'config.php';
      date_default_timezone_set('America/Los_Angeles');
      $dbh = new PDO(DB_DSN, DB_USER, DB_PASSWORD);
      $sth = $dbh->prepare("SELECT * FROM shop");
      $sth->execute();
      $shop = $sth->fetchAll();
    }
    catch (PDOException $e) {
      echo "<p>ERROR!</p>";
    }
    var_dump($shop);
  ?>
  <form action="addItem.php" method="post">
    <h4>NAME</h4><input type="text" name="item">
    <h4>TYPE</h4><input type="text" name="type">
    <h4>COST</h4><input type="text" name="cost">
    <h4>STATUS</h4><input type="text" name="status">
    <h4>IMG URL</h4><input type="text" name="imgurl">
    <h4>IMG ALT</h4><input type="text" name="imgalt">
    <input type="submit" value="SUBMIT">
  </form>
</body>
</html>
