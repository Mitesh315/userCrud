package com.task.userCrud.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.userCrud.dto.UserDto;
import com.task.userCrud.model.User;
import com.task.userCrud.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(UserDto request) {
		User user = toUser(request);
		user.setCreatedAt(new Timestamp(System.currentTimeMillis()).toLocalDateTime());
		user.setUpdatedAt(new Timestamp(System.currentTimeMillis()).toLocalDateTime());
		userRepository.addUser(user);
	}
	
	@Override
	public void updateName(UserDto request) {
		User user = toUser(request);
		user.setUpdatedAt(new Timestamp(System.currentTimeMillis()).toLocalDateTime());
		userRepository.updateName(user);
	}
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public void deleteUser(int id) {
		userRepository.deleteUser(id);
		
	}
	
	private User toUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAge(userDto.getAge());
		user.setCity(userDto.getCity());
		user.setMobile(userDto.getMobile());
		
		return user;
	}

	

}
