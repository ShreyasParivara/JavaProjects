package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Classroom {
	public static void main(String[] args) {
		Student student1 = new Student(21, "benki", 50);
		Student student2 = new Student(46, "child", 95);
		Student student3 = new Student(22, "mams", 95);
		Student student4 = new Student(23, "Bro", 95);
		Student student5 = new Student(24, "Bhai", 95);
		Student student6 = new Student(24, "Bhai", 95);
		ArrayList<Student> hashSet = new ArrayList();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);
		hashSet.add(student6);

		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("******************");
		int size =hashSet.size();
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (hashSet.get(i).rollNo == hashSet.get(j).rollNo) {
					hashSet.remove(i);
				}	
			}
		}
		
		Collections.sort(hashSet);
		Iterator iterator2 = hashSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
