package com.fitnesszone.productService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitnesszone.productService.exception.ProgramAlreadyExistsException;
import com.fitnesszone.productService.exception.ProgramNotFoundException;
import com.fitnesszone.productService.model.Program;
import com.fitnesszone.productService.service.ProgramService;
@RestController
@RequestMapping("api/v1/program")
public class Controller {
private ProgramService programService;
@Autowired
public Controller(ProgramService programService) {
	this.programService = programService;
}
@PostMapping
public ResponseEntity<Program> addProgram(@RequestBody Program program) throws ProgramAlreadyExistsException{
	return new ResponseEntity<Program>(programService.addprogram(program),HttpStatus.ACCEPTED);
	
}

@PutMapping("/{id}")
public ResponseEntity<Program> updateProgram(@PathVariable String id,@RequestBody Program program){
	return new ResponseEntity<Program>(programService.updateprogram(program),HttpStatus.ACCEPTED);

}
@SuppressWarnings({ "rawtypes", "unchecked" })
@GetMapping
public ResponseEntity<Program> listAllProgram(){
	return new ResponseEntity(programService.listAllPrograms(),HttpStatus.FOUND);

}
@SuppressWarnings({ "unchecked", "rawtypes" })
@GetMapping("ById/{id}")
public ResponseEntity<Program> getProgramById(@PathVariable String id) throws ProgramNotFoundException{
	return new ResponseEntity(programService.getprogramByCode(id),HttpStatus.FOUND);
}
@SuppressWarnings({ "rawtypes", "unchecked" })
@GetMapping("ByMonths/{durationInMonths}")
public ResponseEntity<Program> getProgramByDuration(@PathVariable int durationInMonths){
	return new ResponseEntity(programService.listProgramByDuration(durationInMonths),HttpStatus.FOUND);
}
@SuppressWarnings({ "rawtypes", "unchecked"})
@DeleteMapping("/{id}")
public ResponseEntity<Program> deleteProgramBycode(@PathVariable String id) {
	return new ResponseEntity(programService.deleteProgram(id),HttpStatus.ACCEPTED);
}
@SuppressWarnings({ "unchecked", "rawtypes" })
@GetMapping("activePrograms/{active}")
public ResponseEntity<Program> listAllProgramsByActiveTrue(@PathVariable boolean active){
    return  new ResponseEntity(programService.listProgramByActive(), HttpStatus.FOUND);
}
}
