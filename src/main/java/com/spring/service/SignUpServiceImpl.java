package com.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.SignUpDao;
import com.spring.model.SignUp;

@Service
public class SignUpServiceImpl implements SignUpService {

	private SignUpDao signDao;
	
	@Autowired
	public void setSignDao(SignUpDao signDao) {
		this.signDao = signDao;
	}
	
	@Transactional
	public void doSignUp(SignUp s) {
		this.signDao.doSignUp(s);
		
	}

}
