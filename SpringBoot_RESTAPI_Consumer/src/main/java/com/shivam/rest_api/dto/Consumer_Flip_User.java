package com.shivam.rest_api.dto;

public class Consumer_Flip_User {

	private String name;
	private String email;
	private Long contact;
	private String gender;
	private Consumer_Flip_Address address;
	
	public Consumer_Flip_User(String name, String email, Long contact, String gender, Consumer_Flip_Address address) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
	}

	public Consumer_Flip_User() {
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

	public Consumer_Flip_Address getAddress() {
		return address;
	}

	public void setAddress(Consumer_Flip_Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Consumer_Flip_User [name=" + name + ", email=" + email + ", contact=" + contact + ", gender=" + gender
				+ ", address=" + address + "]";
	}
	
	
}
