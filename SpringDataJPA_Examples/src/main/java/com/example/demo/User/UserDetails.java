package com.example.demo.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	/*
	 * CREATE TABLE user_details(user_id NUMBER(5), email varchar2(50), name
	  varchar2(50), contact NUMBER(10),age number(3) , city varchar2(50), gender
	  varchar2(10) );
	 */
	
	@Id
	@Column(name="user_id")
	private int userid;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	@Column(name="contact")
	private long contact;
	
	@Column(name="age")
	private int age;
	
	@Column(name="city")
	private String city;
	
	@Column(name="gender")
	private String gender;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
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

	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", email=" + email + ", name=" + name + ", contact=" + contact
				+ ", age=" + age + ", city=" + city + ", gender=" + gender + "]";
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
