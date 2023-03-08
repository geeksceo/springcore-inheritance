package com.skan.inheritance.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skan.inheritance.entity.User;

import jakarta.annotation.Nullable;

public interface IUserDao extends JpaRepository<User, Long> {
	
	@Nullable
	User findById(long id);
	
	@Nullable
	User findByEmail(String email);
	
	@Nullable
	User findByName(String name);
	
	List<User> findAll();
	
	// User update(User user);
	
	
}
