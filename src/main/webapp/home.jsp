<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
	<title>Home</title>
</head>
<body>
    <!-- Navbar -->
    <jsp:include page="navbar.jsp"/>
    <!-- End Navbar -->
	<div class="container mt-5">
		<h1> Bienvenido(a) ${sessionScope.usuario}</h1>
		<a href="index.jsp">Volver</a>
	</div>
</body>
</html>