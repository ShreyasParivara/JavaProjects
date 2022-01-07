package com.te.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasNextDemo {

	public static void main(String[] args) {
		HashSet <Integer> hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(50);
		for( int x: hashSet) {
			System.out.println(x);
		}
		System.out.println("*********************");
		
		Iterator iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
