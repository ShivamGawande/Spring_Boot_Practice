package com.shivam.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.user.dto.UserCredentials;
import com.shivam.user.dto.UserRequuestDTO;
import com.shivam.user.entity.UserEntity;
import com.shivam.user.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public String addUser(UserRequuestDTO dto) {
		if(userRepo.findById(dto.getEmail()).isPresent()) {
			return null;
		}
		else {
			UserEntity user = new UserEntity();
			user.setEmail(dto.getEmail());
			user.setCity(dto.getCity());
			user.setContact(dto.getContact());
			user.setGender(dto.getGender());
			user.setName(dto.getName());
			user.setPassword(dto.getPassword());
			userRepo.save(user);
			return "User Registered Successfully with this mail id: "+ user.getEmail();
		}
		
	}
	
	@Override
	public UserEntity validCredentials(UserCredentials credentials) {
		return userRepo.findByEmailAndPassword(credentials.getEmail(), credentials.getPassword());
	}
	
	
	

}
