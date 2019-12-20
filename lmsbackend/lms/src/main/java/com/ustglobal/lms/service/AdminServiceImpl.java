package com.ustglobal.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.AdminDAO;
import com.ustglobal.lms.dto.Admin;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDAO dao;
	
	
	@Override
	public int register(Admin adminbean) {
		
		return dao.register(adminbean);
	}

	@Override
	public Admin login(String username, String password) {
		return dao.login(username, password);
	}

}
