<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page And is called by controller </h1>
	<%
		String name = (String)request.getAttribute("name");
		List<String> lt =(List<String>) request.getAttribute("fr");
		
	%>
	<h1>My Name is <%=name %></h1>
	<%
		for(String s : lt){
	%>		
			<h1><%=s%></h1>
	<% 		
		}
	%>
	
</body>
</html>