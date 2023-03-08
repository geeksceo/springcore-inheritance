package com.skan.inheritance.service;

import java.util.List;

import com.skan.inheritance.entity.User;

public interface IUserService {

	public User save(User user);
	
	public User findById(long id);
	
	public User findByName(String name);
	
	public User findByEmail(String email);
	
	public List<User> findAll();
}
