package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		Car car = (Car) container.getBean("car");
		car.move();

	}

}
