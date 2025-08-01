package com.example.inventory_service.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.inventory_service.entity.OrderPlacedEvent;

@Service
public class KafkaOrderConsumer {

    @KafkaListener(topics = "order-events", groupId = "inventory-group")
    public void handleOrderPlaced(OrderPlacedEvent event) {
        System.out.println("📦 InventoryService received: " + event);

        // You can now check/adjust stock, simulate inventory logic, etc.
    }
}
