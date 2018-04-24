package com.yash.dams.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.dams.model.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setContact(rs.getString("contact"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setLoginName(rs.getString("loginName"));
		user.setPassword(rs.getString("password"));
		return user;
	}

}
