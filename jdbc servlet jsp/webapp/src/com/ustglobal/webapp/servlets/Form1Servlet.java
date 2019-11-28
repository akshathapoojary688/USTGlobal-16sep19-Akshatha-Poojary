package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class Form1Servlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/form1");
		dispatcher.forward(req, resp);
		
		Connection  conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		PrintWriter out = resp.getWriter();
		

		try {
			
			
			//step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2 get the connection
			//String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			//conn = DriverManager.getConnection(url);
			
			conn = DriverManager.getConnection(url,"root","root");
			
			//step3
			String sql = "select * from employee_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			//step4
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String gender = rs.getString("salary");

				out.println("id is "+id);
				out.println("name is "+name);
				out.println("salary is "+salary);
				out.println("gender is "+gender);
				out.println("*************************");

			}

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}

}
