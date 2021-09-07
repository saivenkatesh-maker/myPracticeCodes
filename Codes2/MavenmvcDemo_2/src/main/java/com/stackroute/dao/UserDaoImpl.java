package com.stackroute.dao;

import org.springframework.stereotype.Component;



@Component
public class UserDaoImpl implements UserDao{

	@Override
	public Boolean RegistredLoginUser(String pass){
		if(pass.equals("Sai777$$")) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
