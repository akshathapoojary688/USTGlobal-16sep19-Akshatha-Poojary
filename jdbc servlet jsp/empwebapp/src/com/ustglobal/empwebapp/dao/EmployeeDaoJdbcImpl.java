package com.ustglobal.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public class EmployeeDaoJdbcImpl implements EmployeeDAO{

	private final String url = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String SELECT_QRY ="select * from employee_info where id = ?";
	private static final String INSERT_QRY = "insert into employee_info values(?,?,?,?)";
	private static final String UPDATE_QRY = "update Employee_Info set password =? where id =?";

	public EmployeeInfo auth(int id, String password) {
		//String sql = "select * from Employee_info where id =? and password = ?";
		EmployeeInfo info = searchEmployee(id);
		if(info!=null) {
			String pass = info.getPassword();
			if(pass.equals(password)) {
				return info;
			} else {
				return null;
			}
		}

		return null;
	}

	public EmployeeInfo searchEmployee(int id) {
		
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(SELECT_QRY)) {
				pstmt.setInt(1, id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next() ) {
						EmployeeInfo info = new EmployeeInfo();
						info.setId(rs.getInt("id"));
						info.setName(rs.getString("name"));
						info.setEmail(rs.getString("email"));
						info.setPassword(rs.getString("password"));

						return info;

					}else {
						return null;
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean changePassword(int id, String password) {
		
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(UPDATE_QRY)) {
				pstmt.setString(1, password);
				pstmt.setInt(2, id);

				int count = pstmt.executeUpdate();
				if(count>0) {
					return true;
				}else {
					return false;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}



	public boolean registerEmployee(EmployeeInfo info) {
		


		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(INSERT_QRY)) {
				pstmt.setInt(1, info.getId());
				pstmt.setString(2, info.getName());
				pstmt.setString(3, info.getEmail());
				pstmt.setString(4, info.getPassword());

				int count = pstmt.executeUpdate();
				if(count>0) {
					return true;
				}else {
					return false;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
