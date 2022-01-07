package com.te.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Demo implements InitializingBean,DisposableBean {
	
	public Demo() {
		System.out.println("the bean is instantiated");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("After destroying");
		
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("for set property");
		
	}
	public void name() {
		System.out.println("after setting the properties ");
	}
	
	

}
