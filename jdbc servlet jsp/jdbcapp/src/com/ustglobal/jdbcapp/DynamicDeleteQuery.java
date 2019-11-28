package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		


		//here we are not taking resultset object as we are not using select query over here

		try {
			//step 1 load the driver
//			Driver driver = new Driver(); 
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");

			//step2 get the connection
			String url  = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step3 issue sql query
			String sql = "delete from employee_info where id = ?";
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			
			//step4 read the result set
			System.out.println("rows inserted "+count);


		}catch(Exception e) {
			e.printStackTrace();
		}

		//step5 close the jdbc objects

		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


}

	
	

