<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en-US">
<head>
  <link rel="stylesheet" type="text/css" href="style.css">
  <title>Output</title>
</head>
  <body>
    <?php
      /*
        There is a small story behind my coding style. For a while, I programmed on the TI-84+, and you probably know that code on there looks horrific. I got used to looking at
        poorly formatted code. So, some of the echo statements are a bit messy. Sorry.
      */
      $totalCorrect=0;
      $emptyNames2=false;
      require_once("functionsMaster.php");
      displayHeader("Your Responses");
      $names = [
        # I hate doing this manually but I couldn't figure out PHP Sessions and associative arrays and adding stuff.
        "1. There are 3 general different sizes of computer cases for the consumer market. What are those 3 sizes?"=>"q1",
        "2. The role of RAM in the computer is to what?"=>"q2",
        "3. The <b>general</b> role of the GPU in the computer is to what?"=>"q3",
        "4. The purpose of fans in a computer is to what?"=>"q4",
        "5. What is object M?"=>"q5",
        "6. What is object P?"=>"q6",
        "7. The image above is a picture of the cables from a power supply. What is the 3rd from the top cable?"=>"q7",
        "8. According to standards for ATX, how many screws are usually used to mount MOST ATX motherboards to the standoffs?"=>"q8",
        "9. A power supply is considered to be called 'modular' because:"=>"q9",
        "10. What are some MAJOR differences between USB 2.0 and USB 3.0?"=>"q10",

        /*"11. What should you install first into the case (not onto the motherboard) before inserting the motherboard?"=>"fr1",
        "12. What is Intel Integrated Graphics?"=>"fr2",
        "13. Why should you wear anti-static wriststraps while building a PC or touching computer components? If you do not have anti-static wriststraps, what is an alternative solution that requires no extra cost? Be sure to describe both in your answer."=>"fr3",
        "14. What is the difference between LCD and LED monitors?"=>"fr4",
        "15. When installing new hard drives into a PC, what are 2 cables that are required to be plugged into a hard drive?"=>"fr5",
        "E1. On average, how many pins on the motherboard are needed to plug in a fan power connector?"=>"ex1",
        "Your response to your own estimated knowledge on computers:"=>"estIQ"*/
      ];
      $names2 =
      [
        "11. What should you install first into the case (not onto the motherboard) before inserting the motherboard?"=>"fr1",
        "12. What is Intel Integrated Graphics?"=>"fr2",
        "13. Why should you wear anti-static wriststraps while building a PC or touching computer components? If you do not have anti-static wriststraps, what is an alternative solution that requires no extra cost? Be sure to describe both in your answer."=>"fr3",
        "14. What is the difference between LCD and LED monitors?"=>"fr4",
        "15. When installing new hard drives into a PC, what are 2 cables that are required to be plugged into a hard drive?"=>"fr5",
        "16. On average, how many pins on the motherboard are needed to plug in a fan power connector?"=>"ex1"
      ];
      $correctAns = [
        "Mini ITX, Micro ATX, ATX",
        "Store temperary short term information.",
        "Renders images/animations for the screen, stands for Graphics Processing Unit.",
        "Bring cool air in and hot air out.",
        "Front Panel I/O Connector",
        "CMOS Battery",
        "Main Motherboard Power Connector",
        "6",
        "Cables can be unplugged from the PSU and plugged in if necessary.",
        "USB 3.0 has a total 9 connector wires, while USB 2.0 has only 4.",
        "I/O Shield, Screw it onto the case, Motherboard backplate", //fr 1
        "Intel Graphics, CPU, Graphics Card in CPU, Cheaper", //fr 2
        "Grounding yourself, Static Electricity, Prevent Shocks", //fr 3
        "Thinner, Sharper, Glare, Viewing Angles", //fr 4
        "SATA Power, SATA Cable, Memory Cable", //fr 5
        "3"
      ];
      if (filter_var($_POST["email"], FILTER_VALIDATE_EMAIL) && filter_var($_POST["age"], FILTER_VALIDATE_INT) && filter_var($_POST["estIQ"], FILTER_VALIDATE_INT) && filter_var($_POST["ex1"], FILTER_VALIDATE_INT) && filter_var($_POST["rate"], FILTER_VALIDATE_INT) && is_string($_POST["fName"])==true
          && is_string($_POST["lName"])==true) {
        echo
        "<h2>I. Personal</h2>
        <h4>According to what you input, your name is " . htmlspecialchars($_POST["fName"]) . " " . htmlspecialchars($_POST["lName"]) . " and you apparently live at " . htmlspecialchars($_POST["address"]) . ".<br>
        Nice job for inputting a real email. Whether it sends to an actual inbox or not, is questionable.
        <br>Your email: " . htmlspecialchars($_POST["email"]) . ".
        <br>You are " . htmlspecialchars($_POST["age"]) . " years old.
        </h4>
        <h2>II. Multiple Choice Answers</h2>";
        foreach($names as $i => $i_value) {
          if (isset($_POST[$i_value])== false) {
            echo "<h1>A field was left blank. Loop halted.</h1>";
            exit();
          } else {
            if ($_POST[$i_value] == $correctAns[$i-1]) {
              $totalCorrect++;
              echo "<div class=\"correct\"><h4>" . $i . "</h4>Your Answer: " . htmlspecialchars($_POST[$i_value]) . "<br><br><i>You got this question correct.</i></div>";
            } else {
              echo "<div class=\"incorrect\"><h4>" . $i . "</h4>Your Answer: " . htmlspecialchars($_POST[$i_value]) . "<h4>Correct Answer: " . $correctAns[$i-1] . "</h4></div>";
            }
          }
        }
        foreach($names2 as $i => $i_value) {
          if (isset($_POST[$i_value])==false) {
            echo "<h1>A field was left blank. Loop halted.</h1>";
            exit();
            $emptyNames2=true;
          }
        }
        if ($emptyNames2==false) {
          echo "<h2>III. Free Response Answers</h2><i>Please note: Keywords specified are not exact keywords.</i>";
          // I'm sorry about this. I never got my loop working with the free response questions.
          if (strpos($_POST["fr1"], "shield")!==false || strpos($_POST["fr1"], "i/o")!==false || strpos($_POST["fr1"], "onto the case")!==false || strpos($_POST["fr1"], "backplate")!==false) {
            $totalCorrect++;
            echo "<div class=\"correct\"><h4>" . "11. What should you install first into the case (not onto the motherboard) before inserting the motherboard?" . "</h4>Your Answer: " . htmlspecialchars($_POST["fr1"]) . "<br><br><i>You got this question correct.</i></div>";
          } else {
            echo "<div class=\"incorrect\"><h4>" . "11. What should you install first into the case (not onto the motherboard) before inserting the motherboard?" . "</h4>Your Answer: " . htmlspecialchars($_POST["fr1"]) . "<h4>Acceptable Keywords: " . $correctAns[10] . "</h4></div>";
          }
          if (strpos($_POST["fr2"], "intel graphics")!==false || strpos($_POST["fr2"], "cpu")!==false || strpos($_POST["fr2"], "graphics card")!==false || strpos($_POST["fr2"], "cheaper")!==false) {
            $totalCorrect++;
            echo "<div class=\"correct\"><h4>" . "12. What is Intel Integrated Graphics?" . "</h4>Your Answer: " . htmlspecialchars($_POST["fr2"]) . "<br><br><i>You got this question correct.</i></div>";
          } else {
            echo "<div class=\"incorrect\"><h4>" . "12. What is Intel Integrated Graphics?" . "</h4>Your Answer: " . htmlspecialchars($_POST["fr2"]) . "<h4>Acceptable Keywords: " . $correctAns[11] . "</h4></div>";
          }
          if (strpos($_POST["fr3"], "grounding")!==false || strpos($_POST["fr3"], "shocks")!==false || strpos($_POST["fr3"], "static electricity")!==false || strpos($_POST["fr3"], "prevent")!==false) {
            $totalCorrect++;
            echo "<div class=\"correct\"><h4>" . "13. Why should you wear anti-static wriststraps while building a PC or touching computer components? If you do not have anti-static wriststraps, what is an alternative solution that requires no extra cost? Be sure to describe both in your answer." . "</h4>Your Answer: " . htmlspecialchars($_POST["fr3"]) . "<br><br><i>You got this question correct.</i></div>";
          } else {
            echo "<div class=\"incorrect\"><h4>" . "13. Why should you wear anti-static wriststraps while building a PC or touching computer components? If you do not have anti-static wriststraps, what is an alternative solution that requires no extra cost? Be sure to describe both in your answer." . "</h4>Your Answer: " . htmlspecialchars($_POST["fr3"]) . "<h4>Acceptable Keywords: " . $correctAns[12] . "</h4></div>";
          }
          if (strpos($_POST["fr4"], "thinner")!==false || strpos($_POST["fr4"], " sharper ")!==false || strpos($_POST["fr4"], " glare ")!==false || strpos($_POST["fr4"], "angle")!==false) {
            $totalCorrect++;
            echo "<div class=\"correct\"><h4>" . "14. What is the difference between LCD and LED monitors?" . "</h4>Your Answer: " . htmlspecialchars($_POST["fr4"]) . "<br><br><i>You got this question correct.</i></div>";
          } else {
            echo "<div class=\"incorrect\"><h4>" . "14. What is the difference between LCD and LED monitors?" . "</h4>Your Answer: " . htmlspecialchars($_POST["fr4"]) . "<h4>Acceptable Keywords: " . $correctAns[13] . "</h4></div>";
          }
          if (strpos($_POST["fr5"], "SATA")!==false && strpos($_POST["fr5"], "power")!==false || strpos($_POST["fr5"], "sata power")!==false || strpos($_POST["fr5"], "memory cable")!==false) {
            $totalCorrect++;
            echo "<div class=\"correct\"><h4>" . "15. When installing new hard drives into a PC, what are 2 cables that are required to be plugged into a hard drive?" . "</h4>Your Answer: " . htmlspecialchars($_POST[$i_value]) . "<br><br><i>You got this question correct.</i></div>";
          } else {
            echo "<div class=\"incorrect\"><h4>" . "15. When installing new hard drives into a PC, what are 2 cables that are required to be plugged into a hard drive?" . "</h4>Your Answer: " . htmlspecialchars($_POST["fr5"]) . "<h4>Acceptable Keywords: " . $correctAns[14] . "</h4></div>";
          }
          echo "<h2>IV. Experimental Answers</h2>";
          if ($_POST["ex1"] == 3) {
            $totalCorrect++;
            echo "<div class=\"correct\"><h4>" . "16. On average, how many pins on the motherboard are needed to plug in a fan power connector?" . "</h4>Your Answer: " . htmlspecialchars($_POST[$i_value]) . "<br><br><i>You got this question correct.</i></div>";
          } else {
            echo "<div class=\"incorrect\"><h4>" . "16. On average, how many pins on the motherboard are needed to plug in a fan power connector?" . "</h4>Your Answer: " . htmlspecialchars($_POST[$i_value]) . "<h4>Acceptable Keywords: " . $correctAns[15] . "</h4></div>";
          }
        }
        $error = round(abs(($totalCorrect-$_POST["estIQ"]))/$_POST["estIQ"] * 100, 2);
        $accuracy = 100-$error;
        echo "<h3>You got " . $totalCorrect . " correct out of a possible 16. That is " . round($totalCorrect/16, 4)*100 . "%</h3>";
        echo "<h3 class=\"end\">Your original guess: " . $_POST["estIQ"] . ". Accuracy: " . $accuracy . "%</h3>";
        if ($accuracy<0) {
          echo "<h3>How do you guess that poorly? You don't even know yourself? I can't believe you got a negative accuracy.</h3>";
        } elseif ($accuracy>=0 && $accuracy<50) {
          echo "<h3>Your guessing? Not terrible. Not good.</h3>";
        } elseif ($accuracy>=50 && $accuracy<100) {
          echo "<h3>Guessing? Good. Not great, but good.</h3>";
        } elseif ($accuracy>=100) {
          echo "<h3>Clearly, this isn't your original guess.</h3>";
        }
      } else {
        echo "<h1>One of the fields is incorrect and/or modified by the user. Possible wrong fields: Email, Personal, Free Responses. This form will not parse any of the given data.</h1>";
      }
      echo "<a href=\"questions.php\" class=\"button\">Start a new quiz.</a>";
      displayFooter();
    ?>
  </body>
</html>
