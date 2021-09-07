package com.sai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.exception.UserAlreadyExistsException;
import com.sai.model.Student;
import com.sai.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{

private StudentRepo studentRepo;
	@Autowired
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list=new ArrayList<>();
		 studentRepo.findAll().forEach(Student1->list.add(Student1));
		return list;
	}

	@Override
	public void addStudent(Student stud) throws UserAlreadyExistsException{
		studentRepo.save(stud);
		
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		
		return studentRepo.findById(id);
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public void updateStudent(Student stud) {
		studentRepo.save(stud);
		
	}

}
