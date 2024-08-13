package com.shivam.rest_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.Entity.Dept_Data;
import com.shivam.rest_api.Entity.Employee_Data;
import com.shivam.rest_api.dto.Employee_DTO;
import com.shivam.rest_api.repository.DeptRepo;
import com.shivam.rest_api.repository.EmployeeRepo;


@Service
public class Employee_Service_IMPL implements Employee_Service {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	DeptRepo dept;

	@Override
	public String addEmployee(Employee_DTO dto) {
		Employee_Data emp =new Employee_Data();
		emp.setEmpId(dto.getEid());
		emp.setEmpName(dto.getEmpname());
		emp.setEmpSalary(dto.getSalary());
		emp.setEmpDestignation(dto.getDestignation());
		
		Dept_Data dept1 = new Dept_Data();
		dept1.setId(dto.getDept().getId());
		dept1.setLocation(dto.getDept().getLocation());
		dept1.setName(dto.getDept().getName());
		emp.setDept(dept1);
		if(employeeRepo.findById(dto.getEid()).isPresent()) {
			return "Email Id is already Present";
		}
		else {
			employeeRepo.save(emp);
			return "Employee Registered Successfully";
		}
		
	}

	@Override
	public List<Employee_Data> viewAllEmployee() {	
		return employeeRepo.findAll();
	}

	@Override
	public Employee_Data getEmployeeId(String id) {
		Employee_Data byId = employeeRepo.findById(id).get();
		return byId;
	}

}
