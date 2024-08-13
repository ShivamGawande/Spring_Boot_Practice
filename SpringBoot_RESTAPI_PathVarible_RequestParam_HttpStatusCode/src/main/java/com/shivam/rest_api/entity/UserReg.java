package com.shivam.rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_register")
public class UserReg {
	
	@Id
	private String email;
	private String fName;
	private String lName;
	private String city;
	private String gender;
	private String country;
	private Integer age;
	public UserReg(String email, String fName, String lName, String city, String gender, String country, Integer age) {
		super();
		this.email = email;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.gender = gender;
		this.country = country;
		this.age = age;
	}
	public UserReg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserReg [email=" + email + ", fName=" + fName + ", lName=" + lName + ", city=" + city + ", gender="
				+ gender + ", country=" + country + ", age=" + age + "]";
	}
	
	
}
