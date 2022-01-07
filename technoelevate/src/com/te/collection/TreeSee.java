package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSee {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet();
		t.add(50);
		t.add(30);
		t.add(40);
		t.add(20);
		t.add(5);
		for(int x:t) {
			System.out.println(x);
		}
		System.out.println("***********");
		
		List l = new ArrayList(t);
		ListIterator iterator = l.listIterator(l.size());
		  while(iterator.hasPrevious()) {
			  System.out.println(iterator.previous());
			
		}
		
		
		
		
				
		

	}

}
