package com.reliance.training.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.training.model.User;
import com.reliance.training.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUsers() {
		return this.userService.getUsers();
	}

	@PostMapping("/user")
	// @RequestMapping(method = RequestMethod.POST, value = "/user")
	public void createUser(@RequestBody User user) {
		this.userService.addUser(user);
	}

	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable int userId) {
		this.userService.deleteUser(userId);
	}

	@PutMapping("/user")
	public void updateUserName(@RequestBody User user) {
		this.userService.updateUserName(user);
	}

}
