package com.te.Preparation;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(2);
		v.add(25);
		v.add(24);
		v.add(28);
		v.add(32);
		v.add(12);
		Collections.sort(v);
		Iterator iterator = v.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
