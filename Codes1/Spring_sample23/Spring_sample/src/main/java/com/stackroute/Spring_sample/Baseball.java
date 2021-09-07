package com.stackroute.Spring_sample;

public class Baseball implements coach {
	private Fortune fortune;
	
	public Baseball(Fortune fortune) {
		this.fortune=fortune;
	}
	
//	String[] luck = {"Today is your lucky day","yo"}
 public void getDailyWorkout() {
	 System.out.println("30 min of dailt pactice from base ball");
 }

@Override
public void getDailyFortune() {
	System.out.println("from bassball coach good fortune");
	fortune.getFortune();
	System.out.println("sai is here");
}
}
