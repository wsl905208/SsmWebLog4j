package xyz.jangle.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.jangle.mapper.UserMapper;
import xyz.jangle.model.User;
import xyz.jangle.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);   

	@Autowired
	UserMapper userMapper;

	@Override
	public String getUser() {
		logger.info("UserServiceImpl Method.");
		logger.error("这是什么鬼");
		logger.debug("这是一个bug");
		List<User> userList = userMapper.findAll();
		for (User user : userList) {
			System.out.println("id:" + user.getUserId());
			System.out.println("age:" + user.getUserAge());
			System.out.println("name:" + user.getUserName());
		}

		User user = userMapper.findById(1);
		if(user != null) {
			System.out.println("单用户信息查询，Name:" + user.getUserName());
		}
		return "hello";
	}

}
