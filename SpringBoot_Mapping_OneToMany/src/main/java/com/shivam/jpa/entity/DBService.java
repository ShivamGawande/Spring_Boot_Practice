package com.shivam.jpa.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AddressRepository addressRepository; 
	
	public void addInfo() {
		Employee e1=new Employee();
		e1.setEmpId(2);
		e1.setEmpName("Vikas");
		e1.setEmpEmail("viks@gmail.com");
		e1.setEmpPhone(9359078831l);
		e1.setEmpDes("Jr.SE");
		
		EmpAddress add1=new EmpAddress();
		add1.setaId(4);
		add1.setCity("Hiwarkhed");
		add1.setState("Maharashtra");
		add1.setPinCOde(444103);
		
		EmpAddress add2=new EmpAddress();
		add2.setaId(5);
		add2.setCity("Nagpur");
		add2.setState("Maharashtra");
		add2.setPinCOde(444600);
		
		e1.setAddress(List.of(add1,add2));
		
		employeeRepository.save(e1);
	
	}
	
	public void deleteInfo() {
		employeeRepository.deleteById(2);;
	}
	
	public void retriveInfo() {
		Employee e=employeeRepository.findById(2).get();
		System.out.println(e);
	}
}
