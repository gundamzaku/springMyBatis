package com.springapp.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.mapper.UserMapper;
import com.springapp.model.User;
import com.springapp.service.UserService;

@Service("userService")
@Transactional  //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService {
	
	@Resource
	protected UserMapper mapper;

	public List<User> findAll() {
		List<User> findAllList = mapper.findAll();
		return findAllList;
	}

}
