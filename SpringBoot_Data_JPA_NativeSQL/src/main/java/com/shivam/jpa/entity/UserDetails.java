package com.shivam.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	private int userId;
	
	private String email;
	
	private String name;
	
	private long contact;
	
	private int age;
	
	private String city;
	
	private String gender;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public long getConatct() {
		return contact;
	}

	public void setConatct(long contact) {
		this.contact = contact;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", email=" + email + ", name=" + name + ", contact=" + contact
				+ ", age=" + age + ", city=" + city + ", gender=" + gender + "]";
	}
	
	
	
}
