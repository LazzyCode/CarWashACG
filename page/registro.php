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

<section id="registro">
  <div class="login-form">
        <center>
            <a href="index.php">
                <img src="img/cwacg.jpg" class="img-rounded" width="100" height="90">
            </a>
        </center>
       <h1>Solicitud</h1>
	  
       <div class="form-group ">
		   
	<form action="receptorRegistro.php" method="post" accept-charset="utf-8">
		
			 <input type="text" class="form-control" placeholder="Usuario" id="usuario" name="user" >
			 <i class="fa fa-user"></i>
		   </div>
		   <div class="form-group ">
			 <input type="text" class="form-control" placeholder="Nombre" id="Nombre" name="name">
			 <i class="fa fa-user"></i>
		   </div>
			<div class="form-group ">
			 <input type="text" class="form-control" placeholder="Apellido" id="Apellido" name="lastName">
			 <i class="fa fa-user"></i>
		   </div>
		   <div class="form-group">
			 <input type="password" class="form-control" placeholder="Contraseña" id="Password" name="pass">
			 <i class="fa fa-lock"></i>
		   </div>
		   
		     <div class="form-group">
			 <input type="password" class="form-control" placeholder="Confirmar Contraseña" id="Passwod2" name="pass">
			 <i class="fa fa-lock"></i>
		  
		   </div>
			<div class="form-group ">
			 <input type="text" class="form-control" placeholder="Colonia" id="Colonia" name="Colony">
			 <i class="fa fa-user"></i>
		   </div>
			<div class="form-group ">
			 <input type="text" class="form-control" placeholder="Calle y Numero" id="CalleNumero" name="calleYnumero">
			 <i class="fa fa-user"></i>
		   </div>
		   <div class="form-group ">
			 <input type="text" class="form-control" placeholder="Telefono Celular" id="Number" name="telefono">
			 <i class="fa fa-user"></i>
		   </div>
		   <button type="submit" class="log-btn" >Registrar</button>

			 <a class="link" href="inicio.php">¿Ya estas registrado?</a>
		 </div>
	 </form>
</section>


</body>

</html>
