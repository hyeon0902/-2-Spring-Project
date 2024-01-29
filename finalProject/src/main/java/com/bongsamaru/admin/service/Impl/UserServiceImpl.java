package com.bongsamaru.admin.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bongsamaru.admin.mapper.UserMapper;
import com.bongsamaru.admin.service.UserService;
import com.bongsamaru.admin.service.UserVO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserVO> userList() {
		return userMapper.userList();
	}
	
	
}