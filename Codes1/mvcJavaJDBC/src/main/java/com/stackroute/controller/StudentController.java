package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.dao.StudentDao;
import com.stackroute.model.Student;
@Controller
public class StudentController {
private StudentDao studentDao;
@Autowired
public StudentController(StudentDao studentDao) {
	super();
	this.studentDao = studentDao;
}
@GetMapping("/")
public String indexPage(Model model) {
	model.addAttribute("studentList",studentDao.listAllStudent());
	return "index";
	
}

@PostMapping("/addStudent")
public String addStudent(@RequestParam("name") String name,@RequestParam("age") int age,
		@RequestParam("city") String city,@RequestParam("email") String email) {
	
	Student existingStudent=studentDao.getStudentByEmail(email);
	if(existingStudent!=null) {
		existingStudent.setName(name);
		existingStudent.setAge((int)age);
		existingStudent.setCity(city);
		studentDao.updateStudent(existingStudent);
		
	}else {
		Student stud=new Student(name,age,city,email);
		studentDao.addStudent(stud);
	}
			return "redirect:/";
	
}
}
