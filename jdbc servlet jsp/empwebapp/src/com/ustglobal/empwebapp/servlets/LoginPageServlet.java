package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
				System.out.println("login page :"+id);
			}
		}
	}
		out.println("<html>");
		out.println("<fieldset align='center'> ");
		out.println("<legend>Login</legend>");
		out.println("<form action='./login' method ='post' >");
		out.println("id:<input type='number' name='id' value='"+id+"'><br> ");
		out.println("password:<input type='password' name='password'><br>");
		out.println("<input type='checkbox' name='rememberme' value = 'checked'> Remember me <br>");
		out.println("<input type='reset' class='button-float-left' value='reset'> ");
		out.println("<input type='submit' class='button-float-right' value='login'> ");
		out.println("<a href='./register.html' class='float-left'>Register</a>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("</html>");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
