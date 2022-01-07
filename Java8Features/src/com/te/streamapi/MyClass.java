package com.te.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(107, "vivek", 25000,"Devoloper",23),
				                            new Employee(103, "Manju", 35000,"Hr",26),
				                            new Employee(102, "Ranjiths", 81000,"Architecture",17),
				                            new Employee(110, "Hemanth", 21000,"Devoloper",22),
				                            new Employee(107, "Kratika", 45000,"tester",26),
				                            new Employee(107, "Sandeep", 17000,"Devoloper",35),
				                            new Employee(107, "Yasodha", 70000,"MD",50));
		Employee e = list.get(0);
		for(int i =0; i< list.size(); i++) {
			if(e.getAge()>list.get(i).getAge()) {
				e = list.get(i);
			}
		}
		System.out.println(e);
		System.out.println("===============");
		
		Stream<Employee> stream = list.stream();
		Optional<Employee>min = stream.min(Comparator.comparing(Employee::getSalary));
		System.out.println(min);
		System.out.println("================");
		list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
		System.out.println("=================");
		//sorting
		List<Employee> collect =list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		System.out.println("=====================");
        List<Employee> collect2 =list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		collect2.forEach(System.out::println);
		System.out.println("====================");
		Map<String,List<Employee>> collect3 = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		collect3.forEach((department, emp)->{
			System.out.println(department);
			emp.forEach(System.out::println);
		});
		System.out.println("==========================");
		List<Employee>collect4 = list.stream().filter(em->em.getAge()>20).collect(Collectors.toList());
		collect4.forEach(System.out::println);
		System.out.println("===========================");
		
		list.stream().filter(em->em.getSalary()>30000).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
												
				                                                                
	}

}
