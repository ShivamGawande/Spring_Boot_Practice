package com.shivam.rest_api.dto;

public class Dept_DTO {
	private String id;
	private String name;
	private String location;
	public Dept_DTO(String id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Dept_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Dept_DTO [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
