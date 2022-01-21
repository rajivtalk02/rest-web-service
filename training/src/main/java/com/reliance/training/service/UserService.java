package com.reliance.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.training.dao.UserDao;
import com.reliance.training.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getUsers() {
		return this.userDao.getUsers();

	}
}
