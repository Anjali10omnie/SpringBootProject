package com.user.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.management.entity.User;
import com.user.management.repo.UserRepository;


@Service
public class UserServiceimpl implements UserServices {

	
	@Autowired
	private UserRepository userRepo;
		
	public User createUser(User user) {
		userRepo.save(user);
		return user;
	}
	
}
