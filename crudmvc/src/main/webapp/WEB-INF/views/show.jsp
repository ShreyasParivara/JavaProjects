<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.te.crud.model.Employee"%>
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
	<h1>Employees Details</h1>
	<%
	List<Employee> list = (List) request.getAttribute("data");
	for( int i =0; i < list.size(); i++) {
	%>
	<h1><%=list.get(i)%></h1>

	<%
	}
	%>



</body>
</html>