package com.te.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClassImpl {
	
	public void sum(int x, int y) {
		System.out.println(x+y);
	}
	static public void sub(int x,int y) {
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		ClassImpl c = new ClassImpl();
		FunctionalInterface i = new ClassImpl()::sum;
		i.add(2, 5);
		FunctionalInterface i2 = ClassImpl::sub;
		i2.add(3,2);
		//List<Integer> list = Arrays.asList(10,20,30,40);
		//list.forEach(System.out::println);
		//list.forEach(s->System.out.println(s));
		//list.stream().forEach(System.out::println);


	}

}
