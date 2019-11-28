<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class = "java.lang.String" scope = "request"></jsp:useBean>

<body>
<a href="./home" class = "float-left">Home</a>
<a href="./logOut" class = "float-right">LogOut</a>
<h4><%=msg %></h4>
	<fieldset align = "center">
		<legend>change password</legend>
			<form action ="./changepassword" method = "post" >
			
			new password: <input type = "password" name = "newpassword">
			confirm password : <input type = "password" name = "confirmpassword">
			<input type = "reset" name = "reset" value = "reset" class = "btn float-right">
			<input type = "submit" name = "submit" value = "Change password" class = "btn float-right">

			</form>
	</fieldset>
</body>
</html>