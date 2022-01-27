package com.reliance.training.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	/*
	 * @GetMapping("/user") public List<User> getUsers() { return
	 * this.userService.getUsers(); }
	 */

	@GetMapping("/user")
	public ResponseEntity<List<User>> getUsers() {
		List<User> userList = this.userService.getUsers();
		if (userList.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(userList));

	}

	@PostMapping("/user")
	public String createUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}

	@DeleteMapping("/user/{userId}")
	public String deleteUser(@PathVariable int userId) {
		return this.userService.deleteUser(userId);
	}

	@PutMapping("/user")
	public void updateUser(@RequestBody User user) {
		this.userService.updateUser(user);
	}

	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable int userId) {
		return this.userService.getUserById(userId);
	}

}
