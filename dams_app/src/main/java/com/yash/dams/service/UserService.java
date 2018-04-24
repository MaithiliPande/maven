package com.yash.dams.service;

import com.yash.dams.model.User;

public interface UserService {
	public void registerUser(User user);
	public User loginUser(String loginName, String password);
}
