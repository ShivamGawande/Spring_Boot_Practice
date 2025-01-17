package com.shivam.user.dto;

public class UserRequuestDTO {

	private String email;
	private String name;
	private String password;
	private String contact;
	private String city;
	private String gender;
	
	public UserRequuestDTO(String email, String name, String password, String contact, String city, String gender) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.contact = contact;
		this.city = city;
		this.gender = gender;
	}
	
	public UserRequuestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
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
