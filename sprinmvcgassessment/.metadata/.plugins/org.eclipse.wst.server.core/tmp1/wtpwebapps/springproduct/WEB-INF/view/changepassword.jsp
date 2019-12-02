<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<a href="./home">home</a>
<a href="./logout" style="float: right;">logout</a>
<fieldset>
<legend>change password</legend>
<form action="./changepassword" method="post">

	<table>
	<tr>
		<td>new password</td>
		<td><input type = "password" name = "password"></td>
	</tr>
	<tr>
		<td>confirm password</td>
		<td><input type = "password" name = "confirmpassword"></td>
	</tr>
	<tr>
		<td><input type = "submit" value = "changepassword">
	</tr>
	
	</table>

</form>
</fieldset>

		
	</center>
</body>
</html>