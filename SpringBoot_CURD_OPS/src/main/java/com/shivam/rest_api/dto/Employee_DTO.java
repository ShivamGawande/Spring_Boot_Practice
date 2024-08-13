package com.shivam.rest_api.dto;

public class Employee_DTO {
	private String eid;
	private String empname;
	private Integer salary;
	private String destignation;
	private Dept_DTO dept;
	
	public Employee_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_DTO(String id, String empname, Integer salary, String destignation, Dept_DTO dept) {
		super();
		this.eid = id;
		this.empname = empname;
		this.salary = salary;
		this.destignation = destignation;
		this.dept = dept;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDestignation() {
		return destignation;
	}

	public void setDestignation(String destignation) {
		this.destignation = destignation;
	}

	public Dept_DTO getDept() {
		return dept;
	}

	public void setDept(Dept_DTO dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee_DTO [eid=" + eid + ", empname=" + empname + ", salary=" + salary + ", destignation="
				+ destignation + ", dept=" + dept + "]";
	}

	
}