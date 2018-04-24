package com.yash.dams.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.yash.dams.dao.UserDAO;
import com.yash.dams.model.User;
/**
 * This is the implementation of UserDAO interface. 
 * @author maithili.pande
 *
 */
@Repository
public class UserDAOImpl implements UserDAO{
	private static final Logger logger =Logger.getLogger(UserDAOImpl.class);
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
	Connection con =null;
	PreparedStatement pstmt= null;
	
	public void insert(User user) {
		try {
			String sql="insert into users(firstName,lastName,contact,email,address,loginName,password) values(?,?,?,?,?,?,?)";
			Object []params = new Object[] {
					user.getFirstName(),
					user.getLastName(),
					user.getContact(),
					user.getEmail(),
					user.getAddress(),
					user.getLoginName(),
					user.getPassword()
			};
			jdbcTemplate.update(sql, params);
			logger.info("rocord has been inserted successfully");
		}catch (Exception e) {
			logger.error(e);
		}
	}

}
