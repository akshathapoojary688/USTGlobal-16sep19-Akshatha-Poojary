package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.IssueBook;


@Service
public class LibrarianServiceImpl implements LibrarianService{

	@Autowired
	private LibrarianDAO dao2;
	
	@Override
	public List<Book> getAllBook() {
		return dao2.getAllBook();
	}

	@Override
	public boolean addBook(Book book) {
		return dao2.addBook(book);
	}

	@Override
	public boolean removeBook(int bid) {
		return dao2.removeBook(bid);
	}

	@Override
	public boolean issueBook(IssueBook book) {
		return dao2.issueBook(book);
	}

	

	

}
