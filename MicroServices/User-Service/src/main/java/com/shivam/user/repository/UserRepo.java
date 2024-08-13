package com.shivam.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.user.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String> {
	
	UserEntity findByEmailAndPassword(String email,String password);
}
