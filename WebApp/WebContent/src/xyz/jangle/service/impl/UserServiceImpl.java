package xyz.jangle.service.impl;

import org.springframework.stereotype.Service;

import xyz.jangle.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getUser() {
		
		System.out.println("UserServiceImpl Method.");
		return "hello";
	}

}
