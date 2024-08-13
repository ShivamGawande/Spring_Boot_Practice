package com.shivam.rest_api.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud_clg_dts")
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer collegeId;
	
	private String collegeName;
	private String collegelocation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "addressId")
	private Address address;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(Integer collegeId, String collegeName, String collegelocation, Address address) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegelocation = collegelocation;
		this.address = address;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegelocation() {
		return collegelocation;
	}

	public void setCollegelocation(String collegelocation) {
		this.collegelocation = collegelocation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
