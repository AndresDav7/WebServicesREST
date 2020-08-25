<?php 

$url = "http://localhost:8080/RestPrueba/webresources/Ucm";

$miVar = file_get_contents($url);

$decodJson = json_decode($miVar);

foreach ($decodJson as $p) {
	
	echo "<br>";

		$con = mysqli_connect("mysql-andresdavid.alwaysdata.net","211718","password!") or die("Sin conexion");

		mysqli_set_charset($con,"utf8");
		mysqli_select_db($con,"andresdavid_pruebasoa");
}

//Datos desde la base
echo "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' integrity='sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z' crossorigin='anonymous'>";

echo "<br>";
echo "<br>";
echo "<h2>";
echo " Datos de las Películas UCM";
echo "</h2>";
echo "<br>";

$sql = "select * from UCM";

$rs = mysqli_query($con, $sql);

while ($row1 = mysqli_fetch_object($rs)) {
	$datos[] = $row1;
}

echo "<table class='table'>";
echo "  <thead class='thead-dark'>";
echo "    <tr>";
echo "      <th scope='col'>Titulo</th>";
echo "     <th scope='col'>Genero</th>";
echo "     <th scope='col'>Idioma</th>";
echo "      <th scope='col'>Duracion</th>";
echo "      <th scope='col'>Calificacion</th>";
echo "      <th scope='col'>Resumen</th>";
echo "      <th scope='col'>Año produccion</th>";
echo "      <th scope='col'>Formato</th>";
echo "      <th scope='col'>Director</th>";
echo "      <th scope='col'>Clasificacion</th>";

echo "    </tr>";
echo "  </thead>";
echo "  <tbody>";
echo "<br>";    
    
foreach ($datos as $dat) {

	echo "<tr>";
	echo " <td> ";
	echo "$dat->titulo";
	echo " </td>";

	echo " <td> ";
	echo "$dat->genero";
	echo " </td>";

	echo " <td> ";
	echo "$dat->idioma";
	echo " </td>";

	echo " <td> ";
	echo "$dat->duracion";
	echo " </td>";

	echo " <td> ";
	echo "$dat->calificacion";
	echo " </td>";

	echo " <td> ";
	echo "$dat->resumen";
	echo " </td>";

	echo " <td> ";
	echo "$dat->anio_produccion";
	echo " </td>";

	echo " <td> ";
	echo "$dat->formato";
	echo " </td>";

	echo " <td> ";
	echo "$dat->director";
	echo " </td>";

	echo " <td> ";
	echo "$dat->clasificacion";
	echo " </td>";
	echo "</tr>";
}

echo "</tbody>";
echo "</table>";

echo "<a href='../index.html' class='btn btn-secondary btn-lg active' role='button' aria-pressed='true'>Inicio</a>";

mysqli_close($con);

 ?>