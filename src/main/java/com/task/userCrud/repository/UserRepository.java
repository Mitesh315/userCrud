package com.task.userCrud.repository;

import java.util.List;

import com.task.userCrud.model.User;

public interface UserRepository {

	List<User> findAll();
	void addUser(User user);
	void updateName(User user);
	void deleteUser(int id);
}
