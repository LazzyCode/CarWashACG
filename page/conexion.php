<?php

	function conectar(){
		$servername = "localhost";
		$dbname = "cwm";
		$username = "root";
		$password = "";

		// Crear conexion
		global $conex;
		$conex = new mysqli($servername, $username, $password, $dbname);
		// Checar conexion
		if ($conex->connect_error) {
		    die("Connection failed: " . $conex->connect_error);
		}
	}

	function desconectar(){
		mysqli_close($conex);
	}

?>
