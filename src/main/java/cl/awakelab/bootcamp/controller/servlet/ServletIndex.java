package cl.awakelab.bootcamp.controller.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletIndex
 */
@WebServlet("/ServletIndex")
public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  Cookie [] cookies = request.getCookies();
	  
	  if(cookies != null) {
	    for(Cookie cookie: cookies) {
	      if(cookie.getName().equals("credenciales")) {
	        response.sendRedirect("home.jsp");
	        return;
	      }
	    }
	  }
	  request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
