<!DOCTYPE html>
<html>
<body>
<?php
	include "conexion.php";
	
	$user = $_POST['user'];
	$pass = $_POST['pass'];
	$nombre = $_POST['name'];
	$apellidos = $_POST['lastName'];
	$direccion1 = $_POST['Colony'];
	$direccion2 = $_POST['calleYnumero'];
	$telefono = $_POST['telefono'];

	// $consulta = "SELECT * FROM usuarios WHERE user = '.$user.' AND pass = '.$pass.'"; 
	// $conn->query($consulta);

	// if($consulta){
		$sql = "INSERT INTO usuarios (user, pass) VALUES ('$user', '$pass')";
		$conn->query($sql);
	
		$sql = "SELECT id FROM usuarios WHERE user='$user'";
		$result = $conn->query($sql);
	
		$row = $result->fetch_assoc();
		$id=$row["id"];
		
		$sql = "INSERT INTO infousuarios(id, nombre, apellido, colonia, calleYnumero, tel) 
		VALUES ($id, '$nombre', '$apellidos','$direccion1','$direccion2','$telefono')";
		$conn->query($sql);
	
		$sql = "SELECT id, nombre, apellido, colonia, calleYnumero, tel FROM infousuarios";
		$result = $conn->query($sql);

		
	// } else { 
	// 	print "El usuario ya existe"; 
	// }
	$conn->close();
?>
</body>
</html>
