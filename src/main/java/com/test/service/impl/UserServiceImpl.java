package com.test.service.impl;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;

public class UserServiceImpl implements UserService {

	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public boolean addUrserInfo(User user) {
		return false;
	}
}
