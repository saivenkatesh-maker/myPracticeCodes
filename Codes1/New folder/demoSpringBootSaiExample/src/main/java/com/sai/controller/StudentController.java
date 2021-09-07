      package com.sai.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.exception.UserAlreadyExistsException;
import com.sai.model.Student;
import com.sai.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
private StudentService studentService;
@Autowired
public StudentController(StudentService studentSerive) {
	super();
	this.studentService = studentService;
}
@GetMapping
public List<Student> getAllStudent(){

	return studentService.getAllStudent();
}
@PostMapping
public void addUser(@RequestBody Student stud) throws UserAlreadyExistsException {
	studentService.addStudent(stud);
}
@GetMapping("/{id}")
public Optional<Student> getStudentById(@PathVariable int id){
	return studentService.getStudentById(id);
}
@PutMapping
public void updateStudent(@RequestBody Student stud) {
	studentService.updateStudent(stud);
}
}
