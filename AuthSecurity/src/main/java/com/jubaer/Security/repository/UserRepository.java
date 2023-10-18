package com.jubaer.Security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jubaer.Security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
}
