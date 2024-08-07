import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession(); // Create or retrieve the session
        String name = req.getParameter("name");
        
        // Store the name in the session
        session.setAttribute("username", name);
        
        // Redirect to JSP page
        res.sendRedirect("displaySession.jsp");
    }
}
