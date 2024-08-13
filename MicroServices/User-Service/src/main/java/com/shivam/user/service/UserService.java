package com.shivam.user.service;

import com.shivam.user.dto.UserCredentials;
import com.shivam.user.dto.UserRequuestDTO;
import com.shivam.user.entity.UserEntity;

public interface UserService {
	String addUser(UserRequuestDTO dto);

	UserEntity validCredentials(UserCredentials credentials);
}
