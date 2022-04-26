package com.btchague.springDemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService){
		fortuneService = thefortuneService;
	}
	
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practice";
	}


	@Override
	public String getDailyFortune() {
		// Use fortune service to get daily fortune 
		return fortuneService.getFortune();
	}

}
