package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.BookRegistration;
import com.ustglobal.lms.dto.IssueBook;

public interface StudentService {
	
	public Book searchBook(int bid);
	public List<Book> viewAllBook();
	public Boolean requestBook(BookRegistration book);
	
	

}
