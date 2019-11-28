package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dto.EmployeeInfo;
@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//need to get the session this method will just check for the unique id it cchecks whether
		//this session object present or not nd session object assign to session throught
		
		HttpSession session = req.getSession(false);
		if(session!=null ) {  //if the session object present then login show the home page
			//EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");//we need to downcast session object from the object cls
			/*
			 * PrintWriter out = resp.getWriter();
			 * out.println("<h1> welcome "+info.getName()); out.println("</h1>");
			 * out.println("<a href = 'search.html'>Search</a>");
			 * out.println("<a href = 'changepassword.html'>changepassword</a>");
			 * out.println("<a href = './logOut'>LogOut</a>");
			 */
			RequestDispatcher dispatcher = req.getRequestDispatcher("./home.jsp");
			dispatcher.forward(req, resp);
			
		} else {
//			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
			dispatcher.forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
