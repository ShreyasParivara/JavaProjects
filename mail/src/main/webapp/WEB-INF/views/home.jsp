<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor="FFE5B4">
<center><h1>Welcome <%= request.getAttribute("name")%></h1></center>
<h2><a href="./compose">Compose Mail</a></h2>
<h2><a href="./inbox">Inbox</a></h2>
<h2><a href="./sent">Sent Items</a></h2>
<h2><a href="./draft">Drafts</a></h2>

</body>
</html>