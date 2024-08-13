package com.shivam.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.jpa.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
