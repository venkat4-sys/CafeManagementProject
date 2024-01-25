package com.ait.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.User;


public interface UserRepo extends JpaRepository<User, Integer>{

	 User findByEmail(String email);
}
