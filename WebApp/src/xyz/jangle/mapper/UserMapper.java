package xyz.jangle.mapper;

import java.util.List;

import xyz.jangle.model.User;

public interface UserMapper {
	
	void sava();
	boolean update(User user);
	boolean delete(int id);
	User findById(int id);
	List<User> findAll();

}
