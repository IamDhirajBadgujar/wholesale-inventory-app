package com.example.inventory_order_shared_dto.shared;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
    public OrderPlacedEvent(String productName2, int qty, double price2) {
		// TODO Auto-generated constructor stub
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public OrderPlacedEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String productName;
    private int quantity;
    private double price;
}
