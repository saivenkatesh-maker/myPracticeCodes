package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.UserAlreadyExistsException;
import com.example.Exception.UserNotFoundException;
import com.example.Repository.UserRepository;
import com.example.model.User;
@Service
public class UserServiceimpl implements UserService {

	private UserRepository userRespository;
	
	
	@Autowired
	public UserServiceimpl(UserRepository userRespository) {
		super();
		this.userRespository = userRespository;
	}

	@Override
	public User registerUser(User user) throws UserAlreadyExistsException {
		if(userRespository.findById(user.getEmail()).isPresent()) {
			throw new UserAlreadyExistsException();
			
		}
		return userRespository.save(user);
		
	}

	@Override
	public boolean login(String email, String password) throws UserNotFoundException {
		if(userRespository.findById(email).isEmpty()) {
			throw new UserNotFoundException();
		}
		return(userRespository.findByEmailAndPassword(email, password))!=null;
	}

	@Override
	public User updateUser(User user) throws UserNotFoundException {
		if(userRespository.findById(user.getEmail()).isEmpty()) {
			throw new UserNotFoundException();
			
		}
		return userRespository.save(user);
	}

}
