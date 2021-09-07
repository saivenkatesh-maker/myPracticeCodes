package com.stackroute.model;


import org.springframework.stereotype.Service;

@Service
public class User {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(){
		
	}

	
}
