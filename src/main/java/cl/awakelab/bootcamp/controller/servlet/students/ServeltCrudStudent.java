package cl.awakelab.bootcamp.controller.servlet.students;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.bootcamp.controller.StudentController;

/**
 * Servlet implementation class ServeltCrudStudent
 */
@WebServlet("/ServeltCrudStudent")
public class ServeltCrudStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    super.service(arg0, arg1);
    String option = request.getParameter("option"); // deleteStudent
    StudentController studentController = new StudentController();
    String url = "index.jsp";
    System.out.println(option);
    
    switch (option) {
      case "deleteStudent":
        int idDelete = Integer.parseInt(request.getParameter("idStudent"));
        // al controlador
        studentController.deleteStudentById(idDelete);
        url = "students.jsp";
        request.setAttribute("students", studentController.findAllStundents());
        break;

      default:
        break;
    }
    // fin switch
    request.getRequestDispatcher(url).forward(request, response);
    
  }
       
   

}
