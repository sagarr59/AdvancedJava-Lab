<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Session Display</title>
</head>
<body>
    <h1>Session Information</h1>
    <%
        String username = (String) session.getAttribute("username");
        if (username != null) {
            out.println("Hello, " + username + "!");
        } else {
            out.println("No session information available.");
        }
    %>
</body>
</html>
