package com.shivam.rest_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.dto.StudentRequestDto;
import com.shivam.rest_api.entity.Address;
import com.shivam.rest_api.entity.College;
import com.shivam.rest_api.entity.Student;
import com.shivam.rest_api.repository.StudentRepo;

@Service
public class StudentManagementServiceImpl implements StudentManagementService {

	
	@Autowired
	private StudentRepo studentRepo;
	@Override
	public String addStudentInfo(StudentRequestDto dto) {
		Student s=new Student();
		s.setName(dto.getName());
		s.setEmail(dto.getEmail());
		s.setContact(dto.getContact());
		s.setGender(dto.getGender());
		College c=new College();
		c.setCollegeName(dto.getCollege().getCollege_name());
		c.setCollegelocation(dto.getCollege().getLocation());
		Address add=new Address();
		add.setArea(dto.getCollege().getAddress().getArea());
		add.setCity(dto.getCollege().getAddress().getCity());
		add.setState(dto.getCollege().getAddress().getState());
		add.setPin(dto.getCollege().getAddress().getPin());
		c.setAddress(add);
		s.setCollege(c);
		
//		if(studentRepo.findById(s.getStudId()).isPresent()) {
//			System.out.println("Student Id is already present");
//		}
		studentRepo.save(s);
		return "Student data Saved successfully!!!";
	}
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	@Override
	public String deleteStudentById(Integer id) {
		studentRepo.deleteById(id);
		return "Student record is deleted whose id is: "+id;
		
	}

	
	

}
