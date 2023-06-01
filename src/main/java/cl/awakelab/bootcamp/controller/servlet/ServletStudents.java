package cl.awakelab.bootcamp.controller.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.bootcamp.controller.StudentController;

/**
 * Servlet implementation class ServletStudents
 */
@WebServlet("/ServletStudents")
public class ServletStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    StudentController studentController = new StudentController();
    System.out.println("Servlet Student inside");
    // System.out.println(studentController.findAllStundents()); []
    
    request.setAttribute("students", studentController.findAllStundents());
    // reenviar esta informacion a un JSP
    RequestDispatcher dispatcher = request.getRequestDispatcher("/students.jsp");
    dispatcher.forward(request, response);
  }
       
   
}
