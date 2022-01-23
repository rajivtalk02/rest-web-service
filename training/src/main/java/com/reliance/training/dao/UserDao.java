package com.reliance.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.reliance.training.model.User;

@Component
public class UserDao {

	List<User> usersList = new ArrayList<User>();

	// hard coded users list
	public List<User> getUsers() {
		usersList.add(new User(1, "Rohit", "rohit@gmail.com", "Chennai"));
		usersList.add(new User(2, "Virat", "virat@gmail.com", "Delhi"));

		return usersList;
	}

	public void addUser(User user) {
		this.usersList.add(user);
	}

	public void deleteUser(int userId) {

		for (User user : usersList) {
			if (user.getId() == userId) {
				this.usersList.remove(user);
			}
		}
	}

	public void updateUser(String username) {

		for (User user : usersList) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				user.setUsername(username);
			}
		}
	}

}
