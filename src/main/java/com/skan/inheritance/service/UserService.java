package com.skan.inheritance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skan.inheritance.dao.IUserDao;
import com.skan.inheritance.entity.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User save(User user) {
		return this.userDao.save(user);
	}

	@Override
	public User findById(long id) {
		return this.userDao.findById(id);
	}

	@Override
	public User findByName(String name) {
		return this.userDao.findByName(name);
	}

	@Override
	public User findByEmail(String email) {
		return this.userDao.findByEmail(email);
	}

	@Override
	public List<User> findAll() {
		return this.userDao.findAll();
	}

}
