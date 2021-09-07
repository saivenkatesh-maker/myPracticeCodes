package com.stackroute.userservices.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.stackroute.userservices.model.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Service
public class JwtSecurityGenerator implements SecurityTokenGenerator {

	@Override
	public Map<String, String> generateToken(User user) {
		String jwtToken=Jwts.builder().setIssuer("MSV")
				.setSubject(user.getUserName()).setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "mysecret").compact();
		Map<String, String> map=new HashMap<>();
		map.put("token", jwtToken);
		map.put("message", "Authentication Successfull");
		return map;
	}

}
