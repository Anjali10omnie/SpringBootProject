package com.user.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.management.entity.User;
import java.util.List;


public interface UserRepository  extends JpaRepository<User, Integer>{
	public User  findByEmail(String email);


	

}
