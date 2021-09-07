package com.stackroute.Spring_sample;

public class FootBallCoach implements coach {
	private Fortune fortune ;

	public FootBallCoach(com.stackroute.Spring_sample.Fortune fortune) {
		super();
		fortune = fortune;
	}

	@Override
	public void getDailyWorkout() {
		
		System.out.println("from football coach");
	}

	@Override
	public void getDailyFortune() {
		fortune.getFortune();
		
	}

}
