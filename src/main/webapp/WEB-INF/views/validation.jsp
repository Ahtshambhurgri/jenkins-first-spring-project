<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Validation</title>
</head>
<body>
	<div>
		 <form:errors path="vsp.*"/> 
	</div>
	<form action="validate" method="POST">
	
		<input type="text" name="username">
		
		<input type="text" name="id"> 
		<button type="submit">Submit</button> 
	
	</form>
	
	
	
</body>
</html>