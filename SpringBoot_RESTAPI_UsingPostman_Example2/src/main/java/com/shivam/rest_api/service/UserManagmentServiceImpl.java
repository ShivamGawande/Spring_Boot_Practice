package com.shivam.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.Entity.Address;
import com.shivam.rest_api.Entity.UserDetails;
import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.repository.UserDetailsRepository;

@Service
public class UserManagmentServiceImpl implements UserManagmentService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Override
	public String createUser(UserRequestDto dto) {
		//creating entity object and setting data in entity object through dto
		UserDetails user=new UserDetails();
		user.setContact(dto.getContact());
		user.setEmail(dto.getEmail());
		user.setGender(dto.getGender());
		user.setName(dto.getName());
		Address add=new Address();
		add.setArea(dto.getAddress().getArea());
		add.setCity(dto.getAddress().getCity());
		add.setPin(dto.getAddress().getPin());
		add.setState(dto.getAddress().getState());
		user.setAddress(add);
		user=userDetailsRepository.save(user);
		return "UserDetails Save successFully ur id is: "+user.getId();
	}

}
