package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.Book;
import com.ustglobal.lms.dto.BookRegistration;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;

	
	
	@Override
	public Book searchBook(int bid) {
		EntityManager manager = factory.createEntityManager();
		Book book = manager.find(Book.class, bid);
		return book;

	}

	@Override
	public List<Book> viewAllBook() {
		String jpql = "from Book";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Book> query = manager.createQuery(jpql, Book.class);
		List<Book> employeeBeans = query.getResultList();
		return employeeBeans;	
	}

	@Override
	public Boolean requestBook(BookRegistration book) {
		
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
