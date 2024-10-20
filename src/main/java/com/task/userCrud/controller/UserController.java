package com.task.userCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.task.userCrud.dto.UserDto;
import com.task.userCrud.model.User;
import com.task.userCrud.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody UserDto request) {
		try {
			userService.addUser(request);
			return ResponseEntity.ok("User added succesfully");
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@PostMapping("/updateName")
	public ResponseEntity<String> updateName(@RequestBody UserDto request) {
		try {
			userService.updateName(request);
			return ResponseEntity.ok("User updated successfully");
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@GetMapping("/findAll")
	public List<User> findAll() {
		try {
			return userService.findAll();
		}
	
	catch (Exception e) {
		throw new RuntimeException(e);
	}
	}
	
	@PostMapping("deleteUser")
	public ResponseEntity<String> deleteUser(@RequestParam int id) {
		try {
			userService.deleteUser(id);
			return ResponseEntity.ok("User deleted successfully");
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

