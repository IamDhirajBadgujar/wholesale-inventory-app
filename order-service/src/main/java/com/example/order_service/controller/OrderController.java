package com.example.order_service.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory_order_shared_dto.shared.OrderPlacedEvent;
import com.example.order_service.entity.Order;
import com.example.order_service.repository.OrderRepository;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepo;
	
	
	@GetMapping("/{id}")
	public Order getOrder(@PathVariable Long id) {
		return orderRepo.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
	}
	
	
//	@PostMapping
//	public Order placeOrder(@RequestBody  Order order) {
//		order.toString();
//		order.setStatus("Pending");
//		orderRepo.save(order);
//		return order;
//	}
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	@PostMapping
	public Order placeOrder(@RequestBody Order order) {
		
		System.out.println("-------------Inside Post mapping--------------");
	    order.setStatus("PENDING");
	    Order savedOrder = orderRepo.save(order);
	    System.out.println("-------------Print Order--------------: " + order.toString());

	    // Send event to Kafka
	    OrderPlacedEvent event = new OrderPlacedEvent(
	        savedOrder.getProductName(),
	        savedOrder.getQty(),
	        savedOrder.getPrice()
	    );
	    System.out.println("-------------event Created--------------");
	    kafkaTemplate.send("order-events", event);  // topic name: order-events
	    System.out.println("-------------Kafka conneted--------------");
	    return savedOrder;
	}

	
	
	

}
