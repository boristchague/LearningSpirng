package com.btchague.springDemo;

public class HappyFortuneService implements FortuneService {
	
	@Override 
	public String getFortune(){
		return "TOday is your luckyday !";
	}

}
