package com.example.order_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.order_service.entity.inventory;
import com.example.order_service.entity.userDetails;

@Repository
public interface inventoryRepository extends JpaRepository<inventory,Long>{
	
//	@Query("select i from inventory i where i.userid = ?1")
//	List<inventory> findByuserid(Long userid);

}
