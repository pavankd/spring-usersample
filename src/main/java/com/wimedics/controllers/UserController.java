package com.wimedics.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wimedics.model.User;
import com.wimedics.service.UserService;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/addUser",method=RequestMethod.POST)
	public @ResponseBody Long addNewUser(@RequestBody User user){
		System.out.println("user"+user);
		return userService.createUser(user);

	}
	
	@RequestMapping(path="/allUsers",method=RequestMethod.GET)
	public @ResponseBody List<User> getAllUsers(){
		return userService.getAllUsers();
	}

}
