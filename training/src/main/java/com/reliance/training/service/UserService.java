package com.reliance.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.training.dao.impl.UserDaoImpl;
import com.reliance.training.model.User;

@Service
public class UserService {

	@Autowired
	private UserDaoImpl userDao;

	public List<User> getUsers() {
		return this.userDao.getUsers();

	}

	public String addUser(User user) {
		return this.userDao.addUser(user);
	}

	public String deleteUser(int userId) {
		return this.userDao.deleteUser(userId);
	}

	public void updateUser(User user) {
		this.userDao.updateUser(user);
	}

	public User getUserById(int id) {
		return this.userDao.getUserById(id);
	}

}
