package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest_api.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
