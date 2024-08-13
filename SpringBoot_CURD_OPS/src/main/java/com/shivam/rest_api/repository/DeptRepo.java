package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.rest_api.Entity.Dept_Data;

@Repository
public interface DeptRepo extends JpaRepository<Dept_Data, String>{

}
