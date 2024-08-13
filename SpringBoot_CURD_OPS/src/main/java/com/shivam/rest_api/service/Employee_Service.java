package com.shivam.rest_api.service;

import java.util.List;

import com.shivam.rest_api.Entity.Employee_Data;
import com.shivam.rest_api.dto.Employee_DTO;

public interface Employee_Service {

	String addEmployee(Employee_DTO dto);

	List<Employee_Data> viewAllEmployee();

	Employee_Data getEmployeeId(String id);

}
