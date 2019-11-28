package com.ustglobal.jdbcapp;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;



public class MyFirstJdbcWithProperties {

	public static void main(String[] args) {

		Connection  conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			
			
			//step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2 get the connection
			//String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			//String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			
			String url = prop.getProperty("url");
			
			//conn = DriverManager.getConnection(url);
			conn = DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
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

		} catch(Exception e) {
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
				if(reader!=null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
