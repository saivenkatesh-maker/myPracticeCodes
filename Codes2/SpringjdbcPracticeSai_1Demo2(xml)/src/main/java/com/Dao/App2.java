package com.Dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao_prep emp = (EmployeeDao_prep) context.getBean("empDaoPrep");
//		Boolean status =emp.saveEmployee(new Employee(702,"savi",5253.52f));
		
		
//			System.out.println(" row effected "+status);
		List<Employee> mylist=emp.getAllemployee();
		for(Employee e:mylist) {
			System.out.println("Id: "+e.getId()+", Name: "+e.getName()+", Salary: "+e.getSalary());
		}
		
		
		
	}

	
}
