package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.SignUp;

@Repository
public class SignUpDaoImpl implements SignUpDao {

private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public void doSignUp(SignUp s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(s);
		
	}

}
