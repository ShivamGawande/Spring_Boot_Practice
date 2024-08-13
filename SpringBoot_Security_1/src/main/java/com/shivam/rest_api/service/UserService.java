package com.shivam.rest_api.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shivam.rest_api.dto.UserRequestDTO;

public interface UserService {
	
	String userRegister(UserRequestDTO dto);

	UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
