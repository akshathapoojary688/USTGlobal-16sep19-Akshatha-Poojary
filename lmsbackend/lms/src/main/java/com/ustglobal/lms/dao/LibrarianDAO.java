package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.IssueBook;


public interface LibrarianDAO {

	public boolean addBook(Book book);
	public boolean removeBook(int bid);
	public List<Book> getAllBook();
	public Book searchBook(int bid);
	public boolean issueBook(IssueBook book);
	
	
}
