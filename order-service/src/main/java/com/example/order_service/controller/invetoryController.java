package com.example.order_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order_service.entity.inventory;
import com.example.order_service.repository.inventoryRepository;
import com.example.order_service.service.inventoryService;

@RestController
@RequestMapping("/api/inventory")
public class invetoryController {
	
	@Autowired
	inventoryService inventoryservice;
	
	
	@GetMapping("/GetUserItems/{userID}")
	public Optional<inventory> getUserItems(@PathVariable int userid){
		return inventoryservice.getInventoryByUserid((long) userid);
		
	}

}
