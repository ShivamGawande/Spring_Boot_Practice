package com.shivam.rest_api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flip_users_add")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addId;
	
	private String area;
	private String city;
	private String state;
	private Integer pin;
	public Address(Integer addId, String area, String city, String state, Integer pin) {
		super();
		this.addId = addId;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	public Address() {
		super();
	}

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", area=" + area + ", city=" + city + ", state=" + state + ", pin=" + pin
				+ "]";
	}
	
	
	
	
}
