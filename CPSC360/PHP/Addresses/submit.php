
<html>
<head>
	<title>Addresses</title>
</head>
<body>

<h1>THANK YOU!</h1>

<?php 
	$first  = $_POST['first' ];
	$last   = $_POST['last'  ];
	$street = $_POST['street'];
	$city   = $_POST['city'  ];
	$state  = $_POST['state' ];
	$zip    = $_POST['state' ];

	echo "<p>First Name: $first</p>";
	echo "<p>City: $city</p>";
	echo "<p>ZIP code: $zip</p>";


?>

</body>
</html>