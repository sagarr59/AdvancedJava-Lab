<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Prime Number Check Result</title>
</head>
<body>
    <h2>Prime Number Check Result</h2>
    <%
        String numStr = request.getParameter("num");
        boolean isPrime = true;
        if (numStr != null && !numStr.trim().isEmpty()) {
            try {
                int num = Integer.parseInt(numStr);

                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    out.println("<p>" + num + " is a prime number.</p>");
                } else {
                    out.println("<p>" + num + " is not a prime number.</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p>Invalid input. Please enter a valid integer.</p>");
            }
        } else {
            out.println("<p>No number provided. Please enter a number.</p>");
        }
    %>
    <a href="index.html">Check another number</a>
</body>
</html>
