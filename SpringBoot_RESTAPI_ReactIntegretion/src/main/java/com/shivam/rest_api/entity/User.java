package com.shivam.rest_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "React_Spring_UserSignUp",
		uniqueConstraints = @UniqueConstraint(name="mailId_And_phoneNumber_Constraint",columnNames = {"Mail_Id","Phone_Number"}))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;
	@Column(name = "First_Name",nullable = false)
	private String firstName;
	@Column(name = "Last_Name",nullable = false)
    private String lastName;
	@Column(name = "Password",nullable = false)
    private String password;
	@Column(name = "Mail_Id",nullable = false)
    private String mailId;
	@Column(name = "Phone_Number",nullable = false)
    private Long phoneNumber;
	@Column(name = "Address",nullable = false)
    private String address;
	@Column(name = "Pincode",nullable = false)
    private Long pincode;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String firstName, String lastName, String password, String mailId, Long phoneNumber,
			String address, Long pincode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.pincode = pincode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", mailId=" + mailId + ", phoneNumber=" + phoneNumber + ", address=" + address + ", pincode="
				+ pincode + "]";
	}
	
	
	
}
