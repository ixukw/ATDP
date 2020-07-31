<html>
  <body>
    <?php
    require_once("questions.php");
      $names = ["<h2>Firstname:</h2>"=>"fName",
                "<h2>Lastname:</h2>"=>"lName",
                "<h2>Age:</h2>"=>"age",
                "<h2>Your response to: Estimated Knowledge on computers:</h2>"=>"estIQ",
                "<h2>Your actual estimated knowledge on computers:</h2>"=>"actualIQ",
                "<h2>Feedback Rating:</h2>"=>"rate"];
      foreach($names as $i => $i_value) {
        if (empty($_POST[$i_value])) {
          echo "<h1>A field was left blank. Loop halted.</h1>";
          exit();
        } else {
          echo $i . htmlspecialchars($_POST[$i_value]);
        }
      }
    ?>
  </body>
</html>
