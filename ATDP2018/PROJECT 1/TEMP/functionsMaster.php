<html>
  <body>
    <?php
      $correctAns = [];
      function makeMultipleChoiceQ($question, $allOptions, $correctOptionNum, $questionNumPos) {
        $correctAns[] = $correctOptionNum;
        echo "<h3>" . $question . "</h3>";
        foreach($allOptions as $option) {
          echo "<input type=\"radio\" name=\"q" . $questionNumPos . "\" value=\"" . $option . "\">" . $option . "<br>";
        }
      }
    ?>
  </body>
</html>
