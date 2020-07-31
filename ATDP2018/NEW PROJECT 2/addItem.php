<?php session_start();
if (!isset($_SESSION['currentplayer'])||$_SESSION['currentplayer']!=="1") {
  header("Location: shoppage.php");
}
?>
<html>
<head>
  <title>
    ATDP Backdoor
  </title>
  <link href="dazzler.css" rel="stylesheet">
  <script
    src="https://code.jquery.com/jquery-3.3.1.js"
    integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
    crossorigin="anonymous"></script>
  </head>
  <body>
    <?php require_once("showTop.php");
    navbar(); ?>
    <div class="mainpage">
      <?php
        if (isset($_POST['item']) && isset($_POST['type']) && isset($_POST['cost']) && isset($_POST['description']) && isset($_POST['stock']) && isset($_POST['imgurl'])) {
          if (filter_var($_POST['cost'], FILTER_VALIDATE_FLOAT) && filter_var($_POST['stock'], FILTER_VALIDATE_INT)) {
            try {
              $sth = $dbh->prepare("INSERT INTO shop (`name`, `type`, `cost`, `description`, `stock`, `url`) VALUES (:name, :type, :cost, :description, :stock, :url)");
              $sth->bindValue(':name', $_POST["item"]);
              $sth->bindValue(':type', $_POST["type"]);
              $sth->bindValue(':cost', $_POST["cost"]);
              $sth->bindValue(':description', $_POST["description"]);
              $sth->bindValue(':stock', $_POST["stock"]);
              $sth->bindValue(':url', $_POST['imgurl']);
              $status=$sth->execute();
            }
            catch (PDOException $e) {
              echo "<p>ERROR!</p>";
            }
            echo "<h1>Success!</h1>";
          } else {
            echo "<h1>Something went wrong with your input.</h1>";
          }
        } else {
          echo "<h1>Something went wrong with your inputs...</h1>";
        }
      ?>
      <a href="adminpage.php">Return to Main Page.</a>
      <?php footer(); ?>
    </div>
  </body>
</html>
