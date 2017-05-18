
<?php

	include "conexion.php";

	session_start();

	if (!$_SESSION){

	    header("location:index.php");   
	    
	}
	if($_SESSION['pass_usuario']==$_POST['pass']){

		$conex=conectar();

		$id=$_SESSION['id_usuario'];

        $hora=$_POST['hora'];
        $fecha=$_POST['fecha'];
		$nombre=$_POST['name'];
		$apellido=$_POST['lastName'];
		$colonia=$_POST['Colony'];
		$calleYnumero=$_POST['calleYnumero'];
		$telefono=$_POST['telefono'];
		$cantidad=$_POST['cantidad'];
        $costo=$cantidad*80;

        list($h, $m) = explode(":",$hora);
  		$s='00';
        list($anio, $mes, $dia) = explode("-",$fecha);
        $fechaCompleta=$anio."-".$mes."-".$dia." ".$h.":".$m.":".$s;

		$sql = "INSERT INTO solicitudes (idUsuario, nombre, apellido, colonia, calleYnumero, tel, cantidadServicio, costo,  fechaRequerida, ordenStatus) VALUES ('$id',          '$nombre', '$apellido', '$colonia', '$calleYnumero', '$telefono', $cantidad, $costo, '$fechaCompleta', 'Espera')";
		$conex->query($sql);

		header("Location: esperaSolicitud.php");  

		desconectar($conex);

	}else{

		header("location:solicitud.php");   

	}

?>