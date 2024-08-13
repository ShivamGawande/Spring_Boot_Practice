package com.shivam.rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.rest_api.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
