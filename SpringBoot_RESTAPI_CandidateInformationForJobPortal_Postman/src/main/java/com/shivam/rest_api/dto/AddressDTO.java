package com.shivam.rest_api.dto;

public class AddressDTO {
	
	private String area;
	private String city;
	private String state;
	private Integer pin;
	
	public AddressDTO(String area, String city, String state, Integer pin) {
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	public AddressDTO() {
		super();
		// TODO Auto-generated constructor stub
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
		return "AddressDTO [area=" + area + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
}
