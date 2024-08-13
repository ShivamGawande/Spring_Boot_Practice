package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.rest_api.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String>{
	
	UserEntity findByEmailAndPassword(String email,String password);
	
}
