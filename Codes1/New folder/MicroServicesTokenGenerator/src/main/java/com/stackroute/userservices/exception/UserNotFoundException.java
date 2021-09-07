package com.stackroute.userservices.exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception{
String message;
public UserNotFoundException() {
	
}
public UserNotFoundException(String message) {
	super(message);
	this.message=message;
}
}
