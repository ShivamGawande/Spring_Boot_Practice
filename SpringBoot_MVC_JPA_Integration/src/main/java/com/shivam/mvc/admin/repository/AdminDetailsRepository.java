package com.shivam.mvc.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.mvc.admin.entity.AdminDetails;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface AdminDetailsRepository extends JpaRepository<AdminDetails, String> {
	
	public Optional<AdminDetails> findByEmailAndPassword(String email,String pass); 
}
