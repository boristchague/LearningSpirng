package com.btchague.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create context class
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get bean from context
			Coach myCoach  = context.getBean("myCoach", Coach.class);
		
		//use bean
			System.out.println(myCoach.getDailyWorkout());
			System.out.println(myCoach.getDailyFortune());
		
		//close context
			context.close();
	}

}
