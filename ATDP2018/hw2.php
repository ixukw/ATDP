<!DOCTYPE html>
<html lang="en-US">
<head>
  <title>HW2: Spoiler Alert</title>
  <link rel="stylesheet" href="hwStyle.css">
  <!-- It was easier to use internal!-->
  <style>
    .hot {
      color: red;
      font-weight: bold;
      background-color: darkorange;
    }
    table {
      border: 2px solid black;
      margin: auto;
      padding: 2%;
      font-size: 20px;
    }
    tr {
      padding: 5%;
    }
    td {
      padding-left: 1%;
      padding-bottom: 2%;
      padding-top: 2%;
      background-color: #66FFFF;
    }
    th {
      text-align: left;
      padding-left: 10px;
      background-color: #66ccff;
      font-size: 40px;
    }
  </style>
</head>
<body>
  <h1>HW2: Spoiler Alert</h1>
  <table>
    <tr><th>Hot</th><th>Takes</th>
    <?php
      $popCulture = ["Hot Dog"=>"A hot dog license was sold for $5 billion.","OS X"=>"Teen makes his own OS X called OS Y.","Hot takes"=>"Confusion comes to hot takes. What are they anyway?","Disney"=>"Disney should've gone nuclear. They did today.","TBBT"=>"Season 12 announced.","Pepperidge Farms"=>"Goldfish are now discontinued.","North Korea on 'fire'"=>"Forest set ablaze yesterday, fire as tall as 1000km."];
      ksort($popCulture);
      foreach($popCulture as $i => $i_value) {
        echo "<tr>";
        if (strpos($popCulture[$i], "hot") !== false || strpos($popCulture[$i], "fire") !== false) {
          echo "<td class=\"hot\">" . $i . "</td><td class=\"hot\">" . str_rot13($i_value) . "</td>";
        } else {
          echo "<td>" . $i . "</td>" . "<td>" . str_rot13($i_value) . "</td>";
        }
        echo "</tr>";
      }
    ?>
  </table>
</body>
</html>
