import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // Forward the request to the JSP page
        RequestDispatcher dispatcher = req.getRequestDispatcher("hello.jsp");
        dispatcher.forward(req, res);
    }
}
