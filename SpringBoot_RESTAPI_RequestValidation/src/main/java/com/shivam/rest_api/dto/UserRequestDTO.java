package com.shivam.rest_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {

	@NotNull(message = "Full Name Can't be empty or blank")
	@Size(min = 5,max = 50,message = "Full Name can be consist 5 to 50 character")
	private String fullName;
	
	@NotNull(message = "UserName Can't be empty")
	@Size(min = 5,max = 50,message = "UserName can be consist 5 to 50 character")
	private String userName;
	
	@NotNull(message = "Email can't be empty or blank")
	@Email
	private String email;
	
	@NotNull(message = "Password can't be null or empty")
	@Size(min = 8,max = 20,message = "Password can consist 8 to 20 character")
	private String password;
	
	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "Contact number must be exactly 10 digits")
    private String contact;
	
	private String city;
	private String gender;
	
	public UserRequestDTO(
			@NotNull(message = "Full Name Can't be empty or blank") @Size(min = 5, max = 50, message = "Full Name can be consist 5 to 50 character") String fullName,
			@NotNull(message = "UserName Can't be empty") @Size(min = 5, max = 50, message = "UserName can be consist 5 to 50 character") String userName,
			@NotNull(message = "Email can't be empty or blank") @Email String email,
			@NotNull(message = "Password can't be null or empty") @Size(min = 8, max = 20, message = "Password can consist 8 to 20 character") String password,
			@NotNull @Pattern(regexp = "^\\d{10}$", message = "Contact number must be exactly 10 digits") String contact,
			String city, String gender) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.city = city;
		this.gender = gender;
	}

	public UserRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getContact() {
		Long cont=Long.parseLong(contact);
		return cont;
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

	@Override
	public String toString() {
		return "UserRequestDTO [fullName=" + fullName + ", userName=" + userName + ", email=" + email + ", password="
				+ password + ", contact=" + contact + ", city=" + city + ", gender=" + gender + "]";
	}
	
	
	
	
	
}
