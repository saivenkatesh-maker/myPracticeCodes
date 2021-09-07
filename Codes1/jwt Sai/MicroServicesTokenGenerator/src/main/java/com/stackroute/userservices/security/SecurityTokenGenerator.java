package com.stackroute.userservices.security;

import java.util.Map;

import com.stackroute.userservices.model.User;

public interface SecurityTokenGenerator {
Map<String, String> generateToken(User user);

}
