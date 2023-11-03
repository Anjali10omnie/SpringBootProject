package com.jwt.Example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.Example.entity.User;

@Service
public class UserServiceImpl  {
	
//	@Autowired
//	private UserRepository userRepo;
//
//	@Override
//	public User saveUser(User user) {
//		
//		return  userRepo.save(user);
	
	private List<User> store=new ArrayList<>();

	public UserServiceImpl() {
		
	store.add(new User(UUID.randomUUID().toString(),"Anjali Singh","anjalisingh@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"Somaya Singh","somayasingh@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"Pooja Singh","poojasingh@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"Poonam Singh","poonamsingh@gmail.com"));
	}
 public List<User>getUser()
 {
	 return this.store;
 }
}
