
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<%-- <%
		String str =(String) request.getAttribute("kr");
		 
	%> --%>
	<h1> Hello: ${kr}</h1>
	<c:forEach var="item" items="${kt }">
		<h1>${item }</h1>
	</c:forEach>
		
</body>
</html>