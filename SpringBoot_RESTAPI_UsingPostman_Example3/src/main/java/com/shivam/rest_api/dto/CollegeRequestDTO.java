package com.shivam.rest_api.dto;

public class CollegeRequestDTO {
	private String college_name;
	private String location;
	private AddressRequestDto address;
	
	public CollegeRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegeRequestDTO(String college_name, String location, AddressRequestDto address) {
		super();
		this.college_name = college_name;
		this.location = location;
		this.address = address;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public AddressRequestDto getAddress() {
		return address;
	}

	public void setAddress(AddressRequestDto address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CollegeRequestDTO [college_name=" + college_name + ", location=" + location + ", address=" + address
				+ "]";
	}
	
	
}
