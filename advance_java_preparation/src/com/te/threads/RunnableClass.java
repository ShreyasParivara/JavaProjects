package com.te.threads;

import org.omg.CORBA.Current;

public class RunnableClass {

	public static void main(String[] args) {
		Runnable object = ()->{
			System.out.println("Runnable interface implemented");
		};
		Thread thread = new Thread(object);
		thread.start();
		
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main thread");
			
		
			
		
	}

}
