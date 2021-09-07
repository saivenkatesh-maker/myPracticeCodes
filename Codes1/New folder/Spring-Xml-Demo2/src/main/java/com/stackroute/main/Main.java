package com.stackroute.main;


import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("HOW DO YOU WANT TO RUN THIS CODE");
		System.out.println("Input-> 1) Using XmlBeanFactory");
		System.out.println("Input-> 2) Using Applicationcontext");
		System.out.println("Input-> 3) Check the Equality");
		num=sc.nextInt();
		switch(num) {
		case 1:BeanFactory bf = new XmlBeanFactory( new ClassPathResource("Bean.xml"));
	           Actor actor=(Actor) bf.getBean("actor-info1",Actor.class);
	           System.out.println("Actor name is "+actor.toString());
	           Movie movie=(Movie) bf.getBean("MovieA",Movie.class);
	           System.out.println( movie.toString());
	           Movie movie12=(Movie) bf.getBean("MovieB",Movie.class);
	           System.out.println( movie12.toString());
	           System.out.println("Succefully completed using  XmlBeanFactory.........");
	           break;
	           
		case 2: ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	            Actor actor1=(Actor) context.getBean("actor-info1",Actor.class);
	            System.out.println("Actor name is "+actor1.toString());
	            Movie movie1=(Movie) context.getBean("MovieA",Movie.class);
	            System.out.println( movie1.toString());
	            Movie movie13=(Movie) context.getBean("MovieB",Movie.class);
	            System.out.println( movie13.toString());
	            System.out.println("Succefully completed using ApplicationContext.........");
	            break; 
		case 3:ApplicationContext context1= new ClassPathXmlApplicationContext("bean.xml");
		        Movie beanA=(Movie) context1.getBean("movie-info",Movie.class);
		        Movie beanB=(Movie) context1.getBean("movie-info",Movie.class); 
		        System.out.println(beanA==beanB);
		        System.out.println("Noted:"
		        		+ "on checking, when scope is singleton by default we get beanA==beanb is true"
		        		+ "but if scope is prototype then we get false ");
		        break;
		        
	      default:System.out.println("InValid Input");
		}
		
	}

}
