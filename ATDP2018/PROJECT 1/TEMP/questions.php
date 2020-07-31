<!DOCTYPE html>
<html>
  <head>
    <title>Questions</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
    <?php
      require_once("functionsMaster.php");
    ?>
    <!-- CONVERT TO FUNCTION LATER -->
    <h1>The Quiz Public Alpha Test</h1>
    <form action="formProcessing.php" method="post">
      <h1>Bg info</h1>
      Firstname:<br><input type="text" name="fName" required><br>
      Lastname:<br><input type="text" name="lName" required><br>
      Age:<br><input type="number" name="age" required><br>
      YOUR Estimated Knowledge on computer hardware in your computer: (1-50)<br><input required type="number" name="estIQ" min="1" max="50"><br>

      <h1>Actual Computer Qs Multiple Choice Section</h1>
      <?php
        makeMultipleChoiceQ("There are 3 different sizes of computer cases for the consumer market. What are those 3 sizes?", ["Mini ITX, ITX, Extended ITX","Small ITX, Standard ITX, Enlarged ITX","ITX, Extended ITX, Intel ITX","Sizes are irrelevant and all cases are sold in one size."], 1, 1);
      ?>
      <h2>There are 3 different sizes of computer cases for the consumer market. What are those 3 sizes?</h2>
      <input type="radio"  name="q1" value="Mini ITX, ITX, Extended ITX">Mini ITX, ITX, Extended ITX<br>
      <input type="radio" name="q1" value="Small ITX, Standard ITX, Enlarged ITX">Small ITX, Standard ITX, Enlarged ITX<br>
      <input type="radio" name="q1" value="ITX, Extended ITX, Intel ITX">ITX, Extended ITX, Intel ITX<br>
      <input type="radio" name="q1" value="Sizes are irrelevant and all cases are sold in one size.">Sizes are irrelevant and all cases are sold in one size.<br>

      <h2>The role of RAM in the computer is to what?</h2>

      <input type="radio" name="q2" value="Store permenant short term information.">Store permenant short term information.<br>
      <input type="radio" name="q2" value="Store temperary short term information.">Store temperary short term information.<br>
      <input type="radio" name="q2" value="Store temperary long term information.">Store temperary long term information.<br>
      <input type="radio" name="q2" value="Store permenant long term information.">Store permenant long term information.<br>

      <h2>The <b>general</b> role of the GPU in the computer is to what?</h2>
      <input type="radio" name="q3" value="Renders images/animations for the screen, stands for Graphics Processing Unit.">Renders images/animations for the screen, stands for Graphics Processing Unit.<br>
      <input type="radio" name="q3" value="Renders ONLY the BIOS, stands for Graphical Processing User">Renders ONLY the BIOS, stands for Graphical Processing User<br>
      <input type="radio" name="q3" value="Renders both images/animations for the screen AND the power supply.">Renders both images/animations for the screen AND the power supply.<br>
      <input type="radio" name="q3" value="The GPU is another CPU but instead of processing things it unprocesses things.">The GPU is another CPU but instead of processing things it unprocesses things.<br>

      <h2>The purpose of fans in a computer is to what?</h2>
      <input type="radio" name="q4" value="Blow useless air round.">Blow useless air round.<br>
      <input type="radio" name="q4" value="Kick up dust and be useless.">Kick up dust and be useless.<br>
      <input type="radio" name="q4" value="Cool the system and prevent it from overheating.">Cool the system and prevent it from overheating.<br>
      <input type="radio" name="q4" value="Look cool when it doesn't have lights.">Look cool when it doesn't have lights.<br>

      <h2>The image below is a picture of a motherboard diagram in a manual. What is object M?</h2><!-- ANSWER: FRONT PANEL I/O CONNECTOR-->
      <img src="motherboardDiagram.jpg" width=70% height=70%><br>
      <input type="radio" name="q5" value="Motherboard Power Port">Motherboard Power Port<br>
      <input type="radio" name="q5" value="USB 3.0 Connector">USB 3.0 Connector<br>
      <input type="radio" name="q5" value="PCI Express x1 Card Connector">PCI Express x1 Card Connector<br>
      <input type="radio" name="q5" value="Front Panel I/O Connector">Front Panel I/O Connector<br>

      <h2>The image below is a picture of a motherboard diagram in a manual. What is object P?</h2>
      <img src="motherboardDiagram.jpg" width=70% height=70%><br>
      <input type="radio" name="q6" value="RAM Slots">CMOS Battery<br>
      <input type="radio" name="q6" value="PCI Express Card Connector">PCI Express Card Connector Battery<br>
      <input type="radio" name="q6" value="SATA Ports">SATA Ports<br>
      <input type="radio" name="q6" value="USB 3.0 Connector">USB 3.0 Connector<br>

      <h2>The image below is a picture of the cables from a power supply. What is the 3rd from the top cable?</h2>
      <img src="PSUDiagram.png" width=70% height=70%><br>
      <input type="radio" name="q7" value="CPU Power Connector">CPU Power Connector<br>
      <input type="radio" name="q7" value="Main Motherboard Power Connector">Main Motherboard Power Connector<br>
      <input type="radio" name="q7" value="SATA Power Connector">SATA Power Connector<br>
      <input type="radio" name="q7" value="PCI E Power Connector">PCI E Power Connector<br>

      <h3>More Questions after I finish the function makeQuestion()</h3>
      <input type="number" name="rate" min="1" max="50" required>Feedback Rating (1-10):<br>
      <input type="submit">
    </form>
  </body>
</html>
