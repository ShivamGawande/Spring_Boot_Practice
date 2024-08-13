package com.shivam.rest_api.dto;

public class UserDTO {
	
	private String newPass;
	private String fullName;
	private String currentPass;

	
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCurrentPass() {
		return currentPass;
	}
	public void setCurrentPass(String currentPass) {
		this.currentPass = currentPass;
	}
	public UserDTO( String newPass, String fullName, String currentPass) {
		super();
		
		this.newPass = newPass;
		this.fullName = fullName;
		this.currentPass = currentPass;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDTO [ newPass=" + newPass + ", fullName=" + fullName + ", currentPass="
				+ currentPass + "]";
	}
	
	
	
	
}
