package com.shivam.rest_api.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_dts")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studId;
	
	@Column(name="stud_name")
	private String name;
	
	@Column(name="stud_email")
	private String email;
	
	@Column(name = "stud_contact")
	private Long contact;
	
	@Column(name = "stud_gender")
	private String gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "collegeId")
	private College college;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studId, String name, String email, Long contact, String gender, College college) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.college = college;
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
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

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
