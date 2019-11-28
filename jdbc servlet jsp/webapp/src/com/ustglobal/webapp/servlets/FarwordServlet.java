package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FarwordServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h1> This is include servlet</h1>");  it will not print
//		out.println("</body>");
//		out.println("</html>");
		
		Object obj = new Object();   
		req.setAttribute("obj", obj);
//		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/first");
		dispatcher.forward(req, resp);
		
		
		
		
		
	}

}
