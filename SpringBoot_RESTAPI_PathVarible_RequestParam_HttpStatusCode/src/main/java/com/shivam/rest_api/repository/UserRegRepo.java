package com.shivam.rest_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest_api.entity.UserReg;

public interface UserRegRepo  extends JpaRepository<UserReg, String>{
	
	List<UserReg> findByCityAndGender( String City,String gender);

	List<UserReg> findByCity(String city);
}
