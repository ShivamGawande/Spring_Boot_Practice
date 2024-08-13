package com.shivam.order.dto;

public class OrderDTO {
	
	String orderId;
	String name;
	String email;
	String contact;
	double amount;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public OrderDTO(String orderId, String name, String email, String contact, double amount) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.amount = amount;
	}
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
