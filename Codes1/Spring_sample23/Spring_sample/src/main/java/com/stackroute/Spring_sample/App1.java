package com.stackroute.Spring_sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
  public static void main(String[] args)
  {
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("team.xml");
	VolleyBallCoach cd = (VolleyBallCoach)context.getBean("mycoach");
	  cd.getDailyWorkout();
	  cd.getDailyFortune();
	  System.out.println(cd.getPlayerEmail());
	  System.out.println(cd.getTeamName());
  }
 
  
}
