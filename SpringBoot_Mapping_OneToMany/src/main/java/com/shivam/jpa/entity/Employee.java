package com.shivam.jpa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private Long empPhone;
	private String empEmail;
	private String empDes;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="emp_add_id")
	 List<EmpAddress> address;

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

	public List<EmpAddress> getAddress() {
		return address;
	}

	public void setAddress(List<EmpAddress> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empEmail=" + empEmail
				+ ", empDes=" + empDes + ", address=" + address + "]";
	}
	
	
}
