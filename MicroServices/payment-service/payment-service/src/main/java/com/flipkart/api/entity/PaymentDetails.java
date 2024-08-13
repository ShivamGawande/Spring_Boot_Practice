package com.flipkart.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "flipkart_payments")
public class PaymentDetails {

	@Id
	String userId;
	String name;
	String password;
	double avilabaleBalnce;
	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentDetails(String userId, String name, String password, double avilabaleBalnce) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.avilabaleBalnce = avilabaleBalnce;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAvilabaleBalnce() {
		return avilabaleBalnce;
	}
	public void setAvilabaleBalnce(double avilabaleBalnce) {
		this.avilabaleBalnce = avilabaleBalnce;
	}
	
	

}
