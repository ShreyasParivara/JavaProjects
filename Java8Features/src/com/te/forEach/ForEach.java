package com.te.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> arraylist = Arrays.asList(1,18,45,3,7,10,12,99,93,33);
		for( int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));	
		}
		System.out.println("======================");
		for (Integer integer:arraylist) {
			System.out.println(integer);
		}
		System.out.println("======================");
		Iterator iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=========from for each method========");
		arraylist.forEach(System.out::println);
		

	}

}
