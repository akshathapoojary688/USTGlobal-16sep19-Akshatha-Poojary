package com.ustglobal.jdbcapp;   //this program is to insert csv.txt file data to mysql database

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCSVFile {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql =  "insert into employee_info values(?,?,?,?)";
		
		try(FileReader in = new FileReader("csv.txt");  //it is read the file
				BufferedReader reader = new BufferedReader(in);  //read the content of file
				
				
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)){  //if we give ? ie to give dynamic input 

			while(reader.ready()) {
				String line = reader.readLine();
				String[] datas = line.split(",");
				
				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int salary = Integer.parseInt(datas[2]);
				String gender = datas[3];
				
				pstmt.setInt(1, id); 
				pstmt.setString(2, name);
				pstmt.setInt(3, salary);
				pstmt.setString(4, gender);
				
//				int count = pstmt.executeUpdate();  this is difficult when we ha 10000 of data so instead of the
//				System.out.println("rows inserted "+count); we are using addBatch
				
				pstmt.addBatch();
				int[] count = pstmt.executeBatch();  //return type of addbatch is int[] 
				System.out.println("rows inserted "+count.length);
				

			}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
