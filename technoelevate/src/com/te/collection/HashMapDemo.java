package com.te.collection;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Ramya");
		hashMap.put(2, "Sunny");
		hashMap.put(3, "Emma");
		hashMap.put(2, "Ana");
		Set<Integer> keyset = hashMap.keySet();
		for (Integer i : keyset) {
			System.out.println("Keys :" + i + ",Values : " + hashMap.get(i));
		}
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for(Entry<Integer, String> s: entrySet) {
			System.out.println(s);
		}

	}

}
