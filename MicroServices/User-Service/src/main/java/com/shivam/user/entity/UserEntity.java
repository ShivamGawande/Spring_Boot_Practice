package com.shivam.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "MS_Flip_User_DTS")
@Builder
public class UserEntity {
	
	@Id
	String email;
	String name;
	String password;
	String contact;
	String city;
	String gender;
	
	public UserEntity(String email, String name, String password, String contact, String city, String gender) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.contact = contact;
		this.city = city;
		this.gender = gender;
	}
	
	public UserEntity() {
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
