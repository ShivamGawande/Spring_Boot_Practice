package com.shivam.rest_api.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.entity.UserReg;

public interface UserRegService {
	String addUser(@RequestBody UserRequestDto dto);
	List<UserReg> getUserByCityAndGender( String City, String gender);
	
	
}
