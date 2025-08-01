package com.example.order_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class inventory {
	
	@ManyToOne
	userDetails user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id ;
	String itemname;
	String itemdesc;
	double price;
	boolean stockPresent;
	public userDetails getUser() {
		return user;
	}
	public void setUser(userDetails user) {
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemdesc() {
		return itemdesc;
	}
	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isStockPresent() {
		return stockPresent;
	}
	public void setStockPresent(boolean stockPresent) {
		this.stockPresent = stockPresent;
	}
	public inventory(com.example.order_service.entity.userDetails user, Long id, String itemname, String itemdesc,
			double price, boolean stockPresent) {
		super();
		this.user = user;
		this.id = id;
		this.itemname = itemname;
		this.itemdesc = itemdesc;
		this.price = price;
		this.stockPresent = stockPresent;
	}
	public inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "inventory [user=" + user + ", id=" + id + ", itemname=" + itemname + ", itemdesc=" + itemdesc
				+ ", price=" + price + ", stockPresent=" + stockPresent + "]";
	}
	
	
	
	
	

}
