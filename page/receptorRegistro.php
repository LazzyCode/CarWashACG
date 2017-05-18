<?php

	include "conexion.php";
	
	$conex=conectar();
	//Recibir datos
	$user = $_POST['user'];
	$pass = $_POST['pass'];
	$nombre = $_POST['name'];
	$apellidos = $_POST['lastName'];
	$direccion1 = $_POST['Colony'];
	$direccion2 = $_POST['calleYnumero'];
	$telefono = $_POST['telefono'];

	//Guardar usuario y contraseña del usuario
	$sql = "INSERT INTO usuarios (user, pass) VALUES ('$user', '$pass')";
	$conex->query($sql);

	//Buscar el id del usuario nuevo
	$sql = "SELECT id FROM usuarios WHERE user='$user'";
	$result = $conex->query($sql);

	$row = $result->fetch_assoc();
	$id=$row["id"];

	//Insertar la informacion personal del nuevo usuario
	$sql = "INSERT INTO infousuarios(id, nombre, apellido, colonia, calleYnumero, tel) 
	VALUES ($id, '$nombre', '$apellidos','$direccion1','$direccion2','$telefono')";
	$conex->query($sql);

	header("Location: esperaRegistro.php");  
	
	desconectar($conex);

?>