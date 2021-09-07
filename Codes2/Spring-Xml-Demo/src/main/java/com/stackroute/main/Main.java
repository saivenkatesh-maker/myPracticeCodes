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
		num=sc.nextInt();
		switch(num) {
		case 1:BeanFactory bf = new XmlBeanFactory( new ClassPathResource("Bean.xml"));
	           Actor actor=(Actor) bf.getBean("actor-info",Actor.class);
	           System.out.println("Actor name is "+actor.toString());
	           Movie movie=(Movie) bf.getBean("movie-info",Movie.class);
	           System.out.println( movie.toString());
	           System.out.println("Succefully completed using  XmlBeanFactory.........");
	           break;
	           
		case 2: ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	            Actor actor1=(Actor) context.getBean("actor-info",Actor.class);
	            System.out.println("Actor name is "+actor1.toString());
	            Movie movie1=(Movie) context.getBean("movie-info",Movie.class);
	            System.out.println( movie1.toString());
	            System.out.println("Succefully completed using ApplicationContext.........");
	            break; 
	            
	      default:System.out.println("InValid Input");
		}
		//using XmlBeanFactory
//		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("Bean.xml"));
//        Actor actor=(Actor) bf.getBean("actor-info",Actor.class);
//        System.out.println("Actor name is "+actor.toString());
//        Movie movie=(Movie) bf.getBean("movie-info",Movie.class);
//        System.out.println( movie.toString());
        
        //using Applicationcontext
        
//        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
//        Actor actor1=(Actor) context.getBean("actor-info",Actor.class);
//        System.out.println("Actor name is "+actor1.toString());
//        Movie movie1=(Movie) context.getBean("movie-info",Movie.class);
//        System.out.println( movie1.toString());
//        
   
//		BeanDefinitionRegistry bdr =new BeanDefinitionRegistry( );
	}

}
