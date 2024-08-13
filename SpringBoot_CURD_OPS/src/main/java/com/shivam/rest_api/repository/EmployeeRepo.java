package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.rest_api.Entity.Employee_Data;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee_Data, String>{

}
