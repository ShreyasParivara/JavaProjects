package com.te.runnables;

public class UsingRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
		}
		
	}

}
