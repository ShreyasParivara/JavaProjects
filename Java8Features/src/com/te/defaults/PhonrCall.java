package com.te.defaults;

public interface PhonrCall {
	void busyMessage();
	default void coidAlert() {
		System.out.println("Amithab Bachchan is speaking ! Stay safe");
	}

}
