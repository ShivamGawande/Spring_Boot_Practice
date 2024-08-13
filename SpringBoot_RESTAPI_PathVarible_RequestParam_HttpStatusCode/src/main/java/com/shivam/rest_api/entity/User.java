package com.shivam.rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	@Id
	private String email;
	private String pass;
	private String fullName;
	
	public User(String email, String pass, String fullName) {
		super();
		this.email = email;
		this.pass = pass;
		this.fullName = fullName;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "UserDTO [email=" + email + ", pass=" + pass + ", fullName=" + fullName + "]";
	}
}
