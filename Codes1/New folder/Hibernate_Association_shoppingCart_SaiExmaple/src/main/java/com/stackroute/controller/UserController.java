package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.model.User;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
private UserDao userDao;
@Autowired
public UserController(UserDao userDao) {
	super();
	this.userDao = userDao;
}

@GetMapping
public ResponseEntity<?> getAllUser() {
	return new ResponseEntity(userDao.listAllUser(),HttpStatus.CREATED);
}
@PostMapping
public ResponseEntity<?> addUser(@RequestBody User user){
	userDao.addUser(user);
	return new ResponseEntity(HttpStatus.CREATED);
}

@GetMapping("/{email}")
public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
	return new ResponseEntity(userDao.getUserByEmail(email),HttpStatus.CREATED);
}
@GetMapping("/{userId}")
public ResponseEntity<?> getUserByEmail(@PathVariable int Id) {
	return new ResponseEntity(userDao.getUserById(Id),HttpStatus.CREATED);
}
}
