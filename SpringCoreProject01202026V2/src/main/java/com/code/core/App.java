package com.code.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.code.core.entity.Baseball;
import com.code.core.entity.ICoach;
import com.code.core.entity.Tennis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    	//create the object using the context object method getBean();
    	Tennis tennis = context.getBean("tennis", Tennis.class);
    	System.out.println(tennis.getName());
    	System.out.println(tennis.getDailyTask());
    	System.out.println(tennis.getEmailId());
    	// if create a new FortuneTellerService object in the method, tightly coupled
    	System.out.println(tennis.getTodaysFortune());
    	
    	// constructor injection, loosely coupled
    	Baseball baseball = context.getBean("baseball", Baseball.class);
    	System.out.println(baseball.getName());
    	System.out.println(baseball.getDailyTask());
    	System.out.println(baseball.getEmailId());
    	System.out.println(baseball.getTodaysFortune());
    	
//    	ICoach coach=(ICoach) context.getBean("tennis");
//    	System.out.println(coach.getDailyTask());
//    	coach=(ICoach) context.getBean("baseball");
//    	System.out.println(coach.getDailyTask());
    }
}
