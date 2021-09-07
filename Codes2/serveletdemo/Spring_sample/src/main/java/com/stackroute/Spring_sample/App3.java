package com.stackroute.Spring_sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
 public static void main(String[] args) {
	ApplicationContext context2 =new ClassPathXmlApplicationContext("Employee.xml");
	Employee employee= (Employee) context2.getBean("myEmp");
	String tempStr[] =employee.getStr();
	String tempBonus[]=employee.getEmpbonus();
	for(String a: tempStr) {
		System.out.println(a);
	}
	for(String b: tempBonus) {
		System.out.println(b+100);
	}
	
	for(int i=0;i<tempBonus.length;i++) {
		System.out.println("Employee With Name "+tempStr[i]+" has got a Bonus of "+tempBonus[i]);
	}
			
 }
}
