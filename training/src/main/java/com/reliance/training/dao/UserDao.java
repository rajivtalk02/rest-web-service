package com.reliance.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.reliance.training.model.User;

@Component
public class UserDao {

	private static List<User> usersList = new ArrayList<User>();

	// hard coded users list
	static {
		usersList.add(new User(1, "Rohit", "rohit@gmail.com", "Chennai"));
		usersList.add(new User(2, "Virat", "virat@gmail.com", "Delhi"));

	}

	public List<User> getUsers() {
		return this.usersList;
	}

	public void addUser(User user) {
		this.usersList.add(user);
	}

	public void deleteUser(int userId) {
		List<User> userFound = new ArrayList<User>();
		for (User user : usersList) {
			if (user.getId() == userId) {
				userFound.add(user);
			}
		}
		usersList.removeAll(userFound);
	}

	public void updateUser(User user) {

		for (User obj : usersList) {
			if (obj.getId() == user.getId()) {
				obj.setUsername(user.getUsername());
			}
		}
	}

}
