package com.user.manage.service;

import java.util.List;
import java.util.Optional;

import com.user.manage.entity.User;

public interface UserServic {
	public User saveUser(User user);
	public List<User> getAllUser();
//	public User findById(String userId);
	public Optional<User> findByID(String userId);
	public User UpdateUser(User user);
	public void Delete(User user);
	

}
