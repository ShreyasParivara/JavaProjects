<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Edit</title>
</head>
<body>
<center><form action="./studentEdit" method="post">
Student First Name: <input type="text" name="firstName"><br><br>
Student Last Name: <input type="text" name="lastName"><br><br>
Student Course: <select name="courseName">
<option value="">Select</option>
<option value="Mechanical" >Mechanical</option>
<option value="Electronics">Electronics</option>
<option value="Civil">Civil Engineering</option>
<option value="Computer Science">Computer Science</option>
</select><br><br>
Fees: <select name="option">
<option value="">Select</option>
<option value="Paid">Paid</option>
<option value="Not Paid" >Not Paid</option>
</select><br><br>
<input type="submit" value="Edit">
</form></center>

</body>
</html>