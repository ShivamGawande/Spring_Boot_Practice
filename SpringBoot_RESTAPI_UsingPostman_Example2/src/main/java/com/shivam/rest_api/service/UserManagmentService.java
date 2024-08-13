package com.shivam.rest_api.service;

import com.shivam.rest_api.dto.UserRequestDto;

public interface UserManagmentService {
	
	String createUser(UserRequestDto user);
}
