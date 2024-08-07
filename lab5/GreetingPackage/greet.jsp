<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="greeting.Greeting" %>
<!DOCTYPE html>
<html>
<head>
    <title>Using Java Class in JSP</title>
</head>
<body>
    <h2>Greeting Message</h2>
    <%
    
        Greeting greeting = new Greeting();
        
        String name = request.getParameter("name");
      
        String message = greeting.getMessage(name != null ? name : "Guest");
        
        out.println("<p>" + message + "</p>");
    %>
    <form action="greet.jsp" method="get">
        Enter your name: <input type="text" name="name" />
        <input type="submit" value="Greet Me" />
    </form>
</body>
</html>
