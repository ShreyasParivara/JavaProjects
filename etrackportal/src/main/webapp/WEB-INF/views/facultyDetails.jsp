<%@page import="com.technoelevate.etrackportal.model.Faculty"%>
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
<h2>Faculty Details</h2>
<%List<Faculty> list =(List<Faculty>) request.getAttribute("data");%>
<%for(Faculty s:list){ %>
<h2>Faculty Id: <%=s.getId() %></h2>
<h2>Name: <%=s.getName()%></h2>
<form action="./facultyEditPage" method="post">
<input type="hidden" value="<%=s.getId() %>" name="id">
<input type="submit" value="Edit" >
</form><br><br>
<form action="./deleteFaculty" method="post">
<input type="hidden" name="id" value="<%=s.getId()%>">
<input type="submit" value="Delete">
</form>
<h2>=======================================</h2>
<%} %>

</body>
</html>