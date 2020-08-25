<?php 

$url = "http://localhost:8080/RestPrueba/webresources/Ucm";

$miVar = file_get_contents($url);

$decodJson = json_decode($miVar);

echo "Informacion JSON desde la URL";
echo "<br>";

foreach ($decodJson as $p) {

	echo "Titulo : ".$titulo = $p->titulo;
	echo "<br>";

	echo "Genero : ".$genero = $p->genero;
	echo "<br>";

	echo "idioma : ".$idioma = $p->idioma;
	echo "<br>";

	echo "Duracion : ".$duracion = $p->duracion;
	echo "<br>";

	echo "calificacion : ".$calificacion = $p->calificacion;
	echo "<br>";

	echo "resumen : ".$resumen = $p->resumen;
	echo "<br>";

	echo "formato : ".$formato = $p->formato;
	echo "<br>";

	echo "año produccion : ".$anioProduccion = $p->anioProduccion;
	echo "<br>";

	echo "director : ".$director = $p->director;
	echo "<br>";

	echo "clasificacion : ".$clasificacion = $p->clasificacion;
	echo "<br>";

	echo "<br>";


		$con = mysqli_connect("mysql-andresdavid.alwaysdata.net","211718","password!") or die("Sin conexion");

		mysqli_set_charset($con,"utf8");
		mysqli_select_db($con,"andresdavid_pruebasoa");


		$consulta = "INSERT INTO UCM (titulo,genero,idioma,duracion,calificacion,resumen,anio_produccion,formato,director,clasificacion) VALUES ('$titulo','$genero','$idioma','$duracion','$calificacion','$resumen','$anioProduccion','$formato','$director','$clasificacion');";

		$resultado = mysqli_query($con, $consulta);
		echo "<br>";
}

if ($resultado == true) {
	echo "<br>";
	echo "Datos guardados";
}else{
	echo "<br>";
	echo "Error";
}

echo "<br>";
echo "<br>";

mysqli_close($con);


 ?>