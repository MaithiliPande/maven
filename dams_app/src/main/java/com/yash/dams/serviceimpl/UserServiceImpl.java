package com.yash.dams.serviceimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.yash.dams.dao.UserDAO;
import com.yash.dams.model.User;
import com.yash.dams.rowmapper.UserMapper;
import com.yash.dams.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Autowired
	UserDAO userDAO;
	public void registerUser(User user) {
		userDAO.insert(user);
	}
	@Override
	public User loginUser(String loginName, String password) {
		
		String sql = "select * from users where loginName='"+loginName+"' and password='"+password+"'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		if(users.isEmpty()) {
			return null;
		}else {
			return users.get(0);
		}
		
	}

}
