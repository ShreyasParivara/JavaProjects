package com.te.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		Laptop bean = container.getBean(Laptop.class);
		System.out.println(bean);
		

	}

}
