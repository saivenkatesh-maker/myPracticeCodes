package com.stackroute.userservices.service;


import com.stackroute.userservices.exception.InvalidCredentialException;
import com.stackroute.userservices.exception.UserAlreadyExistException;
import com.stackroute.userservices.exception.UserNotFoundException;
import com.stackroute.userservices.model.User;
import com.stackroute.userservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

	@Override
	public User registerUser(User user) throws UserAlreadyExistException {
		if(userRepository.findByUserName(user.getUserName())!=null){
			throw new UserAlreadyExistException();
		}
		return userRepository.save(user);
	}

	@Override
	public User loginUser(User user) throws UserNotFoundException, InvalidCredentialException {
		if(userRepository.findByUserName(user.getUserName()) == null) {
			throw new UserNotFoundException();
		}
		User tempUser=userRepository.FindByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(tempUser==null) {
			throw new InvalidCredentialException();
		}
		return tempUser;
	}

	@Override
	public User updateUser(User user) throws UserNotFoundException {
		if(userRepository.findByUserName(user.getUserName())==null) {
			throw new UserNotFoundException();
		}
		return userRepository.save(user);
	}
    
}
