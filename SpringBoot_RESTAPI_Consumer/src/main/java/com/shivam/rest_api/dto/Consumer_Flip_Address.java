package com.shivam.rest_api.dto;

public class Consumer_Flip_Address {
	private String area;
	private String city;
	private String state;
	private Integer pin;
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
	
	public Consumer_Flip_Address(String area, String city, String state, Integer pin) {
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public Consumer_Flip_Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Consumer_Flip_Address [area=" + area + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
}
