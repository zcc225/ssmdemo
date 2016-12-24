package com.zccpro.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zccpro.dao.UserMapper;
import com.zccpro.domain.User;
import com.zccpro.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper mapper;
	
	public User selectUser(int id) {
		
		return mapper.selectByPrimaryKey(id);
	}

}
