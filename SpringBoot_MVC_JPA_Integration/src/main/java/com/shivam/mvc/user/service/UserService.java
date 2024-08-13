package com.shivam.mvc.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.mvc.user.entity.UserDetails;
import com.shivam.mvc.user.repository.UserDetailsRepository;

@Service
public class UserService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public String registerUserInfo(String fname,String lname,String email,String mobile,String gender,String pass ) {
		UserDetails user1=new UserDetails();
		user1.setfName(fname);
		user1.setlName(lname);
		user1.setEmail(email);
		user1.setMobile(mobile);
		user1.setEmail(email);
		user1.setPass(pass);
		user1.setGender(gender);
		
		if(userDetailsRepository.findById(email).isPresent()) {
			return"Email id is already registered : "+user1.getEmail();
		}
		else if(userDetailsRepository.findByMobile(mobile).isPresent()) {
			return"mobile number is already registered : "+user1.getMobile();
		}
		else {
		userDetailsRepository.save(user1);
		return "User Register Successfully";
		}
		
		
	}
	public String validateUser(String email,String pass ) {
		if(userDetailsRepository.findByEmailAndPass(email, pass).isPresent()) {
			UserDetails user1=userDetailsRepository.findByEmailAndPass(email, pass).get();
			String msg=user1.getEmail()+" : you are successfully log in ";
			return msg;
		}
		return "Invalid credentials";
	}
	
	public String updateUserPassword(String email,String c_pass,String n_pass,String r_pass) {
		if(userDetailsRepository.findById(email).isPresent()) {
			UserDetails user1=userDetailsRepository.findById(email).get();
			if(c_pass.equals(user1.getPass())) {
				if(n_pass.equals(r_pass)) {
					user1.setPass(r_pass);
					userDetailsRepository.save(user1);
					return "your Password reset successfully"+email;
				}else
					return "new password does't match, please retype it";
			}
			else
				return "current is not correct";
			
		}
			return " User not exist";
	}
}
