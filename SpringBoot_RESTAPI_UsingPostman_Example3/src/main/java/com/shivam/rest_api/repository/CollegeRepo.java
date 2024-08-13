package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest_api.entity.College;

public interface CollegeRepo extends JpaRepository<College, Integer>{

}
