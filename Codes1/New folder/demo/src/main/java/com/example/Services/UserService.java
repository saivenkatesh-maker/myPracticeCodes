package com.example.Services;
import com.example.Exception.UserAlreadyExistsException;
import com.example.Exception.UserNotFoundException;
import com.example.model.User;

public interface UserService {
	User registerUser(User user) throws UserAlreadyExistsException;
	boolean login(String email, String password) throws UserNotFoundException;
	User updateUser(User user) throws UserNotFoundException;

}