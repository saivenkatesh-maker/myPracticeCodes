package com.stackroute.dao;

import java.util.List;

import com.stackroute.model.Student;

public interface StudentDao {
 int addStudent(Student student);
 int updateStudent(Student student);
 int deleteStudent(String email);
 List<Student> listAllStudent();
 Student getStudentByEmail(String email);
}
