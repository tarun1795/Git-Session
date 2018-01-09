package com.accolite.miniau;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getAddress().getPinCode());
		System.out.println(person.getAddress().getCity());
	}
}
