<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body bgcolor="#E9E4D4">

<form action="./send" method="post">
To:&emsp;<input type="text" name="toAddress" required="required"><br><br>
From:&emsp;<input type="text" name="fromAddress" required="required"><br><br>
Subject:&emsp; <input type="text" name="subject" required="required"><br><br>
Compose:<br><br>
<textarea rows="20" cols="90" name="message"></textarea><br><br>
<input type="submit" value="Send" name="button"><br><br>
<input type="submit" value="Draft" name="button" >
</form>


</body>
</html>