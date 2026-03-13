<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>

</head>
<body>

	<hr> 
	<form action="process" method="post">
		<div>
			<label for="uname"> Enter Your Email </label>
			<input type="email" name="email" id="uname" style="margin:30px">
			<br>
			<label for="fname">Please Enter UserName</label>
			<input type="text" name="username" id="fname">
			<br>
			<label for="hac">Please Enter Password</label>
			<input type="password" name="password" id="hac">
		</div>
		<br>
		<button type="submit">Sumbit</button>
	
	</form>
</body>
</html>