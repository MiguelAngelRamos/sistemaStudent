package cl.awakelab.bootcamp.controller.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.awakelab.bootcamp.controller.UserController;

/**
 * Servlet implementation class ServletAuth
 */
@WebServlet("/ServletAuth")
public class ServletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    // Crear una instancia del controlador
	  
	    UserController userController = new UserController();
	    String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		String result = userController.login(username, password);
		
		if(!result.equals("false")) {
		  // guardamos las credenciales
		  guardarCredenciales(username, password, response);
		  HttpSession session = request.getSession();
		  session.setAttribute("usuario",username);
		}
		response.setContentType("text/html; charset-UTF-8");
		PrintWriter out = response.getWriter();
		out.println(result);
		out.flush();
		out.close();
	}
	
	private void guardarCredenciales(String username, String password, HttpServletResponse response) {
	  // aqui voy a crear la cookie
	  
	  Cookie cookie = new Cookie("credenciales", username); // ven algo de malo
	  cookie.setMaxAge(1000); // la edad la cookie "el tiempo que va durar"
	  response.addCookie(cookie);
	  
	  
	}

}
