package com.stackroute.userservices.service;

import com.stackroute.userservices.exception.InvalidCredentialException;
import com.stackroute.userservices.exception.UserAlreadyExistException;
import com.stackroute.userservices.exception.UserNotFoundException;
import com.stackroute.userservices.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public User registerUser(User user) throws UserAlreadyExistException;
    public User loginUser(User user) throws UserNotFoundException, InvalidCredentialException;
    public User updateUser(User user) throws UserNotFoundException;

}
