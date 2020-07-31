<?php
      $userAnswers = [];
      $correctAns =
      [ #I couldn't figure it out so right now its just an ugly manual array. All the capability to do it automatically is there except the writing to it within the function part.
        "Mini ITX, Micro ATX, ATX",
        "Store temperary short term information.",
        "Renders images/animations for the screen, stands for Graphics Processing Unit.",
        "Cool the system and prevent it from overheating.",
        "Front Panel I/O Connector",
        "CMOS Battery",
        "Main Motherboard Power Connector",
        "6",
        "Cables can be unplugged from the PSU and plugged in if necessary.",
        "USB 3.0 has a total 9 connector wires, while USB 2.0 has only 4.",
      ];
      $outputToFormProcArray = array();

      function makeMultipleChoiceQ($question, $allOptions, $questionNumPos, $correctOptionNum) {
        echo
        "
        <h3 class=\"questionBar\">Question " . $questionNumPos . " </h3>
        ";
        echo "<div>";
        echo "<h3>" . $question . "</h3>";
        foreach($allOptions as $option) {
          echo "<input type=\"radio\" name=\"q" . $questionNumPos . "\" value=\"" . $option . "\" required>" . $option . "<br>";
        }
        echo "</div>";
      }
      function displayHeader($header) {
        echo "<img src=\"../images/atdpcorplogo.png\" alt=\"professional official atdpcorp totally real logo\" class=\"headerImg\">";
        echo "<h1 class=\"header\">{$header}</h1>";
      }
      function displayFooter() {
        echo "<footer>
        <h3>ATDP Corporation</h3>
        <i>Official Quiz on Computer Hardware</i><br>
        <i>Unofficial Copyright 2018 ATDP Corp. All rights reserved to nothing. Unauthorized reproduction is completely legal.</i><br>
        <a href=\"https://atdpsites.berkeley.edu/validate\">HTML5 Validation</a>
        </footer>";
      }
?>
