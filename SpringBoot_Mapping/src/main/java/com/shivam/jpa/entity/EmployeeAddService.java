package com.shivam.jpa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAddService {
	
	@Autowired
	EmployeRepository employeRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public void saveInfo() {
		Employee emp=new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Shivam");
		emp.setEmpPhone(9146087481l);
		emp.setEmpEmail("shiv@gmail.com");
		emp.setEmpDes("Jr.Developer");
		
		EmpAddress emp_add=new EmpAddress();
		emp_add.setaId(1);
		emp_add.setCity("Pune");
		emp_add.setState("Maharashtra");
		emp_add.setPinCOde(444055);
		emp.setAddress(emp_add);
		
		employeRepository.save(emp);;
	}
}
