package com.shivam.rest_api.controllor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.StudentRequestDto;
import com.shivam.rest_api.entity.Student;
import com.shivam.rest_api.service.StudentManagementService;

@RestController
public class StudentManagmentControllor {
	
	@Autowired
	private StudentManagementService studentManagmentControllor;
	
	@PostMapping("/addStudent")
	public String addStudentInfo(@RequestBody StudentRequestDto dto) {
		//studentManagmentControllor.addStudentInfo(dto)
		return studentManagmentControllor.addStudentInfo(dto);
	}
	
	@GetMapping("/loadStudents")
	public List<Student> getAllStudent(){
		ArrayList<Student> students =new ArrayList<>(studentManagmentControllor.getAllStudents());
		return students;
	}
	
	@DeleteMapping("/deletStudentById")
	public String deleteStudentById(@RequestParam Integer id) {
		return studentManagmentControllor.deleteStudentById(id);
	}
}
