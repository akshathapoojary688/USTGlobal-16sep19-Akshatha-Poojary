package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		//here we are not taking resultset object as we are not using select query over here

		try {
			//step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2 get the connection
			String url  = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step3 issue sql query
			String sql = "update employee_info set name ='surya' ,salary = 800000, gender = 'M' where id = 2 ";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//step4 read the result set
			System.out.println("rows inserted "+count);


		}catch(SQLException e) {
			e.printStackTrace();
		}

		//step5 close the jdbc objects

		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


}

	
	

