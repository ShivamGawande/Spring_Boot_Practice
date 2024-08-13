package com.flipkart.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentLoginDetailsDto {

	String userId;
	
	String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PaymentLoginDetailsDto(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public PaymentLoginDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
