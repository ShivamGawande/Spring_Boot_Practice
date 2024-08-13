package com.shivam.rest_api.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.shivam.rest_api.jwt.JWT_Token_Manager;
import com.shivam.rest_api.service.UserServiceImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtTokenSecurity extends OncePerRequestFilter{
	
	@Autowired
	JWT_Token_Manager jwt_Token_Manager;
	
	@Autowired
	UserServiceImpl userServiceImpl;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Validating Token.....");
		
		String token = request.getHeader("Authorization");
		
		// Token is null or not
		// token is null : Token Missing , UnAuthorized
		// token is not null : get the user name from token, then validate with login
		// USed Id
		
		String userNameOfToken = null;
		if(token!=null) {
			// From the token reading user name
			userNameOfToken = jwt_Token_Manager.getUSerIDOfToken(token);
		}else {
			System.out.println("Token is Missing");
			//throw new RuntimeException("Token IS Missing, UnAuthorized Request");
		}
		// Both are matching :
		// send user id to Db
		// not matching : Unauthorized access
		
		if(userNameOfToken!=null && SecurityContextHolder.getContext().getAuthentication() == null) {
			// User Details from DB
			UserDetails userDetails =userServiceImpl.loadUserByUsername(userNameOfToken);
			boolean isValidToken = jwt_Token_Manager.isValidToken(userDetails.getUsername(),token);
			
			if(isValidToken) {
				// Set Security Context of user as success
				// Token Class
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails.getUsername(), null, null);

				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}else {
				System.out.println("Token Is Invalid or Details are notvailbale in database with the user name");
				System.out.println(isValidToken);
				System.out.println(userDetails);
			}
		}
		
		
	}
	
}
