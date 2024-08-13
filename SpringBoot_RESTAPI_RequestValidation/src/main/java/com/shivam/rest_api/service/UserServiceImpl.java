package com.shivam.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.dto.UserRequestDTO;
import com.shivam.rest_api.entity.User;
import com.shivam.rest_api.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public String validateUser(UserRequestDTO dto,String host) {
		User user1=new User();
		user1.setFullName(dto.getFullName());
		user1.setUserName(dto.getUserName());
		user1.setContact(dto.getContact());
		user1.setCity(dto.getCity());
		user1.setEmail(dto.getEmail());
		user1.setGender(dto.getGender());
		user1.setPassword(dto.getPassword());
		userRepo.save(user1);
		return "User Info Saved";
	}

}
