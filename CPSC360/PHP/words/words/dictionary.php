<html>

<head>
<title>Words Galore!</title>
<style type="text/css">
@import url(iwords.css);
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script language=JavaScript>
function verify( form, name ) {
  var text = form.elements[ name ];

  if ((text.value != null) && (text.value != "")) {
    return true;
  }
  alert("Input cannot be empty.");
  return false;
}

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


<?php
  
  $db = new mysqli('localhost', 'wordsuser', 'anonymous', 'words');

	//$letter = $_POST['letter'];

  if($_POST['letter']){
    $letter = $_POST['letter'];
  }
  else{
    echo "NO LETTER";
  }


  switch($letter){
    case 'A' : $page =  1; break;
    case 'B' : $page =  2; break;
    case 'C' : $page =  3; break;
    case 'D' : $page =  4; break;
    case 'E' : $page =  5; break;
    case 'F' : $page =  6; break;
    case 'G' : $page =  7; break;
    case 'H' : $page =  8; break;
    case 'I' : $page =  9; break;
    case 'J' : $page = 10; break;
    case 'K' : $page = 11; break;
    case 'L' : $page = 12; break;
    case 'M' : $page = 13; break;
    case 'N' : $page = 14; break;
    case 'O' : $page = 15; break;
    case 'P' : $page = 16; break;
    case 'Q' : $page = 17; break;
    case 'R' : $page = 18; break;
    case 'S' : $page = 19; break;
    case 'T' : $page = 20; break;
    case 'U' : $page = 21; break;
    case 'V' : $page = 22; break;
    case 'W' : $page = 23; break;
    case 'X' : $page = 24; break;
    case 'Y' : $page = 25; break;
    case 'Z' : $page = 26; break;
  }

  $array[1]  = "A";
  $array[2]  = "B";
  $array[3]  = "C";
  $array[4]  = "D";
  $array[5]  = "E";
  $array[6]  = "F";
  $array[7]  = "G";
  $array[8]  = "H";
  $array[9]  = "I";
  $array[10] = "J";
  $array[11] = "K";
  $array[12] = "L";
  $array[13] = "M";
  $array[14] = "N";
  $array[15] = "O";
  $array[16] = "P";
  $array[17] = "Q";
  $array[18] = "R";
  $array[19] = "S";
  $array[20] = "T";
  $array[21] = "U";
  $array[22] = "V";
  $array[23] = "W";
  $array[24] = "X";
  $array[25] = "Y";
  $array[26] = "Z";

  //TABS ACROSS TOP 
  echo "<div class=\"tab\">";
  echo "<button class=\"tabLinks\" onclick=\"openTab( event, 'Home' )\"><a style=text-decoration:none href=\"index.html\">Home</a></button>";
  for ($i=1; $i<27; $i+=1){
    if($i == $page){
      echo "<button class=\"tabLinks\" onclick=\"openTab( event, '$letter')\">$letter</button>";
    }
    else
      echo "<button class=\"tabLinks\" onclick=\"post( 'dictionary.php', {'letter':'$array[$i]'})\">$array[$i]</button>";
  }
  echo "<button class=\"tabLinks\" onclick=\"openTab( event, 'Admin' )\">Admin</button>";
  echo "</div>";


  //TAB CONTENT
  echo "<div id='$letter' class='tabContent'>";

  echo "<h2>$letter</h2>";

  echo "Number of entries: ";

  $selectletter = "select * from wordstable where entry like '$letter%'";
  $result = $db->query($selectletter);
  $rows = $result->num_rows;
  echo "<b>$rows</b>";

  for($i = 0; $i < $rows; $i+=1){
    $row = $result->fetch_assoc();
    $num = $i+1;

    printf("<br/>%u ------------ %s",$num, $row["entry"]);

    //echo "<br/>$num           " . $row["entry"];
  }
  echo "</div>";

  //ADMIN TAB
  echo "<div id='Admin' class='tabContent'>";
  echo "<h3>Admin</h3>";
  echo "<form action=\"password.php\" method=\"post\" onsubmit=\"return verify(this,'password');\">";
  echo "   <p>";
  echo "   Password";
  echo "   <input type=\"password\" name=\"password\" />";
  echo "   <input type=\"submit\"   value=\"Login\" />";
  echo "   </p>";
  echo "</form>";
  echo "</div>";


  echo "<script>";
  echo "var home = document.getElementsByClassName('tablinks')[$page];\n";
  echo "home.click();\n";
  echo "</script>";
	
?>

</body>

</html>