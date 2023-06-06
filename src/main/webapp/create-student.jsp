<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
    <link rel="stylesheet" href="css/styles.css">
    <title>Crear nuevo estudiante</title>
</head>
<body class="fondo">
  <!-- Navbar -->
   <jsp:include page="navbar.jsp" />
   <!-- End Navbar -->
    <div class="container mt-5">
        <h1 class="text-center">Student Form </h1>

        <div class="row mt-5">
            <div class="col-4 offset-4">

                <form class="fondo-form" action="ServeltCrudStudent" method="POST" id="form-create-student">
                    <div class="mb-3">
                        <label for="id" class="form-label">ID del estudiante</label>
                        <input
                            type="number"
                            class="form-control"
                            id="id"
                            name="id"
                            value="${student.id}"
                            required
                            readonly
                        />
                    </div>

                    <div class="mb-3">
                        <label for="name" class="form-label">Nombre</label>
                        <input
                            type="text"
                            class="form-control"
                            id="name"
                            name="name"
                            value="${student.name}"
                            required
                        />
                    </div>

                    <div class="mb-3">
                        <label for="lastname" class="form-label">Apellido</label>
                        <input
                            type="text"
                            class="form-control"
                            id="lastname"
                            name="lastname"
                            value="${student.lastname}"
                            required
                        />
                    </div>

                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input
                            type="email"
                            class="form-control"
                            id="email"
                            name="email"
                            value="${student.email}"
                            required
                        />
                    </div>
					
					<input type="hidden" name="option" value="updateStudent">
                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-success">Send</button>
                    </div>

                </form>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/app.js"></script>
</body>
</html>