package com.ustglobal.lms.service;

import com.ustglobal.lms.dto.Admin;


public interface AdminService {
	
	public int register(Admin adminbean);
	public Admin login(String username,String password);

}
