package com.shivam.jpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private Long empPhone;
	private String empEmail;
	private String empDes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private EmpAddress address;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(Long empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDes() {
		return empDes;
	}

	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}

	public EmpAddress getAddress() {
		return address;
	}

	public void setAddress(EmpAddress address) {
		this.address = address;
	}
	
	
}
