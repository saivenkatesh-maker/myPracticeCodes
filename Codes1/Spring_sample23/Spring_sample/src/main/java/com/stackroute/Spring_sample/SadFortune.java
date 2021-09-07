package com.stackroute.Spring_sample;


import org.springframework.stereotype.Component;

@Component
public class SadFortune implements Fortune{


	public void getFortune() {
		System.out.println("sad day");
		
	}

}
