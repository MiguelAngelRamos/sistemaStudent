<%@page import="cl.awakelab.bootcamp.model.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Listado de Estudiantes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
    <!-- Font Awesome -->
	  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	 <!-- /Font Awesome -->
  </head>

<body>
    <!-- Navbar -->
    <jsp:include page="navbar.jsp" />
    <!-- End Navbar -->
    <div class="container mt-5">
        <h2 class="text-center mb-4">List Students</h2>
        <div class="row">
            <div class="col-6 offset-3">
                <table class="table">
                    <thead>
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Lastname</th>
                        <th scope="col">Email</th>
                        <th scope="col">Actions</th>
                      </tr>
                    </thead>
                    <tbody class="table-group-divider">
                    <!-- el ciclo for de java -->
                    <% List<Student> students = (List<Student>)request.getAttribute("students");
                    	if(students != null) {
                    	  for(Student s: students ) {
                    %>
                      <tr>
                        <td><%= s.getId()%></td>
                        <td><%= s.getName()%></td>
                        <td><%= s.getLastname()%></td>
                        <td><%= s.getEmail()%></td>
                        <td>
                         <a class="text-success" href=""><i class="fa-solid fa-pen-to-square mx-3"></i></a>	 
 						 <a class="text-danger" href="ServeltCrudStudent?option=deleteStudent&idStudent=<%=s.getId()%>"><i class="fa-solid fa-trash"></i></a>
                        </td>
                      </tr>
                      <!-- fin del for de java -->
                      
                    <% } 
                    }
                     %>
                    </tbody>
                  </table>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>

</html>