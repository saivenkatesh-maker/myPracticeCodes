package com.stackroute.Spring_sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app2 {
public static void main(String[] args){
	ApplicationContext context = new ClassPathXmlApplicationContext("Mybeam.xml","Beam.xml");	
	HelloBeam h1 = (HelloBeam) context.getBean("saiBeam");
	HelloBeam h2 = (HelloBeam) context.getBean("saiBeam");
	VolleyBallCoach demo =(VolleyBallCoach) context.getBean("mycoach");
	h1.setName("request_1");
	h2.setName("request_2");
	System.out.println(h1.getName());
	System.out.println(h2.getName());
	System.out.println(h2==h1);
	System.out.println(h2+" "+h1);
	demo.getDailyWorkout();
	demo.getDailyFortune();
	
	 
}
}
