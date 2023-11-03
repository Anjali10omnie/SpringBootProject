package com.jwt.Example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.Example.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
