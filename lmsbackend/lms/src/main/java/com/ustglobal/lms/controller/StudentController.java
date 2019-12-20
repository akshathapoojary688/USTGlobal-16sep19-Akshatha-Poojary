package com.ustglobal.lms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.BookRegistration;
import com.ustglobal.lms.dto.LmsResponse;
import com.ustglobal.lms.service.StudentService;

@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")

@RestController
public class StudentController {
	
	LmsResponse response = new LmsResponse();
	
	@Autowired
	private StudentService service2;
	
	@GetMapping(path = "/view-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public LmsResponse viewAllBook() {
		LmsResponse response = new LmsResponse();
		List<Book> Book  = service2.viewAllBook();
		if(!Book.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setBookbeans(Book);
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		
		return response;
	}
	
	@GetMapping(path ="/search/{bid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LmsResponse searchBook(@PathVariable("bid") int bid){
		LmsResponse response = new LmsResponse();
		Book book = service2.searchBook(bid);
		
		if(book != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found in db");
			response.setBookbeans(Arrays.asList(book));	
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in db");
		}
		return response;
	}	
	
	@PostMapping(path="/request" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public  LmsResponse requestBook(@RequestBody BookRegistration book) {
		if(service2.requestBook(book)) {
			response.setStatusCode(201);   //if insertion is success
			response.setMessage("Success");
			response.setDescription("Data succesfully added to db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Failed to add data to db");
		}
		return response;
	}
	
	

}
