package ru.lab2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
		ClassPathXmlApplicationContext("resources/applicationContext.xml");
		TestBean testBean = context.getBean("testBean", TestBean.class);
		System.out.println(testBean.getName());
		context.close();
	}

}
