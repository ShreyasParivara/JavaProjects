package com.te.beanspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	@Bean
	public Dog getDog() {
		return new Dog();
	}
	@Bean
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	@Bean
	public Duck getDUck() {
		return new Duck();
	}
	@Bean("tiger")
	public Tiger getTiger() {
		return new Tiger();
	}
//	@Bean
//	public Pet getPet() {
//		return new Pet();
//	}
	

}
