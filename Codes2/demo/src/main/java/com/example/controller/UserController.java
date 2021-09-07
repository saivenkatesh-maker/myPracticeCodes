package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.UserService;
import com.example.model.User;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
private UserService Userserviceimpl;
@Autowired
public UserController(UserService userserviceimpl) {
	super();
	Userserviceimpl = userserviceimpl;
}

@PostMapping
public ResponseEntity<User> registerUser(@RequestBody User user){
	return new ResponseEntity<>(Userserviceimpl.registerUser(user), HttpStatus.CREATED);
}

	
}
