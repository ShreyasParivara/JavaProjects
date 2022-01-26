<%@page import="com.te.mail.dao.ComposeData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sent Items</title>
</head>
<body bgcolor="FFE5B4">
<center><h1>Sent Items</h1></center>
<%List<ComposeData> list=(List)request.getAttribute("sentitem"); %>
<%for(ComposeData data:list){ %>
<h2>To: <%=data.getToAddress()%></h2>
<h2>Subject: <%=data.getSubject()%></h2>
<h1>Message:</h1>
<h2><%=data.getMessage()%></h2>
<h2>------------------------------------</h2>
<%} %>

</body>
</html>