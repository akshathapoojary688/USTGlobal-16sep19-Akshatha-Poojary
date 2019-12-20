package com.ustglobal.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.IssueBook;
import com.ustglobal.lms.dto.LmsResponse;
import com.ustglobal.lms.service.LibrarianService;

@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true" )

@RestController
public class LibrarianController {
	
	LmsResponse response = new LmsResponse();
	
	@Autowired
	private LibrarianService service1;
	
	@PostMapping(path="/add" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public  LmsResponse addBook(@RequestBody Book book) {
		if(service1.addBook(book)) {
			response.setStatusCode(201);   //if insertion is success
			response.setMessage("Success");
			response.setDescription("Data succesfully added to db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Failed to add data to db");
		}
		return response;
	}//end of addBook
	
	@DeleteMapping(path="/delete/{bid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LmsResponse removeBook(@PathVariable("bid")int bid) {
		LmsResponse response = new LmsResponse();
		if(service1.removeBook(bid)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data deleted in the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not deleted in the db");
		}
		return response;
	}
	
	@PostMapping(path="/issuebooks" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public  LmsResponse issueBook(@RequestBody IssueBook book) {
		if(service1.issueBook(book)) {
			response.setStatusCode(201);   //if insertion is success
			response.setMessage("Success");
			response.setDescription("Data succesfully added to db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Failed to add data to db");
		}
		return response;
	}//end of addBook

}
