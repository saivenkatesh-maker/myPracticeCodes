package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.stackroute.dao.StudentDao;
@Controller
public class StudentController {
private StudentDao studentDao;
@Autowired
public StudentController(StudentDao studentDao) {
	super();
	this.studentDao = studentDao;
}
public String indexPage(Model model) {
	model.addAttribute("studentList",studentDao.listAllStudent());
	return "index";
	
}
}
