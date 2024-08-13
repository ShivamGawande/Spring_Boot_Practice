package com.shivam.rest_api.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.entity.UserReg;
import com.shivam.rest_api.repository.UserRegRepo;

@Service
public class UserRegImpl implements UserRegService{
	
	@Autowired
	UserRegRepo userRegRepo;

	@Override
	public String addUser(UserRequestDto dto) {
		UserReg user=new UserReg();
		user.setEmail(dto.getEmail());
		user.setfName(dto.getfName());
		user.setlName(dto.getlName());
		user.setCity(dto.getCity());
		user.setCountry(dto.getCountry());
		user.setGender(dto.getGender());
		user.setAge(dto.getAge());
		if(userRegRepo.findById(dto.getEmail()).isPresent()) {
			return null;
		}
		else {
		userRegRepo.save(user);
		return "User Registered Successfully. With your email id: "+dto.getEmail();
		}
	}

	@Override
	public List<UserReg> getUserByCityAndGender(String City, String gender) {
		List<UserReg> userByCity;
		if(gender!=null) {
			userByCity=userRegRepo.findByCityAndGender(City, gender);
		}		
		else
			userByCity= userRegRepo.findByCity(City);
		if(userByCity.isEmpty()) {
			 return Collections.emptyList();
		}
		return userByCity;
	

	}

}
