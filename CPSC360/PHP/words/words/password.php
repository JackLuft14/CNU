<html>
<head>
	<title>Words Galore!</title>
	<style type="text/css">
	@import url(iwords.css);
	</style>

  <SCRIPT language=JavaScript>
    function verify(form){
      file = form.elements["uploaded"];
      if((file.value != null) && (file.value != "" )){
        return confirm("Upload file?\n" + file.value);
      }
      alert("File was not chosen.");
      return false;
    }
    function verdelete(form){
      return confirm("All data will be deleted. Proceed?");
    }
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
	$pass = $_POST['password'];

  //TAB CONTENT
  echo "<div id='Admin' class='tabContent'>";

  $db = new mysqli('localhost', 'wordsroot', $pass, 'words');

  echo "<h2>Admin</h2>";

	if($db->connect_errno){
    echo "<h3>Incorrect Password</h3>";
    echo "<p><a style=\"text-decoration:none\" href=\"index.html\">";
    echo "<input type=\"submit\" value=\"Try again\" /></a></p>";
	}

	else{
		$pass = $_POST['password'];
		echo "<h3>Upload data</h3>";
		echo "<form enctype=\"multipart/form-data\" action=\"uploadFile.php\" method=\"post\"";
    echo "onsubmit=\"return verify(this);\">";
    echo "<input type=\"hidden\" name=\"password\" value=\"$pass\" />";
		echo "Filename <input type=\"file\" name=\"uploaded\" size=\"30\" />";
		echo "<input type=\"submit\" value=\"Upload\" />";
		echo "</form>";

    echo "<h3>Delete data</h3>";
    echo "<form enctype=\"multipart/form-data\" action=\"delete.php\" method=\"post\"";
    echo "onsubmit=\"return verdelete(this);\">";
    echo "<input type=\"hidden\" name=\"password\" value=\"$pass\" />";
    echo "<input type=\"submit\" value=\"Delete\" />";
    echo "</form>";

    echo "<p><a style=\"text-decoration:none\" href=\"index.html\">";
    echo "<input type=\"submit\" value=\"Logout\" /></a></p>";
		
		
	}
  echo "</div>";

  echo "<script>";
  echo "var home = document.getElementsByClassName('tablinks')[27];\n";
  echo "home.click();\n";
  echo "</script>";

?>


</body>
</html>