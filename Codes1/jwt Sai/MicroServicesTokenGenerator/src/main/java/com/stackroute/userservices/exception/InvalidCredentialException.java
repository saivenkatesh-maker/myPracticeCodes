package com.stackroute.userservices.exception;

@SuppressWarnings("serial")
public class InvalidCredentialException extends Exception {
String message;

public InvalidCredentialException() {
	
}
public InvalidCredentialException(String message) {
	super();
	this.message = message;
}

}
