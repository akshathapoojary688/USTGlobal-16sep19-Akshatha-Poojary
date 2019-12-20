package com.ustglobal.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.Admin;
import com.ustglobal.lms.dto.LmsResponse;
import com.ustglobal.lms.service.AdminService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true" )

@RestController
public class AdminController {
	
	LmsResponse response = new LmsResponse();
	
	@Autowired
	private AdminService service;
	
	@PostMapping(path="/login/{username}/{password}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public Admin login(@PathVariable("username") String username, @PathVariable("password") String password) {
		Admin admin = service.login(username, password);
//		if(admin == null) {
//			
//			response.setStatusCode(401);
//			response.setMessage("Failure");
//			response.setDescription("login failed");
//		}else {
//			
//			response.setStatusCode(201);   
//			response.setMessage("Success");
//			response.setDescription("Login Succesfully");
//		}
		
		return admin;
		
	}//end of login
	
	@PostMapping(path="/register",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public LmsResponse register(@RequestBody Admin  adminbean) {
		int check = service.register(adminbean);
		if(check > 0) {
			response.setStatusCode(201);   //if insertion is success
			response.setMessage("Success");
			response.setDescription("Registered Succesfully");
			System.out.println("your id is " +check);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("registration failed");
		}
		return response;
	}
	

}
