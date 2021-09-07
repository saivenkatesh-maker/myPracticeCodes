package com.Dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao emp = (EmployeeDao) context.getBean("empdao");
		int status =emp.saveEmployee(new Employee(501,"sai",5253.52f));
		int status1=emp.saveEmployee(new Employee(502,"rakesh",5254.53f));
		if(status>0 && status1>0) {
			System.out.println( status+" row effected ");
			System.out.println( status1+" row effected ");
		}
		
	}

	
}
