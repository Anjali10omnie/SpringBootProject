package com.user.manage.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.manage.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
