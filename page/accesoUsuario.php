<?php

	//Recibimos los datos enviados desde el formulario
	$user=$_POST['user'];
	$pass=$_POST['password'];

	//Proceso de conexión con la base de datos
	include "conexion.php";

	conectar();

	//Inicio de variables de sesión
	session_start();

	//Consultar si los datos están guardados en la base de datos
	$consulta= "SELECT * FROM usuarios WHERE user='$user' AND pass='$pass'";
	$resultado= mysqli_query($conex,$consulta);

	$registro = mysqli_fetch_array($resultado);
	//OPCIÓNs 1: Si el usuario NO existe o los datos son INCORRRECTOS
	if ($registro==NULL){ 
		header("location:inicio.php");	
	}
	//OPCIÓN 2: Usuario logueado correctamente
	else{

		//guardamos el id del usuario que ingreso
		$id_usuario=$registro['id'];
		$pass_usuario=$registro['pass'];

		//Se busca la informacion del usuario que acceso
		$consulta="SELECT * FROM infousuarios WHERE id='$id_usuario'";
		$resultado = mysqli_query($conex,$consulta);
		$registro = mysqli_fetch_array($resultado);

		$_SESSION['id_usuario'] = $id_usuario;
		$_SESSION['pass_usuario'] = $pass_usuario;
		$_SESSION['nombre'] = $registro['nombre'];
		$_SESSION['apellido'] =$registro['apellido'];
		$_SESSION['colonia']=$registro['colonia'];
		$_SESSION['calleYnumero']=$registro['calleYnumero'];
		$_SESSION['telefono']=$registro['tel'];

		header("Location: paginaUsuario.php");
	}

?>
