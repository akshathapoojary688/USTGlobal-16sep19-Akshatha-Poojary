package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.IssueBook;

public interface LibrarianService {
	
	public List<Book> getAllBook();
	public boolean addBook(Book book);
	public boolean removeBook(int bid);
	public boolean issueBook(IssueBook book);
	
}
