<%@page import="com.te.mail.dao.ComposeData"%>
<%@page import="com.te.mail.controller.MyController"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inbox</title>
</head>
<body bgcolor="FFE5B4">
<center><h1>Inbox</h1></center>
<% List<ComposeData> list=(List)request.getAttribute("inbox");
%>
<%for(ComposeData data:list){ %>
<h2>From: <%=data.getFromAddress()%></h2>
<h2>Subject: <%=data.getSubject()%></h2>
<h2>Message</h2>
<h2><%=data.getMessage()%></h2>
<h2>-------------------------------------</h2>


<%} %>
</body>
</html>