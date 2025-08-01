package com.example.order_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order_service.entity.userDetails;
import com.example.order_service.service.userService;

@RestController
@RequestMapping("/api/user")
public class userController {
	@Autowired
	userService userservice;
	
	@PostMapping("/saveUser")
	public userDetails saveUser(@RequestBody userDetails user) {
		System.out.println("Inside userController --> saveUser");
		userservice.saveUser(user);
		user.toString();
		return user;
	}
	
	@GetMapping("/getuser")
	public List<userDetails> getusers() {
		return userservice.getAllUsers();
	}
	

}
