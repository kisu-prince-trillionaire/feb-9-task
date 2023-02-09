package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.User;
import com.demo.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public int saveUser(User user) {
		return this.dao.saveUser(user);
	}

	public UserService(UserDao dao) {
		super();
		this.dao = dao;
	}

	public UserService() {
		super();
	}
}
