package com.shivam.rest_api.service;

import org.springframework.http.ResponseEntity;

import com.shivam.rest_api.dto.UserRequestDTO;

public interface UserService {
	ResponseEntity<String> addUser(UserRequestDTO dto);
}
