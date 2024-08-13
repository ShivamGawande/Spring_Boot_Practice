package com.shivam.rest_api.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.shivam.rest_api.dto.StudentRequestDto;
import com.shivam.rest_api.entity.Student;

public interface StudentManagementService {
	
	String addStudentInfo(@RequestBody StudentRequestDto dto);
	
	List<Student> getAllStudents();
	
	String deleteStudentById(Integer id);
}
