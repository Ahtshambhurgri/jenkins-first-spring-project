<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false" %>   
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>DipslayDetails</title>
</head>
<body>
	 
	<h1>Your Name is : ${user.username } </h1>
	<h2>Your Father Name is:${user.email}</h2>
	<h1>Your Password s : ${user.password }</h1>
</body>
</html>