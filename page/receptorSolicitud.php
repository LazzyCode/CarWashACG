
<?php

	include "conexion.php";

	session_start();

	if (!$_SESSION){

	    header("location:index.php");   
	    
	}
	if($_SESSION['pass_usuario']==$_POST['pass']){

		conectar();

		$id=$_SESSION['id_usuario'];
		$consulta = "SELECT * FROM infousuarios WHERE id='$id'";
		//$tildes = $conex->query("SET NAMES 'utf8"); 
		$resultado= mysqli_query($conex,$consulta);
		$row = mysqli_fetch_array($resultado);

		$nombre=$_POST['name'];
		$apellido=$_POST['lastName'];
		$colonia=$_POST['Colony'];
		$calleYnumero=$_POST['calleYnumero'];
		$telefono=$_POST['telefono'];

		$sql = "INSERT INTO solicitudes (idUsuario, nombre, apellido, colonia, calleYnumero, tel, costo, ordenStatus) VALUES ('$id', '$nombre', '$apellido', '$colonia', '$calleYnumero', '$telefono', 80, 'Espera')";
		$conex->query($sql);

		$conex->close();

		header("Location: esperaSolicitud.php");  

		desconectar();

	}else{

		header("location:solicitud.php");   

	}

?>