<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class = "java.lang.Object" scope = "request" ></jsp:useBean>


<%
String id = "";
Cookie[] cookies = request.getCookies();
if(cookies!=null) {
for(Cookie cookie : cookies) {
	if(cookie.getName().equals("alwaysRemember")) {
		id = cookie.getValue();
		System.out.println("login page :"+id);
	  }
   }
}

%>


<body>

<h4><%=msg%></h4>
	<fieldset align='center'>
		<legend>Login</legend>
			<form action='./login' method ='post' >
				id:<input type='number' name='id' value='<%=id%>'><br>
				password:<input type='password' name='password'><br>
				<input type='checkbox' name='rememberme' value = 'checked'> Remember me <br>
				<input type='reset' class='button-float-left' value='reset'>
				<input type='submit' class='button-float-right' value='login'>
				<a href='./register.html' class='float-left'>Register</a>
			</form>
	</fieldset>
</body>
</html>
