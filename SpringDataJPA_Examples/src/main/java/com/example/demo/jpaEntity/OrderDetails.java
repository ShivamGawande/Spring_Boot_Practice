package com.example.demo.jpaEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_Details")
public class OrderDetails {
	/*
	 * 
	 * Col : oid NUMBER(5) col : email varchar2(50) cOl : name varchar2(50) Col :
	 * no_of_items NUMBER(2) Col: amount number(5,2) Col: city varchar2(50) Col :
	 * gender varchar2(10)
	 * 
	 */
	
	@Id
	@Column(name="oid")
	private int orderId;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="no_of_items")
	private int noOfItems;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="city")
	private String city;
	
	@Column(name="gender")
	private String gender;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
