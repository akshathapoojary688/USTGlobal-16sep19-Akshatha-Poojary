<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%! 
	public void jspInit() {
	System.out.println("this is init phase");
}

public void jspDestroy() {
	System.out.println("this is destroy phase");
}
%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%   /* scriplet tag */
	Date date = new Date();
	m();
%>

                                                 
<%!         // declaration tag  
	public int i = 10;
	public void m() {
		System.out.println(i);
	}
%>
<body>

<h1 style = "color:green;"> Date and time is <%=date%></h1> <!-- expression tag -->
<h3><%=i %></h3>    <!-- expression tag   printing something -->
</body>
</html>
