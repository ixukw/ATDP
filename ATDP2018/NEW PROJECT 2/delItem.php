<?php session_start();
if (!isset($_SESSION['currentplayer'])) {
  header("Location: shoppage.php");
}
?>
<html>
<head>
  <title>
  </title>
  <link href="dazzler.css" rel="stylesheet">
  <script
    src="https://code.jquery.com/jquery-3.3.1.js"
    integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
    crossorigin="anonymous"></script>
  <script src="shop.js"></script>
</head>
<body>
    <?php require_once("showTop.php");
    navbar();
    ?>
    <div class="mainpage">
  <?php
    if (isset($_SESSION['currentplayer'])) {
      try {
        $sth = $dbh->prepare("DELETE FROM shop WHERE id=:idGiven");
        $sth->bindValue(':idGiven', $_POST["id"]);
        $status=$sth->execute();
      }
      catch (PDOException $e) {
        echo "<p>ERROR!</p>";
      }
      if ($status==true) {
          echo "<h2>Successfully deleted.</h2>";
      }
    }
  ?>
  <a href="adminpage.php">Return to adminpage</a>.
<?php footer(); ?>
  </div>
</body>
</html>
