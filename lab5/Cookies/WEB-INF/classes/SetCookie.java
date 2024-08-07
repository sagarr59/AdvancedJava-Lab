import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SetCookie extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        String name = req.getParameter("name");
        
        // Set a cookie
        Cookie cookie = new Cookie("username", name);
        cookie.setMaxAge(60 * 60 * 24); // 1 day
        res.addCookie(cookie);
        
        res.setContentType("text/html");
        pw.println("<html><body>");
        pw.println("Cookie has been set. Welcome " + name + "!<br>");
        pw.println("<form action='GetCookie' method='post'>");
        pw.println("<input type='submit' value='Check Cookie'>");
        pw.println("</form>");
        pw.println("</body></html>");
        pw.close();
    }
}
