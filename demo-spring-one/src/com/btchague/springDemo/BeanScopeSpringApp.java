package com.btchague.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSpringApp {

	
	public static void main(String[] args){
		
		//init context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		

		
		Coach recentCoach = context.getBean("myCoach", TrackCoach.class);
		Coach oldCoach = context.getBean("myCoach", TrackCoach.class);
		
		//Compare bean
		boolean result = recentCoach == oldCoach;
				
		//show 
		System.out.println(result);
		System.out.println("mémory position of recentCoach : " + recentCoach);
		System.out.println("mémory position of oldCoach : " + oldCoach);
		
		//close context
		context.close();
	}
}
