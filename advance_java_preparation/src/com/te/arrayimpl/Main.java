package com.te.arrayimpl;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayLists list = new ArrayLists(2);
		list.add("hello");
		list.add(1);
		list.add(4);
		list.add('a');
		list.remove(4);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
