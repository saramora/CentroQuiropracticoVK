<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<title>Centro Quiropractico VK</title>
	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="recursos/css/bootstrap.min.css">
	<link rel="stylesheet" href="recursos/css/estilos.css">
	<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Bree+Serif|Chewy|Gochi+Hand|Itim|Laila|Lobster+Two|Luckiest+Guy|Pacifico|Quattrocento+Sans|Taviraj|Yesteryear|Merriweather:700" >
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<style>
		body    {
			background-color: #ffffff;
			color: #FFFFFF;
			padding: 0px;
			font: 18px Arial, Tahoma;
		}
	</style>
</head>
<body>
	<header>
		<div class="menu1">
			<div class="container">
				<!-- cabecera: bloque de contacto -->
				<form action="" class="navbar-form navbar-left" role="search">
					<i class="fa fa-envelope-o" style="font-size:18px;color:#337AB7"></i>
					<font style="font-size:16px;color:#337AB7;font-family:Arial;font-weight:bold"><a href="mailto:info@centroquiropracticovk.com">info@centroquiropracticovk.com</a></font><br>
					
					<div class="form-group">
						<i class="fa fa-phone" style="font-size:18px;color:#337AB7"><font style="font-size:16px;color:#337AB7;font-family:Arial;font-weight:bold"> + 34 91 777 18 41</font></i>
					</div>
				</form>
				<!-- cabecera: reservar cita -->
				<form action="" class="navbar-form navbar-right">
					<div class="form-group">
						<font style="font-size:20px;color:#337AB7;font-family:Arial;font-weight:bold;"><a href="formularioCitas">RESERVAR CITA</a></font>
					</div>
				</form>
				</div>
			</div>
	</header>

	<!-- logo y titulo -->
	<section class="centroQuiro">
		<div class="container">
			<div class="row">
                <div class="col-md-2">
				    <img src="recursos/img/bueno.jpg" class="img-rounded" alt="" width="120" height="120">
				</div>
				<div class="col-md-10">
				    <h1 class="letraTitulo">CENTRO QUIROPRACTICO VK</h1>
					<p class="letraTitulo">Tu salud, tu bienestar
				</div>
			</div>
		</div>
	</section>
	
	<!-- menu -->
	<section class="main container">
		<div class="row">
			<section class="posts col-md-12">
				<div class="miga-de-pan">
					<ol class="breadcrumb">
						<li><a href="/CentroQuiropracticoVK">INICIO</a></li>
						<li><a href="equipo">NUESTRO EQUIPO</a></li>
						<li><a href="tratamientos">TRATAMIENTOS</a></li>
						<li><a href="tarifas">TARIFAS</a></li>
						<li><a href="contacto">CONTACTO</a></li>
					</ol>
				</div>
			</section>
		</div>
	</section>
	
	
	<div class="headerClearFix"></div>
        <div class="contentPadding">
            <div class="container">
                <div class="post row">
					<div class="col-xs-12">
                        <div class="titulo2">
                            <h4>NUESTRO EQUIPO<br><br></h4>
                        </div>
						<div class="especialidadesTexto">
                            En Centro Quiropráctico VK tenemos la suerte de contar con un personal altamente cualificado y profesional; conocedor de las últimas tecnologías y avances en las áreas de actuación que atañen a nuestra actividad; con una formación internacional muchos años de experiencia. 
							<br>A continuación os ofrecemos alguna información acerca de ellos, para que puedan conocerlos y también porque queremos tener su confianza antes incluso de que venga a visitarnos a nuestro centro.
                        </div>
                    </div>
				</div>
				
				<div class="post row">
					<div class="col-xs-12">
						<section class="col-md-9">
							<article class="clearfix">
								<a href="#">ANA SÁNCHEZ ROMO</a><br><br>
								<div class="especialidadesTexto">
									Ana Sánchez Romo, es una Quiropráctica altamente cualificado. Estudió 6 años en el Instituto Franco-Européen de Chiropraxie (Paris), uno de los centros más prestigiosos del mundo en la disciplina.
									<br>Posee el certificado en más de seis técnicas quiroprácticas. 
									<br>Ha trabajado en varios países como Francia, Inglaterra y España. Los pacientes le describen como un profesional honesto, atento y riguroso. Su amor por su trabajo le empuja cada día a buscar lo mejor para ellos, proporcionando un cuidado suave, seguro y eficaz.
								</div>
							</article>
						</section>
						<aside class="col-md-3 hidden-xs hidden-sm">
							<img src="recursos/img/ana.jpg" width="170" height="220">
						</aside>
                    </div>
				</div>
				
				<div class="post row">
					<div class="col-xs-12">
						<aside class="col-md-3 hidden-xs hidden-sm">
							<img src="recursos/img/adriana.jpg" width="170" height="220">
						</aside>
						<section class="col-md-9">
							<article class="clearfix">
								<a href="#">ADRIANA MORATALLA PARRILLA</a><br><br>
								<div class="especialidadesTexto">
									La doctora Adriana Moratalla Parrilla es licenciada en Medicina por la Universidad Complutense de Madrid. Posteriormente se desplazó a Bruselas donde cursó un Máster en Quiropráctica.
									<br>Miembro de la Asociación Española de Quiropráctica.
									<br>Docente de la Escuela de Quiropráctica Animal con sede en el Real Centro Universitario Escorial-Mª Cristina. 
									<br>Cuenta con más de 15 años de experiencia en el campo de la quiropráctica.
								</div>
							</article>
						</section>
                    </div>
				</div>
				
				<div class="post row">
					<div class="col-xs-12">
						<section class="col-md-9">
							<article class="clearfix">
								<a href="#">SILVIA PINTEÑO RUBIO</a><br><br>
								<div class="especialidadesTexto">
									La doctora Silvia Pinteño Rubio tiene mas de 20 años de experiencia en quiropráctica.
									Estudió quiropráctica en la universidad de Western States (University of Western States) en Estados Unidos, donde se graduó en 1992 con el título de doctor en quiropráctica. Permaneció en los Estados Unidos durante 16 años adquiriendo experiencia clínica y asistiendo a numerosos cursos post grado, aumentando así sus conocimientos en diferentes técnicas quiroprácticas y gestión clínica de pacientes. <br>Cuenta así mismo con la diplomatura de fisioterapeuta.
								</div>
							</article>
						</section>
						<aside class="col-md-3 hidden-xs hidden-sm">
							<img src="recursos/img/silvia.jpg" width="170" height="220">
						</aside>
                    </div>
				</div>
				
			</div>
		</div>
	</div>
	
	<footer class="centroQuiro">
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					<div class="footerRedes">
						<h5>Siguenos en las redes</h5>
                        <a href="https://www.facebook.com/" target="_blank">
						<i class="fa fa-facebook"></i></a>
						
						<a href="https://twitter.com/" target="_blank">
						<i class="fa fa-twitter"></i></a>
						
						<a href="https://www.whatsapp.com/" target="_blank">
						<i class="fa fa-whatsapp"></i></a>
						
						<a href="https://www.instagram.com/?hl=es" target="_blank">
						<i class="fa fa-instagram"></i></a>
						
						<a href="https://www.pinterest.es/" target="_blank">
						<i class="fa fa-pinterest"></i></a>
                    </div>
				</div>
				<div class="col-md-5">
					&nbsp;
				</div>
				<div class="col-md-4">
					<div class="footerBlock normall">

                    <div class="footerContacto">
						<p>Centro Quiropractico VK</p>
                    </div>
					
					<div class="footerContacto">
                        <i class="fa fa-map-marker"></i>
                        <a href="#">Leon Felipe, 18, 28015 Madrid, España</a>
                    </div>

                    <div class="footerContacto">
                        <i class="fa fa-phone"></i>
                        <a href="tel:34914550416">+34 914 55 04 16</a>
                    </div>

                    <div class="footerContacto">
                        <i class="fa fa-envelope-o"></i>
                        <a href="mailto:info@centroquiropracticovk.com">info@centroquiropracticovk.com</a>
                    </div>
                </div>
			</div>
			</div>
		</div>
	</footer>
</body>
</html>