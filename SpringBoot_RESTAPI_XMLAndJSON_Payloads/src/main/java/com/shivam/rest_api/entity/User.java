package com.shivam.rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "UserReg_XML_JSON",uniqueConstraints = @UniqueConstraint(name="email and username",columnNames = {"email","username"}))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String fName;
	private String lName;
	@NotNull(message = "email can't be null")
	@Email(message = "please provide valid email format")
	private String email;
	@NotNull(message = "username can't be null or empty")
	private String username;
	@NotNull(message = "Password can't be null or empty")
	@Size(min = 8 , max = 10000,message = "Password must be greater than 8 character")
	private String password;
	private String city;
	private String gender;
	private String country;
	private Integer age;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String fName, String lName, String email, String username, String password, String city,
			String gender, String country, Integer age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.city = city;
		this.gender = gender;
		this.country = country;
		this.age = age;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "UserRequestDto [fName=" + fName + ", lName=" + lName + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", city=" + city + ", gender=" + gender + ", country=" + country + ", age="
				+ age + "]";
	}
	
	
	
}

