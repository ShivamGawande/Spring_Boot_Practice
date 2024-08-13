package com.shivam.rest_api.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="candidate_info")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer candidate_id;
	@Column(name="first_name")
	private String fname;
	@Column(name="last_name")
	private String lname;
	private String email;
	private Long contact;
	private String gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "aid")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL )
	@JoinColumn(referencedColumnName = "candidate_id")
	private List<Education> education;

	public Candidate(Integer candidate_id, String fname, String lname, String email, Long contact, String gender,
			Address address, List<Education> education) {
		super();
		this.candidate_id = candidate_id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
		this.education = education;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(Integer candidate_id) {
		this.candidate_id = candidate_id;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Candidate [candidate_id=" + candidate_id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", contact=" + contact + ", gender=" + gender + ", address=" + address + ", education=" + education
				+ "]";
	}
	
	
}
