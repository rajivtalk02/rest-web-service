package com.reliance.training.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.reliance.training.dao.IUserDao;
import com.reliance.training.model.User;

@Component
public class UserDaoImpl implements IUserDao {

	List<User> usersList;

	public UserDaoImpl() {

		usersList = new ArrayList<>();
		usersList.add(new User(1, "Rohit", "rohit@gmail.com", "Chennai"));
		usersList.add(new User(2, "Virat", "virat@gmail.com", "Delhi"));

	}

	public List<User> getUsers() {
		return this.usersList;
	}

	public User getUserById(int id) {
		User userFound = null;
		for (User user : this.usersList) {
			if (user.getId() == id) {
				userFound = user;
			}
		}
		return userFound;
	}

	public String addUser(User user) {

		this.usersList.add(user);
		return "User created successfully";
	}

	public String deleteUser(int userId) {
		String response = "User Not found";
		List<User> userFound = new ArrayList<User>();
		for (User user : this.usersList) {
			if (user.getId() == userId) {
				userFound.add(user);
				response = "User removed successfully";
			}
		}
		this.usersList.removeAll(userFound);
		return response;
	}

	public void updateUser(User usertoUpdate) {

		this.usersList.forEach(user -> {
			if (user.getUsername().equalsIgnoreCase(usertoUpdate.getUsername())) {
				user.setCity(usertoUpdate.getCity());
				user.setEmail(usertoUpdate.getEmail());
			}
		});
	}

}
