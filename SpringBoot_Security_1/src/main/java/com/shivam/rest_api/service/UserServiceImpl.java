package com.shivam.rest_api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.dto.UserRequestDTO;
import com.shivam.rest_api.entity.UserEntity;
import com.shivam.rest_api.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService,UserDetailsService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public String userRegister(UserRequestDTO dto) {
		Optional<UserEntity> userDetails = userRepo.findById(dto.getEmail());
		if(userDetails.isPresent()) {
			return null;
		}else {
		UserEntity user = new UserEntity();
		user.setCity(dto.getCity());
		user.setContact(dto.getContact());
		user.setEmail(dto.getEmail());
		user.setGender(dto.getGender());
		user.setName(dto.getName());
		user.setPassword(bCryptPasswordEncoder.encode(dto.getPassword()));
		userRepo.save(user);
		
		return "User Registration Success.This Is your Email ID: " + user.getEmail();
		}
	}
	
	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
		UserEntity userEntity = userRepo.findById(emailId)
                .orElseThrow(() -> new UsernameNotFoundException("User ID Not Available: " + emailId));

        // Convert UserEntity to UserDetails
        UserDetails userDetails = User.withUsername(userEntity.getEmail()) // Assuming email is the username
                .password(userEntity.getPassword())
                .roles("USER") // Add any additional roles if needed
                .build();

        return userDetails;
	}

}
