package com.flipkart.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetBankingUserDetailsDto {

	String userId;
	String name;
	String password;
	double avilabaleBalnce;
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
	public NetBankingUserDetailsDto(String userId, String name, String password, double avilabaleBalnce) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.avilabaleBalnce = avilabaleBalnce;
	}
	public NetBankingUserDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
