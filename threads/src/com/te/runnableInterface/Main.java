package com.te.runnableInterface;

public class Main {

	public static void main(String[] args) {
		Runnable myThread = new MyThresd();
		//Thread thread = new Thread(myThread);
		Thread currentThread = Thread.currentThread();
		System.out.println("The name of the current thread :"+currentThread.getName());
		// code to set the name of the thread
		currentThread.setName("Chota Bheem");
		System.out.println("The name of the current thread is: "+currentThread.getName());
		//thread.start();
		//System.out.println("program is running");
		Thread thread = new Thread(myThread);
		thread.setName("Chutki");
		
		
		
		
	}

}
