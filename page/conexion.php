<?php
	function conectar(){
		$servername = "localhost";
		$dbname = "cwm";
		$username = "root";
		$password = "";

		// Crear conexion
		$conex = new mysqli($servername, $username, $password, $dbname);
		// Checar conexion
		if ($conex->connect_error) {
		    die("Connection failed: " . $conex->connect_error);
		}
		return $conex;
	}

	function desconectar($conex){
		mysqli_close($conex);
	}

?>
