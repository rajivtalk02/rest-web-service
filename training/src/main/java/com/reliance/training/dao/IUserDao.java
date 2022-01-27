package com.reliance.training.dao;

import java.util.List;

import com.reliance.training.model.User;

public interface IUserDao {

	List<User> getUsers();

	User getUserById(int id);

	String addUser(User user);

	String deleteUser(int userId);

	void updateUser(User usertoUpdate);
}
