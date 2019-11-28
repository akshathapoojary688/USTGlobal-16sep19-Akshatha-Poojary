package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {

		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;

		//here we are not taking resultset object as we are not using select query over here

		try {
			//step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2 get the connection
			String url  = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step3 issue sql query
			//String sql = " insert into employee_info values(7, 'pranav', 56000, 'M') ";
			//String sql = "insert into employee_info("+args[0]+",'"+args[1]+"',"+args[2]+",'"+args[3]+"')";
			
			String sql = " insert into employee_info values(?,?,?,?)";//for dynamic query we are using preparedstmt
			//stmt = conn.createStatement();
			//int count = stmt.executeUpdate(sql);
			
			pstmt = conn.prepareStatement(sql);   //used for inserting values from the run cmd promft 
			//go to Run then select ur cls name then give all the values like 1 abhi 345678 M without colon semilon ""
			
			String empid = args[0];
			int id = Integer.parseInt(empid);  //parseInt bcs pstmt accept only string
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int salary = Integer.parseInt(empsal);
			pstmt.setInt(3, salary);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();

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
//				if(stmt!=null) {
//					stmt.close();
//				}
				if(pstmt!=null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


}
