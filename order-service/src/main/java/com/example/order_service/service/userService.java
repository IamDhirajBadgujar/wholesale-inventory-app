package com.example.order_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order_service.entity.userDetails;
import com.example.order_service.repository.userRepository;

@Service
public class userService {
	@Autowired
	userRepository userRepo;
	
	public userDetails saveUser(userDetails user) {
		System.out.println("Inside userService --> saveUser");
		userRepo.save(user);
		return user;
	}

	public List<userDetails> getAllUsers() {
		return userRepo.findAll();// TODO Auto-generated method stub
		
	}
	
	

}
