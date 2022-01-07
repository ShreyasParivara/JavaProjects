<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int number1,number2; %>
<%! double result; %>



<%

int number1 = Integer.parseInt(request.getParameter("first"));
int number2 = Integer.parseInt(request.getParameter("second"));
String option=request.getParameter("option");
switch(option){
case"Addition":{
	result=number1+number2;
	break;
}
case "Subtract":{
	result=number1-number2;
	break;
}
case "Multiplication":{
	result=number1*number2;
	break;
}
case "Division":{
	result=number1/number2;
	break;
}
case "Modulus":{
	result=number1%number2;
	break;
}

default:
	result=0;

}

 
 %>
<h1>Result <%= result %></h1>

</body>
</html>