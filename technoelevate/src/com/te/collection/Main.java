package com.te.collection;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(60);
		list.remove(2);
		
	
		
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(list);
		
	}

}
