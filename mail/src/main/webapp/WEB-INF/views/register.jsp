<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="FFE5B4">
<center><h1>Welcome to Mail, Create your Accout here</h1></center>
<center><h1></h1><form action="./store" method="post">
Enter User Name: <input type="text" name="regName" required="required"><br><br>
Enter New Password: <input type="text" name="regPass" required="required"><br><br>
Enter MailId; <input type="email" name="regMail" required="required"><br><br>
<input type="submit" value="Register"><br><br>
</form><h1></h1></center>
<center><a href="./index.jsp">Have an Account? Go to Login page<h1></h1></a></center>

</body>
</html>