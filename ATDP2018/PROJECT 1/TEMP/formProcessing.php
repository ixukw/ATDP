<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css">
  <title>Output</title>
</head>
  <body>
    <?php
      $names = ["Firstname:"=>"fName",
                "Lastname:"=>"lName",
                "Age:"=>"age",
                "Your response to: Estimated Knowledge on computers:"=>"estIQ",
                #"Your actual estimated knowledge on computers:"=>"actualIQ",
                "Feedback Rating:"=>"rate",
                "Q1:"=>"q1",
                "Q2:"=>"q2",
                "Q3:"=>"q3",
                "Q4:"=>"q4",
                "Q5:"=>"q5",
                "Q6:"=>"q6",
                "Q7:"=>"q7",


                ];
      foreach($names as $i => $i_value) {
        if (empty($_POST[$i_value])) {
          echo "<h1>A field was left blank. Loop halted.</h1>";
          exit();
        } else {
          echo "<h4>" . $i . "</h4>" . htmlspecialchars($_POST[$i_value]);
        }
      }
    ?>
  </body>
</html>
