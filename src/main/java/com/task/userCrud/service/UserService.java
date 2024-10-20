package com.task.userCrud.service;

import java.util.List;

import com.task.userCrud.dto.UserDto;
import com.task.userCrud.model.User;

public interface UserService {
	
	void addUser(UserDto userDto);
	void updateName(UserDto userDto);
	List<User> findAll();
	void deleteUser(int id);
	

}
