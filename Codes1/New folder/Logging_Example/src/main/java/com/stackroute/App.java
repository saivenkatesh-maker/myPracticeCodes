package com.stackroute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new
		ClassPathXmlApplicationContext("applicationConfig.xml");
		
		MyLogging obj=(MyLogging) context.getBean("proxy","MyLogging.class");
		obj.show();

	}

}
