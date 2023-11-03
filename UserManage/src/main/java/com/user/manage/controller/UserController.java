package com.user.manage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.manage.entity.User;
import com.user.manage.service.UserServic;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServic userServic;
	
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		User user1=userServic.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@GetMapping
	public ResponseEntity<List<User>>getAllUser()
	{
		List<User> allUser=userServic.getAllUser();
		return ResponseEntity.ok(allUser);
	}

	@GetMapping("/user{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable String userId)
	{
		Optional<User> user=userServic.findByID(userId);
		return ResponseEntity.ok(user);
		
	}
	
	
}
