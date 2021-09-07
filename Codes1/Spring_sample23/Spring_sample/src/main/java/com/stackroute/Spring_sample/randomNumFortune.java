package com.stackroute.Spring_sample;

import java.util.Random;

public class randomNumFortune implements Fortune{
		String[] randomFortune = {"I have a first fortune",
			"I have a Second fortune","I have a Third fortune"};
		
		Random random = new Random();
		int upperBound = randomFortune.length;
		int random_Fortune = random.nextInt(upperBound);
		@Override
		public void getFortune() {   
			System.out.println(randomFortune[random_Fortune]);
			
		}

	


}
