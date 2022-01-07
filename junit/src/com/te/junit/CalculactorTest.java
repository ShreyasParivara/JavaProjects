package com.te.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)//for before all method
class CalculactorTest {
	Calculactor calc;
	@BeforeAll
	public void beforeall() {
		System.out.println("befor everything");
		
	}
	@BeforeEach
	void before() {
		calc = new Calculactor();
		System.out.println("new instance created");

	}

	void after() {
		System.out.println("process completed");
	}

	@Test
	@DisplayName("ADDITION")
	void test() {
		assertEquals(7, calc.add(5, 2));
		System.out.println("addition completed");

	}


	@Test
	void multi() {
		assertEquals(10, calc.multiplication(5, 2));
		System.out.println("multiplication completed");

	}
	@Test
	void division() {
		assertThrows(ArithmeticException.class,()->calc.division(10, 5));//expected result is, It should give exception.
	}
	
	
	
	

}
