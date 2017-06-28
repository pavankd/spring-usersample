package com.wimedics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wimedics.model.User;
import com.wimedics.repository.UserRespository;

@Service("userService")
public class UserService {

	
	@Autowired
	private UserRespository userRespository;
	
	@Transactional
	public List<User> getAllUsers(){
		return (List<User>) userRespository.findAll();
	}
	
	@Transactional	
	public Long createUser(User user){
		return userRespository.save(user).getId();
	}
	
	@Transactional
	public void updateUser(User user){
		userRespository.save(user);
	}
	
	@Transactional
	public void deleteUser(Long userId){
		userRespository.delete(userId);
	}
}
