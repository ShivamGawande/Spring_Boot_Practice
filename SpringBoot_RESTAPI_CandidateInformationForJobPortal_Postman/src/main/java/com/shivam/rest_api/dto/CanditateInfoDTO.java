package com.shivam.rest_api.dto;

import java.util.List;

public class CanditateInfoDTO {
	
	private String fname;
	private String lname;
	private String email;
	private Long contact;
	private String gender;
	
	private AddressDTO address;
	
	private List<EducationDTO> education;

	public CanditateInfoDTO(String fname, String lname, String email, Long contact, String gender, AddressDTO address,
			List<EducationDTO> education) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
		this.education = education;
	}

	public CanditateInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public List<EducationDTO> getEducation() {
		return education;
	}

	public void setEducation(List<EducationDTO> education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "CanditateInfoDTO [fname=" + fname + ", lname=" + lname + ", email=" + email + ", contact=" + contact
				+ ", gender=" + gender + ", address=" + address + ", education=" + education + "]";
	}
	
	
	
}
