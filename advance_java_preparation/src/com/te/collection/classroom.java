package com.te.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class classroom {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList();
		array.add(new Student(1, "tom", 75));
		array.add(new Student(2, "sam", 85));
		array.add(new Student(3, "tim", 65));
		array.add(new Student(4, "bro", 93));
		Collections.sort(array, new SortByName());
		array.forEach(System.out::println);
		System.out.println("====================");
		TreeMap<Integer, String> tree = new TreeMap();
		tree.put(4, "Alvin");
		tree.put(2, "Bean");
		tree.put(1, "Adam");
		tree.put(3, "Ram");
		System.out.println(tree);
		System.out.println("==========");
		System.out.println(tree.descendingMap());
		for (int i = 1; i <= tree.size(); i++) {
			System.out.println(tree.get(i));
		}
		System.out.println("==============");
		HashSet<Integer> hasset = new HashSet();
		hasset.add(10);
		hasset.add(20);
		hasset.add(30);
		hasset.add(40);
		hasset.forEach(System.out::println);
		System.out.println("==================");
		LinkedHashSet<String> linkedhasset = new LinkedHashSet<>();
		linkedhasset.add("oggy");
		linkedhasset.add("tom");
		linkedhasset.add("jerry");
		linkedhasset.add("Mr bean");
		for (String x : linkedhasset) {
			System.out.println(x);
		}
		System.out.println("==================");
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(100);
		linkedlist.add(70);
		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
		}

		System.out.println("============");
		Queue<Integer> queue = new LinkedList<>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(100);
		for (Integer a : queue) {
			System.out.println(a);
		}
		

	}

}
