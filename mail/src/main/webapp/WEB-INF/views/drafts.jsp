<%@page import="com.te.mail.model.Drafts"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drafts</title>
</head>
<body bgcolor="FFE5B4">
<center><h1>Drafts</h1></center>
<%List<Drafts> list=(List)request.getAttribute("drafts"); %>
<%for(Drafts data:list){ %>
<h2>To: <%=data.getToAddress()%></h2>
<h2>Subject: <%=data.getSubject()%></h2>
<h1>Message:</h1>
<h2><%=data.getMessage()%></h2>
<h2>------------------------------------</h2>
<%} %>
</html>