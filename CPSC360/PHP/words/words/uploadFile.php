<html>
<head>
	<title>Words Galore!</title>
	<style type="text/css">
	@import url(iwords.css);
	</style>

<script language=JavaScript>
//
// based on: <https://www.w3schools.com/howto/howto_js_tabs.asp>
//
function openTab( event, id ) {
    // Get all elements with class="tabContent" and hide them
    tabContent = document.getElementsByClassName( "tabContent" );
    for (i = 0; i < tabContent.length; i++) {
        tabContent[i].style.display = "none";
    }

    // Get all elements with class="tabLinks" and remove the class "active"
    tabLinks = document.getElementsByClassName( "tabLinks" );
    for (i = 0; i < tabLinks.length; i++) {
        tabLinks[i].className = tabLinks[i].className.replace(" active", "");
    }

    // Show the current tab, and add an "active" class to the button that opened the tab
    document.getElementById( id ).style.display = "block";
    event.currentTarget.className += " active";
}

//
// based on: <https://stackoverflow.com/questions/133925/javascript-post-request-like-a-form-submit>
//
function post( file, map ) {
   var form = document.createElement("form");
   form.setAttribute( "method", "post");
   form.setAttribute( "action",  file );

   for (var key in map) {
       var hiddenField = document.createElement( "input" );
       hiddenField.setAttribute( "type", "hidden");
       hiddenField.setAttribute( "name",  key );
       hiddenField.setAttribute( "value", map[ key ]);

      form.appendChild( hiddenField );
    }
    document.body.appendChild( form );
    form.submit();
}
</script>
</head>
<body>

<div class="tab">
  <button class="tabLinks" onclick="openTab( event, 'Home' )"><a style=text-decoration:none href="index.html">Home</a></button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'A'})">A</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'B'})">B</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'C'})">C</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'D'})">D</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'E'})">E</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'F'})">F</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'G'})">G</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'H'})">H</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'I'})">I</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'J'})">J</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'K'})">K</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'L'})">L</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'M'})">M</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'N'})">N</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'O'})">O</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'P'})">P</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'Q'})">Q</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'R'})">R</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'S'})">S</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'T'})">T</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'U'})">U</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'V'})">V</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'W'})">W</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'X'})">X</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'Y'})">Y</button>
  <button class="tabLinks" onclick="post( 'dictionary.php', {'letter':'Z'})">Z</button>
  <button class="tabLinks" onclick="openTab( event, 'Admin'  )">Admin</button>
  </form>
</div>


<?php
	$okay = true;
	// Was the file uploaded
	if ($_FILES['uploaded']['error'] > 0){
		echo "<p>A problem was detected</p>";
		switch($_FILES['uploaded']['error']){
			case 1: echo '* File exceeded maximum size allowed by server.<br/>';      break;
			case 2: echo '* File exceeded maximum size allowed by application.<br/>'; break;
			case 3: echo '* File could not be fully uploaded.<br/>';                  break;
			case 4: echo '* File was not uploaded.<br/>';                             break;
		}
		$okay = false;
	}

	// Is the mime type correct
	if ($okay && $_FILES['uploaded']['type'] != 'text/plain'){
		echo 'A problem was detected:<br/>';
		echo '* File is not a text file.<br/>';
		$okay = false;
	}

	// Can the file be moved to my folder
	$filename = 'file.txt';
	if ($okay){
		if (is_uploaded_file($_FILES['uploaded']['tmp_name'])){
			if(!move_uploaded_file($_FILES['uploaded']['tmp_name'], $filename)){
				echo 'A problem was detected:<br/>';
				echo '* Could not copy file to final destination.<br/>';
				$okay = false;
			}
		}
		else{
			echo 'A problem was detected:<br/>';
			echo '* File to copy is not an uploaded file.<br/>';
			$okay = false;
		}
	}
	$pass = $_POST['password'];
	if($okay){

		//TAB CONTENT
		echo "<div id='Admin' class='tabContent'>";

		echo "<h2>Admin</h2>";
		echo '<h3>Uploading data</h3>';
		// Read and display file contents
		$file = fopen($filename, 'r');
		$fileContents = nl2br(fread($file, filesize($filename)));
		fclose($file);
		$pos = strpos($fileContents, '-<br');
		$sub = substr($fileContents, $pos+8);



		$arr = explode("\n", $sub);
		for($i = 0; $i < sizeof($arr); $i+=1){
			$arr[$i] = substr($arr[$i], 0, -6);
		}


		$db = new mysqli('localhost', 'wordsroot', $pass, 'words');

		$strq = "insert into wordstable values";
		$i = 0;
		for($i = 0; $i < sizeof($arr)-1; $i+=1){
			if ($i != 0)
				$strq = $strq.',';
			$strq = $strq."(\"$arr[$i]\")";
		}
		$strq = $strq.";";

		if($db->query($strq)){
			echo "Words added: ".$i;
		}
		else{
			echo "FAILURE";
		}
		
		echo "<br/>";
	}

	echo "<form action=\"password.php\" method=\"post\">";
    echo "<p>";
    echo "<input type=\"hidden\" name=\"password\" value=\"$pass\" />";
    echo "<input type=\"submit\"   value=\"Back to Admin\" />";
    echo "</p>";
    echo "</form>";
    echo "</div>";

    echo "<script>";
    echo "var home = document.getElementsByClassName('tablinks')[27];\n";
    echo "home.click();\n";
    echo "</script>";

?>


</body>
</html>