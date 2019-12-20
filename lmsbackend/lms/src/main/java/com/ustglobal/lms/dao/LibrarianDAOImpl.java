 package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.IssueBook;


@Repository
public class LibrarianDAOImpl implements LibrarianDAO {

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addBook(Book book) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(book);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	@Override
	public boolean removeBook(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Book book = manager.find(Book.class, bid);
		if(book!=null) {
			manager.remove(book);
			transaction.commit();
			return true;
		}else {
			return false;
		}
	}

	
	@Override
	public List<Book> getAllBook() {
		String jpql = "from Book";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Book> query = manager.createQuery(jpql, Book.class);
		List<Book> books = query.getResultList();
		return books;
	}

	
	@Override
	public Book searchBook(int bid) {
		EntityManager manager = factory.createEntityManager();
		Book book = manager.find(Book.class, bid);
		return book;
	}


	@Override
	public boolean issueBook(IssueBook book) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(book);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	
}
