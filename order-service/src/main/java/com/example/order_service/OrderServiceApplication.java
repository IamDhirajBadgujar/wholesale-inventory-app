package com.example.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.order_service.entity.userDetails;
import com.example.order_service.service.userService;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
		
		userDetails user=new userDetails((long) 1,"Dhiraj","Shiva Generel Store","410206","Panvel");
		System.out.println(user.toString());
	}

}
