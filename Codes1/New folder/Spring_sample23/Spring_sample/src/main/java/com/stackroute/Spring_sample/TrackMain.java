package com.stackroute.Spring_sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackMain {
public static void main(String[] args) {
	ApplicationContext context1 = new ClassPathXmlApplicationContext("trackBean.xml");
	Newcoach cdNewcoach = context1.getBean("trackCoach",Newcoach.class);
	cdNewcoach.getDailyworkout();
	cdNewcoach.getFortune();
}
}
