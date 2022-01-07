package com.te.beanspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(componentScan.class);
		Pet pet = container.getBean(Pet.class);
		pet.doThings();
	}

}
