package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest_api.entity.Education;

public interface EducationRepo extends JpaRepository<Education, Integer> {

}
