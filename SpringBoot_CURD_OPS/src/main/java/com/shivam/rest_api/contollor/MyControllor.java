package com.shivam.rest_api.contollor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.Entity.Employee_Data;
import com.shivam.rest_api.dto.Employee_DTO;
import com.shivam.rest_api.service.Employee_Service;

@RestController
public class MyControllor {
	
	@Autowired
	Employee_Service employee_Service;
	
	@PostMapping("/addEmp")
	public String addEmp(@RequestBody Employee_DTO dto) {
		return employee_Service.addEmployee(dto);
	}
	
	@GetMapping("/viewAllEmployee")
	public List<Employee_Data> viewAllEmployee(){
		return employee_Service.viewAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee_Data> getEmployeeById(@PathVariable String id) {
        try {
            Employee_Data employee = employee_Service.getEmployeeId(id);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
