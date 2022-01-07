package com.te.defaults;

public interface Test {
	default void m1() {
		System.out.println("From test 1");
	}

}
