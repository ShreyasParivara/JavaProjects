package com.te.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortAndReverse {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(5);
		c.add(20);
		c.add(8);
		c.add("a");
		c.add(7);
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
	}
	
		
		
}}
