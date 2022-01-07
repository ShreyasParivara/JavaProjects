package com.te.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		Object bean = container.getBean("dem");
		Object bean2 = container.getBean("dem");
		System.out.println(bean);
		System.out.println(bean2);

	}

}
