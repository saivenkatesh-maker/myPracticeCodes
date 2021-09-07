package com.stackroute.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;

public class Main {

	public static void main(String[] args) {
		
	     ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	            Actor actor=(Actor) context.getBean(Actor.class);
	            actor.setName("prabhas");
	            actor.setAge(35);
	            actor.setGender("male");
	           
	            System.out.println("Actor name is "+actor.toString());
	            Movie movie=(Movie) context.getBean(Movie.class);
	            
	            movie.setMovieName("Bahubali");
	            System.out.println( movie.toString());
	            System.out.println("Succefully completed using ApplicationContext.........");
	         
		

}
}
