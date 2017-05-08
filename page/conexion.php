<!DOCTYPE html>
<html>
<body>
<?php
	$servername = "localhost";
	$dbname = "cwm";
	$username = "root";
	$password = "";

	// Crear conexion
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Checar conexion
	if ($conn->connect_error) {
	    die("Connection failed: " . $conn->connect_error);
	}
?>
</body>
</html>
