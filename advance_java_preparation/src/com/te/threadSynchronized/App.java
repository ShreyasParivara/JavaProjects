package com.te.threadSynchronized;

public class App extends Thread {
	Irctc obj;
	int number;
	
	
	public App(Irctc obj,int number) {
		super();
		this.obj = obj;
		this.number= number;
	}


	public void run() {
		obj.book(number);
		
	}
}