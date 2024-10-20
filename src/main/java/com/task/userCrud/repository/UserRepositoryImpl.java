package com.task.userCrud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.task.userCrud.dto.UserDto;
import com.task.userCrud.model.User;
import com.task.userCrud.model.rowmapper.UserRowMapper;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<User> findAll() {
		String sql = "SELECT * FROM user";
		return jdbcTemplate.query(sql, new UserRowMapper());
	}

	@Override
	public void addUser(User user) {
		String sql = "INSERT INTO user (id, name, email, age, city, mobile, created_time, updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getId(), user.getName(), user.getEmail(), user.getAge(), user.getCity(), user.getMobile(), user.getCreatedAt(), user.getUpdatedAt());
	}

	@Override
	public void updateName(User user) {
		String sql = "UPDATE user SET name = ? where id = ?";
		jdbcTemplate.update(sql, user.getName(), user.getId());
	}

	@Override
	public void deleteUser(int id) {
		String sql = "DELETE FROM USER WHERE id = ?";
		jdbcTemplate.update(sql, id);
		
	}
	
	
}
