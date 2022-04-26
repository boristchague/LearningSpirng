package com.btchague.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterSpringApp {

	public static void main(String[] args) {
		
		//initiate context
		ClassPathXmlApplicationContext theContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//extract bean
		CricketCoach beanCoach = theContext.getBean("myCricketCoach", CricketCoach.class);
		
		//use bean
		System.out.println(beanCoach.getDailyFortune());
		System.out.println(beanCoach.getDailyWorkout());
		System.out.println(beanCoach.getCoachName());
		System.out.println(beanCoach.getEmailAdress());
		System.out.println(beanCoach.getLeague());
		System.out.println(beanCoach.getLevel());
		System.out.println(beanCoach.getTeams());
		
		//close bean
		theContext.close();

	}
}
