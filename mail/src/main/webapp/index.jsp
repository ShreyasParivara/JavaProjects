<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="FBE7A1">
<center><h1>Welcome To Mail Application</h1><br><br></center>
<center><h2></h1><form action="./validate" method="post">
Enter the MailId: <input type="text" name="mailid"><br><br>
Enter the Password: <input type="password" required="required" name="upass"> <br><br>
<input type="submit" value="Login"><br><br>
<a href="./register">Register/ Create New Account</a><br><br>
<a href="./forgot">Forgot Password</a><br><br>

</form></h2></center>

</body>
</html>