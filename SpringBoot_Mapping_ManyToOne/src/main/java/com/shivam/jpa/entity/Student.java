package com.shivam.jpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	private Integer studId;
	private String studFName;
	private String studLName;
	private double studFee;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	College college;

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudFName() {
		return studFName;
	}

	public void setStudFName(String studFName) {
		this.studFName = studFName;
	}

	public String getStudLName() {
		return studLName;
	}

	public void setStudLName(String studLName) {
		this.studLName = studLName;
	}

	public double getStudFee() {
		return studFee;
	}

	public void setStudFee(double studFee) {
		this.studFee = studFee;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFName=" + studFName + ", studLName=" + studLName + ", studFee="
				+ studFee + ", college=" + college + "]";
	}
	
	
	
}
