package com.stackroute.Spring_sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Newcoach{
	@Qualifier("sadFortune") 
	@Autowired
	private Fortune fortune;
	
	public TrackCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	@Override
	public void getDailyworkout() {
		System.out.println("Tracking for 4km");
		
		
	}

	@Override
	public void getFortune() {
		fortune.getFortune();
		
	}




	
}
