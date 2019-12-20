package com.ustglobal.lms.dao;

import com.ustglobal.lms.dto.Admin;

public interface AdminDAO {
	
	public int register(Admin adminbean);
	public Admin login(String username,String password);

}
