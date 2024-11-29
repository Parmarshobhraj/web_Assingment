<%@page import="dao.UserDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Student Information</h2>
    <p>First Name: ${fname}</p>
    <p>Last Name: ${lname}</p>
    <p>Email: ${email}</p>
    <p>Mobile: ${mobile}</p>
    <p>Password: ${password}</p>
</body>
</html>