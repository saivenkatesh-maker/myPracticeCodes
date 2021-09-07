package com.stackroute.userservices.exception;

@SuppressWarnings("serial")
public class UserAlreadyExistException extends Exception{
    String message;
    public UserAlreadyExistException(){

    }
    public UserAlreadyExistException(String message){
        super();
        this.message=message;
    }
}
