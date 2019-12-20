package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.BookRegistration;


public interface StudentDAO {
	
	public Book searchBook(int bid);
	public List<Book> viewAllBook();
	public Boolean requestBook(BookRegistration book);
}
