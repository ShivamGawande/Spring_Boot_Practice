package com.shivam.rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="candidate_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	
	private String area;
	private String city;
	private String state;
	private Integer pin;
	public Address(Integer aid, String area, String city, String state, Integer pin) {
		super();
		this.aid = aid;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
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
		return "Address [aid=" + aid + ", area=" + area + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
}
