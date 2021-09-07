package com.stackroute.userservices.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptions {

    @Value(value="${data.exception.message1}")
    private String message1;

    @ExceptionHandler(value = UserAlreadyExistException.class)
    public ResponseEntity<String> userAlreadyExistException(UserAlreadyExistException userAlreadyExistException){
        return new ResponseEntity<>(message1, HttpStatus.CONFLICT);

    }
    @Value(value="${data.exception.message2}")
    private String message2;
    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<String> userNotFoundException(UserNotFoundException userNotFoundException){
    	return new ResponseEntity<>(message2,HttpStatus.CONFLICT);
    }
    @Value(value="${data.exception.message3}")
    private String message3;
    @ExceptionHandler(value=InvalidCredentialException.class)
    public ResponseEntity<String> invalidCredentialException(InvalidCredentialException invalidCredentialException){
    	return new ResponseEntity<>(message3,HttpStatus.CONFLICT);
    }
    
}
