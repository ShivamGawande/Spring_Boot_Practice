package com.shivam.mvc.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user_dts")
public class UserDetails {

	@Id
	private String email;
	@Column(name="first_name")
	private String fName;
	@Column(name="last_name")
	private String lName;
	@Column(name="mobile_no")
	private String mobile;
	private String gender;
	private String pass;
	public UserDetails(String email, String fName, String lName, String mobile, String gender, String pass) {
		super();
		this.email = email;
		this.fName = fName;
		this.lName = lName;
		this.mobile = mobile;
		this.gender = gender;
		this.pass = pass;
	}
	public UserDetails() {
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
