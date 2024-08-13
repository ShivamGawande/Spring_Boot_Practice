package com.example.demo.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;

@Transactional
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
	List<UserDetails> findByCity(String cityName);
	
	List<UserDetails> findByGender(String genderName);
	
	List<UserDetails> findByContact(long contact);
	
	List<UserDetails> findByCityAndGender(String city,String gender);
	
	int deleteByAge(int age);
}
