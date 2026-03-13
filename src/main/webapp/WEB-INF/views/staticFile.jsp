<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="/resources/javascript/script.js"/>" > 

</script>
<title>Static File Demo</title>
</head>
<body>
	<div class="check" height="100px">
		Hello World		
	</div>
	<img alt="my-imag" src="<c:url value="/resources/image/img.jpg"/>">
</body>
</html>