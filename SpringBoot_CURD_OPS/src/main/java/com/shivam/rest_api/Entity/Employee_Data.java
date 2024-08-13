package com.shivam.rest_api.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CURD_ops_EMPData")
public class Employee_Data {
	@Id
	private String empId;
	private String empName;
	private Integer empSalary;
	private String empDestignation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_Emp_Id" ,referencedColumnName="id")
	private Dept_Data dept;

	public Employee_Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_Data(String empId, String empName, Integer empSalary, String empDestignation, Dept_Data dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDestignation = empDestignation;
		this.dept = dept;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDestignation() {
		return empDestignation;
	}

	public void setEmpDestignation(String empDestignation) {
		this.empDestignation = empDestignation;
	}

	public Dept_Data getDept() {
		return dept;
	}

	public void setDept(Dept_Data dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee_Data [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", empDestignation=" + empDestignation + ", dept=" + dept + "]";
	}
	
}
