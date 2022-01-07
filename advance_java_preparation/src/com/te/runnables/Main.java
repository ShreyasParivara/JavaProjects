package com.te.runnables;

public class Main {

	public static void main(String[] args) {
		UsingRunnable runObj = new UsingRunnable();
		Thread thread = new Thread(runObj);
		thread.start();
		

	}

}
