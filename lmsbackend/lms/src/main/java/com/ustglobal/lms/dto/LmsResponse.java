package com.ustglobal.lms.dto;

import java.util.List;

public class LmsResponse {

	private int statusCode;
	private String message;
	private String description;
	public List<Book> getBookbeans() {
		return bookbeans;
	}
	public void setBookbeans(List<Book> bookbeans) {
		this.bookbeans = bookbeans;
	}
	
	private List<Book> bookbeans;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
