package com.stackroute.userservices.controller;

import com.stackroute.userservices.exception.InvalidCredentialException;
import com.stackroute.userservices.exception.UserAlreadyExistException;
import com.stackroute.userservices.exception.UserNotFoundException;
import com.stackroute.userservices.model.User;
import com.stackroute.userservices.security.JwtSecurityGenerator;
import com.stackroute.userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserRestController {
    private UserService userService;
    private JwtSecurityGenerator jwtSecurityGenerator;

    @Autowired
    public UserRestController(UserService userService,JwtSecurityGenerator jwtSecurityGenerator) {
    	super();
        this.userService = userService;
        this.jwtSecurityGenerator=jwtSecurityGenerator;
    }
    
    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user) throws UserAlreadyExistException{
		return new ResponseEntity<>(userService.registerUser(user),HttpStatus.ACCEPTED);
    	
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/login")
    public ResponseEntity<User> loginUSer(@RequestBody User user) throws UserNotFoundException, InvalidCredentialException{
    	User ExistingUser=userService.loginUser(user);
    	Map<String,String> tokenMap=null;
    	if(ExistingUser!=null) {
    		tokenMap=jwtSecurityGenerator.generateToken(ExistingUser);
    	}
    	return new ResponseEntity(tokenMap,HttpStatus.ACCEPTED);
    }
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) throws UserNotFoundException{
    	return new ResponseEntity<>(userService.updateUser(user),HttpStatus.ACCEPTED);
    }


}

