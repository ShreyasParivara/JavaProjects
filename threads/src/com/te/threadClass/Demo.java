package com.te.threadClass;

public class Demo extends Thread {
		
		public void run() {
			for (int i =0; i< 10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
			
			
		

	

}
