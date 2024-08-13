package com.shivam.rest_api.dto;

public class StudentRequestDto {
	private String name;
	private String email;
	private Long contact;
	private String gender;
	private CollegeRequestDTO college;
	
	public StudentRequestDto(String name, String email, Long contact, String gender, CollegeRequestDTO college) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.college = college;
	}

	public StudentRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CollegeRequestDTO getCollege() {
		return college;
	}

	public void setCollege(CollegeRequestDTO college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "StudentRequestDto [name=" + name + ", email=" + email + ", contact=" + contact + ", gender=" + gender
				+ ", college=" + college + "]";
	}
	
	
}
