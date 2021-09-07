package com.stackroute.Spring_sample;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main 
{
  
    public static void main( String[] args )
    {
        
//        Baseball coach =new Baseball();
//         coach.getDailyWorkout();
//        Tenniscoach coach1=new Tenniscoach();
//        coach1.getDailyWorkout();
        
//        coach cd =new Baseball();
//        cd.getDailyWorkout();
//        coach cd1 = new Tenniscoach();
//        cd1.getDailyWorkout();
    	
		@SuppressWarnings("deprecation")
		XmlBeanFactory bf = new XmlBeanFactory( new ClassPathResource("Beam.xml"));
		
//    	coach cd=(coach)bf.getBean("mycoach1");
//    	cd.getDailyWorkout();
//    	coach cd1=(coach)bf.getBean("mycoach2");
//    	cd1.getDailyWorkout();

		
//      Fortune cd =new Happyfortune();
		//Baseball base = new Baseball(cd);
		//base.getDailyWorkout();
		//base.getDailyFortune(); instead of passing fortune obj via developer it can be done by spring as below beam and injecting beam into constructer 
		coach cd =(coach)bf.getBean("mycoach");
		cd.getDailyWorkout();
		cd.getDailyFortune();
    	 
    	
       
    }
}
