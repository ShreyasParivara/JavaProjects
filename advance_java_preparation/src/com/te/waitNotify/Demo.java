package com.te.waitNotify;

public class Demo {
	synchronized public void method1() {
		System.out.println("thread 1 waiting");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread 1 started running");
	}

	synchronized public void method2() {
		System.out.println("thread 2 running");
		notify();
		System.out.println("Thread 1 invoked");
	}

}
