package com.shivam.rest_api.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.entity.User;

import jakarta.validation.Valid;

public interface UserService {
	String addUser(@Valid UserRequestDto dto);
	
	User findByEmailAndUsername(@PathVariable(name = "email")String email,@PathVariable(name = "username") String username);
}
