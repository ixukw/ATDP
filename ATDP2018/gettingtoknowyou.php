<html>
<head>
    <title>X2: Getting to Know You Form</title>
    <link rel="stylesheet" type="text/css" href="hw1.css">
</head>
<body>
<h2 class="form">The You Mediated Through Questions You'd Like to Ask Others</h2>
  <form class="form" action="printout.php" method="post">
	<h4>Gender</h4>
	<div class="radio">
	  <input type="radio" name="gender" value="Male">Male<br>
	  <input type="radio" name="gender" value="Female">Female<br>
	  <input type="radio" name="gender" value="Prefer not to say / Other">Prefer not to say / Other<br>
	</div>
	<h4>Age</h4>
	<input class="textField" type="number" name="age" min="12" max="18">
	<h4>How comfortable are you using macOS?</h4>
	<select name="usability">
	  <option value="Comfortable">Comfortable</option>
	  <option value="Okay">Okay</option>
	  <option value="Not comfortable">Not Comfortable</option>
	  <option value="Not applicable" selected>N/A</option>
	</select>
	<h4>Read the instructions in the box.</h4>
	<textarea class="textField" rows="4" cols="50">Explain, in your opinion, your "pros / cons" of macOS.</textarea><br>
	<h4>Which operating systems have you used in the past? Check all that apply.</h4>
	<div class="checkbox">
	  <input type="checkbox" name="os" value="Windows XP">Windows XP<br>
	  <input type="checkbox" name="os" value="Windows Vista">Windows Vista<br>
	  <input type="checkbox" name="os" value="Windows 7">Windows 7<br>
	  <input type="checkbox" name="os" value="Windows 10">Windows 10<br>
	  <input type="checkbox" name="os" value="Mac OS X leopard">Mac OS X Leopard<br>
	  <input type="checkbox" name="os" value="Mac OS X Mountain Lion">Mac OS X Mountain Lion<br>
	  <input type="checkbox" name="os" value="Mac OS X Yosemite">Mac OS X Yosemite<br>
	  <input type="checkbox" name="os" value="Mac OS X Sierra">Mac OS X Sierra<br>
	  <input type="checkbox" name="os" value="Mac OS X High Sierra">Mac OS X High Sierra<br>
	  <input type="checkbox" name="os" value="Any version of Linux">Any version of Linux<br>
	</div>
	<h4>Favorite OS</h4>
	<h6>Favorite: (Can be any OS in existence that has been, at some point, sold in the consumer market)</h6><br>
	<input class="textField" type="text" name="favOS"><br>
	<h4>Email</h4>
	<h6>Input your email to sign up for newsletters! These newsletter immediately get deleted upon entering your Inbox.</h6>
	<input class="textField" type="email" name="email">
	<br><input class="submit" type="submit">
  </form>
  </body>
  </html>
