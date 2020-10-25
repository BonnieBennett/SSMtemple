package com.itycl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itycl.mapper.UserMapper;
import com.itycl.po.User;
import com.itycl.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}

}
