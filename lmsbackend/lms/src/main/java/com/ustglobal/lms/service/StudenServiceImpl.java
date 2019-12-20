package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.StudentDAO;
import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.BookRegistration;
import com.ustglobal.lms.dto.IssueBook;

@Service
public class StudenServiceImpl implements StudentService{

	@Autowired
	private StudentDAO dao1;

	@Override
	public Book searchBook(int bid) {
		return dao1.searchBook(bid);
	}

	@Override
	public List<Book> viewAllBook() {
		return dao1.viewAllBook();
	}

	@Override
	public Boolean requestBook(BookRegistration book) {
		return dao1.requestBook(book);
	}

	
}


