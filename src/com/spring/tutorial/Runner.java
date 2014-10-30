package com.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Runner {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:D:/workspace/SpringTutorial/DefaultMessageTest-context.xml");
		ConstructorMessage constructorMessage = (ConstructorMessage)context.getBean("constructorMessage");
		System.out.println(constructorMessage.getMessage());
		ReferMessage referMessage = (ReferMessage)context.getBean("referMessage");
		System.out.println(referMessage.getMessage().getMessage());
		SetterMessage setterMessage = (SetterMessage)context.getBean("setterMessage");
		System.out.println(setterMessage.getMessage());
		
		
		System.out.println(setterMessage + " : " + referMessage.getMessage() + " : " + constructorMessage);
	}

}
