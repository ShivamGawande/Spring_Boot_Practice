package com.shivam.rest_api.jwt;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWT_Token_Manager {
	
	private final String SECRET_KEY = "Shivam1235;0";
	
	private long expireTimeInMills = 5 * 60 * 1000;
	
	public String createToken(String userId) {
		String token = Jwts.builder()
					   .setSubject(userId)
					   .setIssuedAt(new Date(System.currentTimeMillis()))
					   .setExpiration(new Date(System.currentTimeMillis() + expireTimeInMills))
					   .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
					   .compact();
		return token;
	}
	
	public boolean isValidUser(String loginUserId, String token) {
		String tokenUserId = Jwts.parser()
							.setSigningKey(SECRET_KEY)
							.parseClaimsJws(token)
							.getBody()
							.getSubject();
		return loginUserId.equalsIgnoreCase(tokenUserId);
	}
	
	public boolean isTokenTimeValid(String token) {
		Date expiryTime = Jwts.parser()
						 .setSigningKey(SECRET_KEY)
						 .parseClaimsJws(token)
						 .getBody()
						 .getExpiration();
		System.out.println("Token Expiry Time : "+expiryTime);
		System.out.println("Current Time : "+new Date());
		boolean isExpired = expiryTime.after(new Date());
		System.out.println(isExpired);
		return isExpired;
	}
	
	public boolean isValidToken(String loginUserId, String token) {
		System.out.println("Token: "+token);
		System.out.println("UserID: "+loginUserId);
		return isValidUser(loginUserId, token) && isTokenTimeValid(token);
	}
	
	public String getUSerIDOfToken(String token ) {
		String tokenUSerID = 	Jwts.parser()
				.setSigningKey(SECRET_KEY)
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
		return tokenUSerID;
	}
}
