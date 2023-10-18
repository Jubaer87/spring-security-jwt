package com.jubaer.Security.service;

import com.jubaer.Security.exception.UserException;
import com.jubaer.Security.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	

}
