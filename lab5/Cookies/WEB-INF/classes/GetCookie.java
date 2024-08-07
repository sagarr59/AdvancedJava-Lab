import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GetCookie extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        
        // Retrieve cookies
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    res.setContentType("text/html");
                    pw.println("<html><body>");
                    pw.println("Hello " + cookie.getValue() + "!<br>");
                    pw.println("</body></html>");
                    pw.close();
                    return;
                }
            }
        }
        
        res.setContentType("text/html");
        pw.println("<html><body>");
        pw.println("No cookie found.<br>");
        pw.println("</body></html>");
        pw.close();
    }
}
