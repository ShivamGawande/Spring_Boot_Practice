package com.shivam.mvc.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.mvc.user.entity.UserDetails;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface UserDetailsRepository extends JpaRepository<com.shivam.mvc.user.entity.UserDetails, String>{

	Optional<UserDetails> findByEmailAndPass(String email,String password);
	
	Optional<com.shivam.mvc.user.entity.UserDetails> findByMobile(String mobile);
}
