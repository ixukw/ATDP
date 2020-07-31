<!DOCTYPE html>
<html lang="en-US">
  <head>
    <title>P1: The Quiz</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <script
  src="https://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>
    <script src="scripts.js"></script>
  </head>
  <body>
    <?php
      require_once("functionsMaster.php");
      displayHeader("The Quiz on Computer Hardware");
    ?>
    <i>This really isn't as serious or hard as it looks. This quiz, if even, will test you on your knowledge of basic computer hardware.</i>
    <br><b>Your name will be recorded when you submit this form. Your age will be recorded when you submit this form. This form is compliant with copyright laws and privacy polices. This form will not steal, misuse, or sell your data to other companies without your discretion. By clicking submit for this form, you hereby agree that your responses may be interpreted in any shape, way, or form.</b>
    <form action="formProcessing.php" method="post">
      <div class="personal">
        <h2>I. Background Information</h2>
        <i>Fill out the following fields based on your personal information. Accurate responses please.</i><br><br>
        <b>Firstname:</b><br><div><input type="text" name="fName" required></div><br>
        <b>Lastname:</b><br><div><input type="text" name="lName" required></div><br>
        <b>Street Address:</b><br><div><input type="text" name="address" required></div><br>
        <b>Email:</b><br><div><input type="email" name="email" required></div><br>
        <b>Age:</b><br><div><input type="number" name="age" min="0" max="100" required></div><br>
        <b>In your mind, how good do you think you will do? (1-100%)</b><br><div><input type="number" name="estIQ" min="0" max="100" required></div><br>
      </div>
      <h2>II. Multiple Choice Section</h2>
      <i>Choose either the correct answer or best answer for each question. Only one answser can be selected, multiple answers are not supported.</i>
      <!--I am so sorry for the person who has to look at this. I used a php function to write this.-->
      <div class="mc">
      <?php
        makeMultipleChoiceQ("1. Generally speaking, there are 3 available sizes of motherboards. What are those 3 sizes?", ["Mini ITX, Micro ATX, ATX","Small ITX, Standard ITX, Enlarged ITX","ITX, Extended ITX, Intel ITX","Sizes are irrelevant and all cases are sold in one size."], 1, 1);
        makeMultipleChoiceQ("2. The role of RAM in the computer is to what?", ["Store permenant short term information.","Store temperary short term information.","Store temperary long term information.","Store permenant long term information."], 2, 2);
        makeMultipleChoiceQ("3. The <b>general</b> role of the GPU in the computer is to what?", ["Renders images/animations for the screen, stands for Graphics Processing Unit.","Renders ONLY the BIOS, stands for Graphical Processing User","Renders both images/animations for the screen AND the power supply.","The GPU is another CPU but instead of processing things it unprocesses things."], 3, 1);
        makeMultipleChoiceQ("4. The purpose of fans in a computer is to what?", ["Blow useless air round.","Kick up dust and be loud.","Cool the system and prevent it from overheating.","Bring cool air in and hot air out."], 4, 4);
        echo "<img alt=\"motherboardDiagram\" src=\"../images/motherboardDiagram.jpg\">";
        makeMultipleChoiceQ("5. What is object M in the picture above?", ["Motherboard Power Port","USB 3.0 Connector","FDD Header","Front Panel I/O Connector"], 5, 4);
        makeMultipleChoiceQ("6. What is object P in the picture above?", ["CMOS Battery","PCI Express Card Connector Battery","SATA Ports","USB 3.0 Connector"], 6, 1);
        echo "<img alt=\"PSUDiagram\" src=\"../images/PSUDiagram.png\" width=800 height=300>";
        makeMultipleChoiceQ("7. The image above is a picture of the cables from a power supply. What is the 3rd from the top cable?", ["Main Motherboard Power Connector","CPU Power Connector","SATA Power Connector","PCI E Power Connector"], 7, 2);
        makeMultipleChoiceQ("8. According to standards for ATX, how many screws are usually used to mount MOST ATX motherboards to the standoffs?", ["5","6","7","8"], 8, 2);
        makeMultipleChoiceQ("9. A power supply is considered to be called 'modular' because:", ["The power supply is able to be taken apart.","The power supply is able to have additional fans if necessary.","Cables can be unplugged from the PSU and plugged in if necessary.","Both A and C can be considered correct."], 9, 3);
        makeMultipleChoiceQ("10. What are some MAJOR differences between USB 2.0 and USB 3.0?", ["2.0 has a blue 'block' within the port, while 3.0 has a black one.","2.0 transfers at a rate of 4800 mbps, and 3.0 transfers at a rate of 48000 mbps.","USB 3.0 has a total 9 connector wires, while USB 2.0 has only 4.","USB 2.0 can send and receive data, while 3.0 can do two sets of send/receive data at once."], 10, 1);
      ?>
    </div>
      <h2>III. Free Response Section</h2><i>Your answers will be judged based on keywords in your response.</i>
      <div class="fr">
        <h3 class="questionBar">Question 11</h3><h3>11. What should you install first into the case (not onto the motherboard) before inserting the motherboard?</h3><textarea name="fr1" placeholder="Type your response here." required></textarea><br>
        <h3 class="questionBar">Question 12</h3><h3>12. What is Intel Integrated Graphics?</h3><textarea name="fr2" placeholder="Type your response here." required></textarea><br>
        <h3 class="questionBar">Question 13</h3><h3>13. Why should you wear anti-static wriststraps while building a PC or touching computer components? If you do not have anti-static wriststraps, what is an alternative solution that requires no extra cost? Be sure to describe both in your answer.</h3><textarea name="fr3" placeholder="Type your response here." required></textarea><br>
        <h3 class="questionBar">Question 14</h3><h3>14. What is the difference between LCD and LED monitors?</h3><textarea name="fr4" placeholder="Type your response here." required></textarea><br>
        <h3 class="questionBar">Question 15</h3><h3>15. When installing new hard drives into a PC, what are 2 cables that are required to be plugged into a hard drive?</h3><textarea name="fr5" placeholder="Type your response here." required></textarea><br>

        <h2>IV. Experimental Questions</h2><i>The SAT has these. Why can't I?</i>
        <h3>E1. On average, how many pins on the motherboard are needed to plug in a fan power connector?</h3><input type="number" name="ex1" min="0" max="100" required>
      </div>
      <h2>V. Self-Evaluation Questions</h2>
      <i>More filler than actual. You don't get these on the output page, just for your own self evaluation.</i><br><br>
      <b>Feedback Rating (1-10):</b><br><input type="number" name="rate" min="1" max="10" placeholder="10" required><br>
      <div><input type="submit" value="Evaluate!"></div>
      <progress max="100" value="0" id="progress" data-label="This is a progress bar."></progress>
      <?php displayFooter(); ?>
    </form>
  </body>
</html>
