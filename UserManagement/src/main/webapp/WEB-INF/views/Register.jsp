<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Status</title>
</head>
<body>
<% 
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if registration is successful (you can add your own logic here)
        boolean registrationSuccessful = true; // Replace with your registration logic

        if (registrationSuccessful) {
    %>
        <h2>Registration successfully</h2>
        <p>Welcome, <%= username %></p>
    <%
        } else {
    %>
        <h2>Registration failed</h2>
        <p>There was an issue with your registration.</p>
    <%
        }
    %>
</body>
</html>