package com.shivam.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.entity.User;
import com.shivam.rest_api.repository.UserRepo;

import jakarta.validation.Valid;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public String addUser(@Valid UserRequestDto dto) {
		User user=new User();
		user.setfName(dto.getfName());
		user.setlName(dto.getlName());
		user.setEmail(dto.getEmail());
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setGender(dto.getGender());
		user.setAge(dto.getAge());
		user.setCity(dto.getCity());
		user.setCountry(dto.getCountry());
		if(userRepo.findByEmailAndUsername(dto.getEmail(), dto.getUsername()).isPresent()) {
			return null;
		}
		else {
			userRepo.save(user);
			return "User Registered Successfully";
		}
		
	}

	@Override
	public User findByEmailAndUsername(String email, String username) {
		if(userRepo.findByEmailAndUsername(email, username).isPresent()) {
			User user=userRepo.findByEmailAndUsername(email, username).get();
			return user;
		}else
		return null;
	}
	

}
