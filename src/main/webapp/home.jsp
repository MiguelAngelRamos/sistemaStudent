<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
                rel="stylesheet">
            <title>Home</title>
        </head>

        <body>
            <!-- Navbar -->
            <jsp:include page="navbar.jsp" />
            <!-- End Navbar -->
            <div class="container mt-5">
                <!-- <a href="index.jsp">Volver</a> -->
                <div class="no-overflow">
                    <h4><img src="https://awakelab.cl/img/logo_otic_sofofa.png" alt="" width="160" height="77"
                            role="presentation" class="img-fluid atto_image_button_text-bottom"><br><br>Bienvenidos y
                        bienvenidas al curso de Desarrollo de Aplicaciones Full Stack Java Trainee v2.0<br></h4>
                    <p><br>En este apartado te dejamos algunas indicaciones de importancia para tu mejor experiencia:
                    </p>
                    <p></p>
                    <ul>
                        <li> Recuerda que tu Awaker (Tutor Académico) es <strong><a href="mailto:miguel.infox@gmail.com"
                                    target="_blank">Miguel Ramos</a></strong>&nbsp;</li>
                        <li> Tu Adviser (Auxiliar del Curso) es <strong><a href="mailto:c.m.budrovich@gmail.com"
                                    target="_blank">Cristian Monsalve</a></strong><br></li>
                        <li> Tu Coordinadora (Tutora Administrativa) es <strong><a
                                    href="mailto:macarena.gallardo@fudesco.cl" target="_blank">Macarena
                                    Gallardo</a></strong></li>
                        <li> Debes iniciar sesión en la web de SENCE con tu RUT y Clave Única, así se marcará tu
                            asistencia dentro del Nodo, luego podrás tener acceso al curso.<br></li>
                    </ul>
                    <div><span id="label_content_63800">
                            <p dir="ltr"><strong><br>Criterios de Evaluación del curso:</strong></p>
                            <p dir="ltr"></p>
                            <ul>
                                <li>Asistencia al 80% de las clases sincrónicas</li>
                                <li>Ejecución del 100% actividades asincrónicas (Nodo)</li>
                            </ul>
                        </span><br>¡No
                        dudes en contactarnos ante cualquier consulta que tengas, y esperamos ofrecerte la mejor
                        experiencia formativa!</div>
                    <div><br></div>
                    <hr>
                </div>
                <div class="row">
                    <div class="col-4">
                        <form action="ServletStudents" method="post">
                            <div class="card" style="width: 18rem;">
                                <img src="https://www.pngall.com/wp-content/uploads/8/College-Student-PNG.png" class="card-img-top" alt="...">
                                <div class="card-body">
                                  <!-- <h5 class="card-title">Card title</h5>  -->
                                  <p class="card-text">Ver el registro de todos los estudiantes del bootcamp.</p>
                                  
                                </div>
                                <div class="d-grid gap-2">
<button type="submit" class="btn btn-secondary">Show Students</button>

</div>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </body>

</html>