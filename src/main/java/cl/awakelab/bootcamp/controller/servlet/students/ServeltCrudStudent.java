package cl.awakelab.bootcamp.controller.servlet.students;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.bootcamp.controller.StudentController;
import cl.awakelab.bootcamp.model.entity.Student;

/**
 * Servlet implementation class ServeltCrudStudent
 */
@WebServlet("/ServeltCrudStudent")
public class ServeltCrudStudent extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String option = request.getParameter("option"); 
    // creo la instancia del controlador
    StudentController studentController = new StudentController();
    String url = "index.jsp";
    System.out.println(option);
    
    switch (option) {
    
      case "deleteStudent": {
        int idDelete = Integer.parseInt(request.getParameter("idStudent"));
        // al controlador
        studentController.deleteStudentById(idDelete);
        url = "students.jsp";
        request.setAttribute("students", studentController.findAllStundents());
        break;
      }
      
      case "formUpdateStudent" : {
         int idFormStudent = Integer.parseInt(request.getParameter("idStudent"));
         // llamar al controlador
         Student student = studentController.findByIdStudent(idFormStudent); // ya tenemos al estudiante que deseamos actualizar
         // url
         url = "create-student.jsp";
         // enviar los atributos en la request
         request.setAttribute("student", student);
         break;
      }
      
      case "updateStudent" : {
        // toda la logica para actualizar al estudiante
        int idStudent = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String email  = request.getParameter("email");
        
        Student updateStudent = new Student(idStudent, name, lastname, email);
        // llamar al controlador
        studentController.updateStudent(updateStudent);
        url = "students.jsp";
        request.setAttribute("students", studentController.findAllStundents());
        break;
      }
      
      default:
        break;
        
    }
    // fin switch
    request.getRequestDispatcher(url).forward(request, response);
    
  }
       
   

}
