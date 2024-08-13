package com.shivam.rest_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRequestDto {
	private String name;
	private String email;
	private Long contact;
	private String gender;
	private AddressRequestDto address;
	
	public UserRequestDto(String name, String email, Long contact, String gender, AddressRequestDto address) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
	}

	public UserRequestDto() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public Long getContact() {
		return contact;
	}
	
	public void setContact(Long contact) {
		this.contact = contact;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public AddressRequestDto getAddress() {
		return address;
	}

	public void setAddress(AddressRequestDto address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserRequestDto [name=" + name + ", email=" + email + ", contact=" + contact + ", gender=" + gender
				+ "]";
	}
	
	
	
}
