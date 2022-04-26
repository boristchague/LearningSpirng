package com.btchague.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String league;
	private String emailAdress;
	private String teams;
	private String coachName;
	private String level;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	
	public void setFortuneService(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
		System.out.println("CricketCoach: inside setter method");
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bolwing for 15mins ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}


	public String getLeague() {
		return league;
	}


	public String getEmailAdress() {
		return emailAdress;
	}


	public String getTeams() {
		return teams;
	}


	public String getCoachName() {
		return coachName;
	}


	public String getLevel() {
		return level;
	}
	
	
	public void setLeague(String league) {
		this.league = league;
	}


	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}


	public void setTeams(String teams) {
		this.teams = teams;
	}


	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}


	public void setLevel(String level) {
		this.level = level;
	}

}
