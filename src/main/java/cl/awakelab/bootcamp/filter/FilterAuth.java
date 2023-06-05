package cl.awakelab.bootcamp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter({"/ServletAuth", "/ServletStudents", "/home.jsp", "students.jsp"})
public class FilterAuth implements Filter{

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
    
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) resp;
    HttpSession session = request.getSession(false);
    
    if(session == null || session.getAttribute("usuario") == null) {
      response.sendRedirect(request.getContextPath()+ "/index.jsp"); // lo mando a que inicie su session
    } else {
      chain.doFilter(req, resp); // el usuario autentificado, continua con su solicitud que seria ir hacia el home
    }
    
  }

}
