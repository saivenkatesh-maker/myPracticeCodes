package com.sai.service;

import java.util.List;
import java.util.Optional;

import com.sai.exception.UserAlreadyExistsException;
import com.sai.model.Student;

public interface StudentService {
	
public List<Student> getAllStudent();
public void addStudent(Student stud) throws UserAlreadyExistsException;
public Optional<Student> getStudentById(int id);
public void deleteStudent(int id);
public void updateStudent(Student stud);
}
