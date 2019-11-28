package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.udtglobal.empwebapp.util.EmployeeDaoManager;
import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		String password = req.getParameter("password");
		String rememberMe = req.getParameter("rememberme");
		if(rememberMe == null) {               //if user havent checked remenber me it is null then

			Cookie[] cookies = req.getCookies();
			if(cookies!=null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("alwaysRemember")) {
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
					}
				}
			}
		}else {                          //if user checks remeber me then creates cookie object
			Cookie cookie = new Cookie("alwaysRemember", id+"");
			resp.addCookie(cookie);
		}


		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = dao.auth(id, password);

		if(info==null) {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<h4 style = 'color:red'> Invalid id or password</h4>");
			out.println("<html>");
//			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.include(req, resp);

		}else {
			/*
			 * creating session, once we execute this 1.object of session will be created
			 * it provide one unique id for this object
			 * and it will be stored in hashtable manner with unique id and session object inside servlet container
			 * after this it will give the response with cookie
			 * it will create cookie called jsessionid and it will send unique id to the browser
			 * using this session we can get the session atribute or setatribute
			 */
			HttpSession session = req.getSession(true);
			session.setAttribute("info", info);//until he loges out this session object will be there
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
		}

	}

}
