<%@page import="com.technoelevate.etrackportal.model.Student"%>
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
<a href="./changeFacultyPass">Change Password</a>
<h1>Welcome to Faculty Page</h1>
<h2>Student Details</h2>
<%List<Student> list =(List<Student>) request.getAttribute("data");%>
<%for(Student s:list){ %>
<h2>RollNo: <%=s.getRollNo() %></h2>
<h2>Name: <%=s.getFirstName()+" "+s.getLastName()%></h2>
<h2>Course: <%=s.getCourse().getCourseName() %></h2>
<h2>Fees: <%=s.getOption() %></h2>
<h2>=======================================</h2>
<%} %>

</body>
</html>