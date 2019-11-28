package com.ustglobal.jdbcapp;


import java.sql.Statement;
import com.mysql.jdbc.Driver;
import java.sql.*;
public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection  conn = null;
		Statement stmt = null;
		ResultSet rs = null;

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

				System.out.println("id is "+id);
				System.out.println("name is "+name);  
				System.out.println("salary is "+salary);
				System.out.println("gender is "+gender);
				System.out.println("*************************");

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
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
