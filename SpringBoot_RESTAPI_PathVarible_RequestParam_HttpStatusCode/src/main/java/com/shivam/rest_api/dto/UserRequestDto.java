package com.shivam.rest_api.dto;

public class UserRequestDto {
	private String fName;
	private String lName;
	private String email;
	private String city;
	private String gender;
	private String country;
	private Integer age;
	
	public UserRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserRequestDto(String fName, String lName, String email, String city, String gender, String country,
			Integer age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
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
		return "UserRequestDto [fName=" + fName + ", lName=" + lName + ", email=" + email + ", city=" + city
				+ ", gender=" + gender + ", country=" + country + ", age=" + age + "]";
	}
	
	
}
