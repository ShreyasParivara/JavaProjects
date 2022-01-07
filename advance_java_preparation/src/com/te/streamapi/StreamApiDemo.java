package com.te.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiDemo {
	

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(2,3,4,5);
//		List<Integer> square = numbers.stream().map(x->x*x).collect(Collectors.toList());
//		square.forEach(System.out::println);
//		System.out.println("==================");
//		
		
//		System.out.println("=================");
//		List result2 =names.stream().sorted().collect(Collectors.toList());
//		result2.forEach(System.out::println);
//		
//		System.out.println("=================");
//		
//		numbers.stream().forEach(y->System.out.println(y));
//		names.forEach(s->System.out.println(s));
		List<String> names = Arrays.asList("tom","tim","sam","bro","sid","sam");
		names.forEach(System.out::println);
		System.out.println("================");
		List result =names.stream().distinct().collect(Collectors.toList());
		result.forEach(System.out::println);
		
		
	}

}
