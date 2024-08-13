package com.shivam.rest_api.Entity;

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
@Table(name="FLIP_USERS_DTS")
public class UserDetails {
/*
 *  "name":"Shivam",
    "email":"shivamgawande@gmail.com",
    "contact":9146087481,
    "gender":"Male"
 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_email")
	private String email;
	
	@Column(name = "user_contact")
	private Long contact;
	
	@Column(name = "user_gender")
	private String gender;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "addId")
	private Address address;
	

	public UserDetails(Integer id, String name, String email, Long contact, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
	}

	public UserDetails() {
		super();
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", gender="
				+ gender + "]";
	}
	
	
}
