package com.te.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyClass {

	public static void main(String[] args) {
		//ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(BeanClass.class);
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(BeanClass.class);
		Demo bean = (Demo) con.getBean("demo");
		bean.name();
		//con.close();

	}

}
