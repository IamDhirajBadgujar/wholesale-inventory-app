package com.example.order_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order_service.entity.inventory;
import com.example.order_service.entity.userDetails;
import com.example.order_service.repository.inventoryRepository;

@Service
public class inventoryService {
	
	@Autowired
	inventoryRepository inventoryRepo;
	
	
	public Optional<inventory> getInventoryByUserid(Long userid){
		//return inventoryRepo.findByuserid(userid);
		return inventoryRepo.findById(userid);
	}

}
