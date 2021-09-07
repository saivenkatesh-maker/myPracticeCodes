package com.stackroute.dao;

import org.springframework.stereotype.Service;

import com.stackroute.model.User;
@Service
public class UserDaoImpl implements UserDao{

	@Override
	public Boolean RegistredLoginUser(String name, String password){
		if(password=="password") {
			return true;
		}
		return false;
	}

}
