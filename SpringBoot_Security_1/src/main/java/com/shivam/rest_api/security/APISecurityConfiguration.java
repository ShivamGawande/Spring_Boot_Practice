package com.shivam.rest_api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class APISecurityConfiguration {

	@Autowired
	JwtTokenSecurity jwtTokenSecurity;
	
	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	AuthenticationManager  getAuthenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	SecurityFilterChain httpSecurity(HttpSecurity security) {

		// Configure The rules

		System.out.println("Buliding Security Filetr Chain with URI's Infroamtion");

		// SB : 3 -> Spring 6
		// SB :2 -> Spring 5

		// Spring 5 to Spring 6 : Security Module.
		// Functional Programming / Declarative programming

		SecurityFilterChain filterChain = null;

		try {
			
			System.out.println("Making a Decission , URI is Protected ot Not");
			
			security.csrf(csrf -> csrf.disable())
					.cors(cors -> cors.disable())
					
					.authorizeHttpRequests(
							
							authorize -> authorize
										.requestMatchers("/customer/care", "/user/create", "/user/login")
										.permitAll() // Non-Protectted
										.anyRequest()
										.authenticated() // Token validation 
							)
					.addFilterBefore(this.jwtTokenSecurity, 
							UsernamePasswordAuthenticationFilter.class);
			
			
			filterChain = security.build();

		} catch (Exception e) {
			System.err.println("Exception Occured : " + e.getLocalizedMessage());
		}

		return filterChain;
	}
}
