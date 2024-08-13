package com.shivam.jpa.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID orderId;
	
	private double amount;
	private String email;
	private int noOfProducts;
	public OrderDetails(UUID orderId, double amount, String email, int noOfProducts) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.email = email;
		this.noOfProducts = noOfProducts;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	
	
}
