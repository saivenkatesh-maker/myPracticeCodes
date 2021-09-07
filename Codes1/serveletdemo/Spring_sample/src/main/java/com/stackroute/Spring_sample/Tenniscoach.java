package com.stackroute.Spring_sample;

public class Tenniscoach implements coach{
	private Fortune fortune;
	
   public Tenniscoach(Fortune fortune) 
   {
		this.fortune = fortune;
	}

	@Override
	public void getDailyWorkout() {
		System.out.println("30 min workout from Tennis coach");
		
	}

	@Override
	public void getDailyFortune() {
		System.out.println("from tenniscoach good fortune");
		fortune.getFortune();
	}

}
