package com.ustglobal.lms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.Admin;
@Repository
public class AdminDaoImpl implements AdminDAO{

	@PersistenceUnit
	EntityManagerFactory factory;
	@Override
	public int register(Admin adminbean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(adminbean);
			transaction.commit();
			return adminbean.getId();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return -1;
		}

	}


	
	@Override
	public Admin login(String username, String password) {
		String jpql = "from Admin where username=:username and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Admin> query = manager.createQuery(jpql, Admin.class);
		query.setParameter("username", username);
		query.setParameter("password", password);
		try {
			Admin admin = query.getSingleResult();	
			return admin;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	

	
}
