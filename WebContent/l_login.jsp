<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="css/l_style.css">
	</head>
	<body>
		<form class="box" action="l_login" method="post">
			<h1>Login</h1>
			<input type="text" name="uname" placeholder="Username">
			<input type="password" name="pass" placeholder="Password">
			<input type="submit" name="submit" value="Login">
			<a href="l_signup.jsp">Create an account</a><br><br>
			<a href="">Forget Password?</a>
		</form>
	</body>
</html>