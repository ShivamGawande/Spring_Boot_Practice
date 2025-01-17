package com.shivam.jpa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shivam.jpa.repository.CollegeRepository;
import com.shivam.jpa.repository.StudentRepository;

@Component
public class DBService {

	@Autowired
	private StudentRepository studentRepository;
	
//	@Autowired
//	private CollegeRepository collegeRepository;
	
	public void addStudentInfo() {
		College c1=new College();
		c1.setClgId(201);
		c1.setClgName("PRMITR");
		
		College c2=new College();
		c2.setClgId(202);
		c2.setClgName("P.R.Pote");
		
		Student s1=new Student();
		s1.setStudId(101);
		s1.setStudFName("Shivam");
		s1.setStudLName("Gawande");
		s1.setStudFee(49500.00);
		s1.setCollege(c1);
		
		Student s2=new Student();
		s2.setStudId(102);
		s2.setStudFName("Pooja");
		s2.setStudLName("Shendokar");
		s2.setStudFee(32400.00);
		s2.setCollege(c2);
		
		Student s3=new Student();
		s3.setStudId(103);
		s3.setStudFName("Pooja");
		s3.setStudLName("Chopde");
		s3.setStudFee(49500.00);
		s3.setCollege(c1);
		
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
	}
	
	public void deleteStudentInfo() {
		studentRepository.deleteById(103);
	}
}
