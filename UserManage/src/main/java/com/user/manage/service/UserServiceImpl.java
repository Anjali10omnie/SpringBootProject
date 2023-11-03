package com.user.manage.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.manage.Repo.UserRepository;
import com.user.manage.entity.User;

@Service
public class UserServiceImpl implements UserServic {
	 
	@Autowired
	 private UserRepository userRepo;
	@Override
	public User saveUser(User user) {
		String id=UUID.randomUUID().toString();
		user.setUserId(id);
		return  userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepo.findAll();
	}

//	@Override
//	public User getUserById(String userId) {
//		
//		return userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User not Found"));
//	}
	
	public Optional<User> findByID(String userId) {
		return userRepo.findById(userId);
	}

	@Override
	public User UpdateUser(User user) {
		
	User user1=	userRepo.save(user);
		return user;
	}

	@Override
	public void  Delete(User user) {
		 userRepo.delete(user);
		
	}

}
