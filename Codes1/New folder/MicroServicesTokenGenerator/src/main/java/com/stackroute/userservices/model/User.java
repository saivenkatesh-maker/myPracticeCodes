package com.stackroute.userservices.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {

    @Id
    private String userName;
    private String password;
    
    
    public User() {
		
	    }
    
  public User(String userName, String password) {
		super();
		userName = userName;
		this.password = password;
	}
  
	public String getUserName() {
		return userName;
	}
	public void setUserName(String UserName) {
		userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
    

}



