package com.ssm.Mapper;

import java.util.List;

import com.ssm.pojo.User;

public interface UserMapper {
	
	public List<User> findusers();
	public void deleteUser(int id);
	public void updateUser(User user);
	public User findOne(int id);
	public User findpwd(String username);
	public void insert(User user);

}
