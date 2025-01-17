package com.shivam.mvc.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.mvc.admin.entity.AdminDetails;
import com.shivam.mvc.admin.repository.AdminDetailsRepository;
import com.shivam.mvc.user.entity.UserDetails;
import com.shivam.mvc.user.repository.UserDetailsRepository;

@Service
public class AdminService {

	@Autowired
	AdminDetailsRepository adminDetailsRepository;
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public String validateAdminLogin(String email,String pass) {
		if(adminDetailsRepository.findByEmailAndPassword(email, pass).isPresent()) {
			AdminDetails admin=adminDetailsRepository.findByEmailAndPassword(email, pass).get();
			String msg=admin.getEmail()+" : you are successfully login";
			return msg;
		}
		return "Admin details not found";
	}
	
	public String searchUserDetails(String email) {
		if(userDetailsRepository.findById(email).isPresent()) {
			UserDetails user=userDetailsRepository.findById(email).get();
			String msg=user.getEmail()+" | "+user.getfName()+" | "+user.getlName()+" | "+user.getGender()+" | "+user.getMobile();
			return "User Details found<br>"+ msg;
		}
		return "User not registerd ";
	}

	public String deleteUserDetails(String email) {
		if(userDetailsRepository.findById(email).isPresent()) {
			userDetailsRepository.deleteById(email);
			return "User Deleted Successfully";
		}
		return "User not exist";
	}
}
