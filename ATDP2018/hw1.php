<!DOCTYPE html>
<html lang="en">
  <head>
    <title>HW1: Who... are... you?</title>
    <link rel="stylesheet" type="text/css" href="hw1.css">
  </head>
  <body>
    <h1>HW 1: Who... are... <i>you</i>?</h1>
    <div class="notForm">
      <h2>The Real You</h2>
      Hi, my name is Inan Xu, and I took the TIC class last year, and (obviously) am taking the AIC class this year. I enjoy programming and playing games, if anyone is interested I play league
      and some small casual games on Steam. Honestly, I don't really know who I am, since I never ask myself these questions. I'm pretty shy when it comes to talking in class, but it doesn't
      mean I don't interact with people during group activities or discussions. If you want to learn more, talk to me directly. But I highly advise to <b>not</b> do that.
      <h2>The Tech You</h2>
      If you're looking at this webpage, you can probably tell I like to get creative a lot with these homework assignments. Before I took TIC, I had previously coded in HTML and CSS, but
      I took it anyway to further improve my skills. Granted, most of it I already knew, but it was good to get a refresher before AIC, where many of the concepts I haven't worked with before.
      I first began teaching myself in 4th grade, when I got a laptop, and started with the simplistic .vbs scripts and codecademy. I also took the Programming in Java course in 2016.
      In terms of languages, I know the following languages well: Java, Javscript, HTML/CSS, Python. I barely know these languages: C++, Ruby, Swift, C#.
      If I had to name something I'm proud of, I guess you could consider the fact that I managed to get Andrej Karpathy's RNN working and successfully inputted my essays and got it to replicate
      it. (not overfitting)
    </div>
    <div class="form">
      <h2 class="form">The You Mediated Through Questions You'd Like to Ask Others</h2>
        <form class="form" action="https://gse6.soe.berkeley.edu:444/4DACTION/EchoInput">
          <h4>Gender</h4>
          <div class="radio">
            <input type="radio" name="gender" value="male">Male<br>
            <input type="radio" name="gender" value="female">Female<br>
            <input type="radio" name="gender" value="prefer not to say/other">Prefer not to say / Other<br>
          </div>
          <h4>Age</h4>
          <input class="textField" type="number" name="age" min="12" max="18">
          <h4>How comfortable are you using macOS?</h4>
          <select name="usability">
            <option value="comfortable">Comfortable</option>
            <option value="okay">Okay</option>
            <option value="not comfortable">Not Comfortable</option>
            <option value="not applicable" selected>N/A</option>
          </select>
          <h4>Read the instructions in the box.</h4>
          <textarea class="textField" rows="4" cols="50">Explain, in your opinion, your "pros / cons" of macOS.</textarea><br>
          <h4>Which operating systems have you used in the past? Check all that apply.</h4>
          <div class="checkbox">
            <input type="checkbox" name="os" value="xp">Windows XP<br>
            <input type="checkbox" name="os" value="vista">Windows Vista<br>
            <input type="checkbox" name="os" value="win7">Windows 7<br>
            <input type="checkbox" name="os" value="win10">Windows 10<br>
            <input type="checkbox" name="os" value="macLeopard">Mac OS X Leopard<br>
            <input type="checkbox" name="os" value="macMountain">Mac OS X Mountain Lion<br>
            <input type="checkbox" name="os" value="macYosemite">Mac OS X Yosemite<br>
            <input type="checkbox" name="os" value="macSierra">Mac OS X Sierra<br>
            <input type="checkbox" name="os" value="macHighSierra">Mac OS X High Sierra<br>
            <input type="checkbox" name="os" value="ubuntu">Any version of Linux<br>
          </div>
          <h4>Favorite OS</h4>
          <h6>Favorite: (Can be any OS in existence that has been, at some point, sold in the consumer market)</h6><br>
          <input class="textField" type="text" name="favOS"><br>
          <h4>Email</h4>
          <h6>Input your email to sign up for newsletters! These newsletter immediately get deleted upon entering your Inbox.</h6>
          <input class="textField" type="email" name="email">
          <br><input class="submit" type="submit">
        </form>
    </div>
    <a href="https://validator.w3.org">VALIDATION. Do I still need to put this at the bottom of each webpage?</a>
  </body>
</html>
<?php
    require "hw1JEN.html";
    require "hw1SAN.html";
?>
