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

import com.udtglobal.empwebapp.util.EmployeeDaoManager;
import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			String pass = req.getParameter("newpassword");
			String confirmpass = req.getParameter("confirmpassword");
			 if(pass.equals(confirmpass)) {
				 EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");  //this is to get the id from session 
			EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
			dao.changePassword(info.getId(), pass); //need to use the id here
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
			 }else {
				 //for jsp
				 String msg = "password not matching";
				 req.setAttribute("msg", msg);
				 
//				 PrintWriter out = resp.getWriter();
//				 out.println("<html>");
//				 out.println("<h4> password not matching</h4>");
//				 out.println("</html>");
				 
//				 RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.html");
//					dispatcher.include(req, resp);
				 
				 //for jsp
				 RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.jsp");
					dispatcher.forward(req, resp);
				 
			 }
			
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
			
		}
	}

}
