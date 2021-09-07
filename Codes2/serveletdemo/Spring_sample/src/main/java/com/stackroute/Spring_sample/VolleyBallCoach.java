package com.stackroute.Spring_sample;

public class VolleyBallCoach implements coach{
	
	private Fortune fortune;
	
	
	public VolleyBallCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	public Fortune getFortune() {
		return fortune;
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	public String getPlayerEmail() {
		return playerEmail;
	}

	public void setPlayerEmail(String playerEmail) {
		this.playerEmail = playerEmail;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	private String playerEmail;
	private String teamName;

	@Override
	public void getDailyWorkout() {
	System.out.println("VolleyBallCoach => coach practiice in the ground ");
		
	}

	@Override
	public void getDailyFortune() {
	 fortune.getFortune();
		
	}

}
