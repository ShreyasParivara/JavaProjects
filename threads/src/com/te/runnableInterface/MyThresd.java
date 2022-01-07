package com.te.runnableInterface;

public class MyThresd implements Runnable {

	@Override
	public void run() {
		for ( int i =0; i< 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e){	
			}
		}
		
	}

}
