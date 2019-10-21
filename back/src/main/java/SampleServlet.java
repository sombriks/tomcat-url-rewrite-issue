import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app2/*")
public class SampleServlet extends HttpServlet {

  private static final long serialVersionUID = 2024226064433581790L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    // res.getWriter().write("hello");
    String path = req.getContextPath();
    System.out.println(path);
    String uri = req.getRequestURI();
    System.out.println(uri);
    // String forward = uri.replaceFirst(path,"");
    // req.getRequestDispatcher(forward).forward(req, res);
    res.sendRedirect(uri);
  }
}