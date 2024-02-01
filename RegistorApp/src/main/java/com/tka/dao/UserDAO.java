package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.User;

public class UserDAO {
	
	public void saveToDataBase(User user) {
		
		Configuration  configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(User.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
		
	}
	
	public User getUser(String username) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(User.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		User userFromDB = session.get(User.class, username);
		
		return userFromDB;
	}
	
}
