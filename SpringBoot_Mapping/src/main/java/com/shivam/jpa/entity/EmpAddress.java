package com.shivam.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmpAddress {
	
	@Id
	private Integer aId;
	private String city;
	private String state;
	private Integer pinCOde;
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
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
	public Integer getPinCOde() {
		return pinCOde;
	}
	public void setPinCOde(Integer pinCOde) {
		this.pinCOde = pinCOde;
	}
	
	
}
