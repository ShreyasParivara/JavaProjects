package com.te.Lamda;

public class TestLamda {

	public static void main(String[] args) {
		FunctionalInterface obj1 = new ClassImpl();
		// other method to implement interface
		// is by Annonymus class, you see below
		FunctionalInterface obj2 = new FunctionalInterface() {

			@Override
			public void message() {
				System.out.println("Implementation From Anonymus Class");

			}
		};
		// providing implementation by lamada expression

		FunctionalInterface obj3 = () -> {
			System.out.println("Implementation from Lamda expression");
		};
		obj1.message();
		obj2.message();
		obj3.message();
		System.out.println("=============");
		// for method with return type
		MethodWithReturnType obj4 = (a, b) -> {
			return a + b;
		};
		System.out.println(obj4.add(5, 5));
		
		Runnable run =()->{
			for(int i =0;i<5;i++) {
				System.out.println(i);
			}		
		};  
		Thread thread = new Thread(run);
		thread.start();
		
		
	}

}
