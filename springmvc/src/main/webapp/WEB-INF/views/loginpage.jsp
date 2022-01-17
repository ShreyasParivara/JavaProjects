<%@page import="com.te.springmvc.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successfully logged in</title>
</head>
<body>
<% Register ref=(Register)request.getAttribute("details"); %>
<h1 style="color:green"><%=ref.getUname() %>Successfully Logged in</h1>
<h1 style="color:orange"><%=ref %></h1>


</body>
</html>