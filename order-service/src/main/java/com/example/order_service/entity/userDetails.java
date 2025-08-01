package com.example.order_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_info")
public class userDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name;
	String address;
	String pincode;
	String city;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public userDetails(Long id, String name, String address, String pincode, String city) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
	}
	public userDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "userDetails [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pincode + ", city="
				+ city + "]";
	}
	
	
	
	
	
	

}
