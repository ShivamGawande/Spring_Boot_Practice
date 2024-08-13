package com.shivam.mvc.admin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_dts")
public class AdminDetails {
	
	@Id
	private String email;
	
	@Column(name="first_name")
	private String fName;
	
	@Column(name="last_name")
	private String lName;
	
	private Long mobileNo;
	private String gender;
	private String password;
	
	public AdminDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminDetails(String email, String fName, String lName, Long mobileNo, String gender, String password) {
		super();
		this.email = email;
		this.fName = fName;
		this.lName = lName;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.password = password;
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

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
