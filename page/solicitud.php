<?php

	//Iniciar Sesión
	session_start();

	//Validar si se está ingresando con sesión correctamente
	if (!$_SESSION){
	    header("location:index.php");   
	}

?>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Car Wash ACG</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="css/inicio.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js" integrity="sha384-0s5Pv64cNZJieYFkXYOTId2HMA2Lfb6q2nAcx2n0RTLUnCAoTTsS0nKEO27XyKcY" crossorigin="anonymous"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js" integrity="sha384-ZoaMbDF+4LeFxg6WdScQ9nnR1QC2MIRxA1O9KWEXQwns1G8UNyIEZIQidzb0T1fo" crossorigin="anonymous"></script>
    <![endif]-->

</head>

<section id="solicitud">
    <div class="login-form">
        <center>
            <a href="paginaUsuario.php">
                <img src="img/cwacg.jpg" class="img-rounded" width="100" height="90">
            </a>
        </center>
        <h1>Solicitud</h1>	  
		<form action="receptorSolicitud.php" method="post" accept-charset="utf-8">

			<div class="form-group ">
				<input type="text" class="form-control" placeholder="Nombre" id="Nombre" name="name" value="<?php echo $_SESSION['nombre'] ?>">
				<i class="fa fa-user"></i>
			</div>
			<div class="form-group ">
				<input type="text" class="form-control" placeholder="Apellido" id="Apellido" name="lastName" value="<?php echo $_SESSION['apellido'] ?>">
			</div>
			<div class="form-group ">
				<input type="text" class="form-control" placeholder="Colonia" id="Colonia" name="Colony" value="<?php echo $_SESSION['colonia'] ?>">
			</div>
			<div class="form-group ">
				<input type="text" class="form-control" placeholder="Calle y Numero" id="CalleNumero" name="calleYnumero" value="<?php echo $_SESSION['calleYnumero'] ?>">
			</div>
			<div class="form-group ">
				<input type="text" class="form-control" placeholder="Telefono Celular" id="Number" name="telefono" value="<?php echo $_SESSION['telefono'] ?>">
			</div>
			<!-- Variable tipo -time -->
			<div class="form-group ">
				<input type="time" class="form-control" placeholder="Hora" id="hora" name="hora" value="12:00">
				<i class="fa fa-clock-o"></i>
			</div>

			<!-- Fecha-->
			<div class="form-group ">
				<input type="date" class="form-control" placeholder="Fecha" id="fecha" name="fecha">
			</div>

			<div class="form-group log-status">
				<input type="password" class="form-control" placeholder="Confirmar Contraseña" id="Passwod2" name="pass">
				<i class="fa fa-lock"></i>
			</div>
				<!--<span class="alert">Datos Invalidos</span>
			   -->
			<button type="submit" class="log-btn" >Confirmar solicitud</button>
		</form>
	</div>	 
</section>

</body>

</html>