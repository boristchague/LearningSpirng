package com.btchague.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService thefortuneService){
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// get fortune from fortuneservice
		return "Just Do It :" + fortuneService.getFortune();
	}
	
	//start methode and ending methode
	public void doMyStartingStuf(){
		System.out.println("TrackCoach : Inside methode doMyStartingStuf");
	}
	
	public void doMyEndingStuf(){
		System.out.println("TrackCoach : Inside methode doMyEndingStuf");
	}
	

}
