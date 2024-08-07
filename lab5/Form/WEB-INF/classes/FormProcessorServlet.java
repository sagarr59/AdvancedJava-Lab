import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FormProcessorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // Retrieve form data
        String name = req.getParameter("name");
        String age = req.getParameter("age");

        // Set attributes to be used in the JSP
        req.setAttribute("name", name);
        req.setAttribute("age", age);

        // Forward request to the JSP page
        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req, res);
    }
}