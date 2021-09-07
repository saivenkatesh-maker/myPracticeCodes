package com.stackroute.userservices.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {

    @Id
    private String UserName;
    private String password;
    
    
    public User() {
		
	    }
    
  public User(String userName, String password) {
		super();
		UserName = userName;
		this.password = password;
	}
  
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
    

}



