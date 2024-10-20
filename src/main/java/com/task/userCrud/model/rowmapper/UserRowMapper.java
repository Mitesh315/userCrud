package com.task.userCrud.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.task.userCrud.model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setAge(rs.getInt("age"));
		user.setCity(rs.getString("city"));
		user.setMobile(rs.getLong("mobile"));
		user.setCreatedAt(rs.getTimestamp("created_time").toLocalDateTime());
		user.setUpdatedAt(rs.getTimestamp("updated_time").toLocalDateTime());
		return user;
	}

}
