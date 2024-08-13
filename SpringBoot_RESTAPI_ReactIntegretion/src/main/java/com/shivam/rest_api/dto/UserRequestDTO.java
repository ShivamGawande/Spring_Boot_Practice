package com.shivam.rest_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {

	private String firstName;
    private String lastName;
    @Size(min = 8, max = 1000,message = "Password Size should be greater than 8")
    private String password;
    @Email(message = "Please give valid email format")
    private String mailId;
    private Long phoneNumber;
    private String address;
    private Long pincode;
    
	public UserRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserRequestDTO(String firstName, String lastName, String password, String mailId, Long phoneNumber,
			String address, Long pincode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.pincode = pincode;
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
		return "UserRequestDTO [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", mailId=" + mailId + ", phoneNumber=" + phoneNumber + ", address=" + address + ", pincode="
				+ pincode + "]";
	}
    
    
}
