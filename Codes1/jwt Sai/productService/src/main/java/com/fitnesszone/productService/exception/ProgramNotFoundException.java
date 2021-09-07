package com.fitnesszone.productService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.CONFLICT,reason="program  not found")
public class ProgramNotFoundException extends Exception {

}
