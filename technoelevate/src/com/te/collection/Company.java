package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;


public class Company {

	public static void main(String[] args) {
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		arraylist.add(new Employee(1, "strange", 400000));
		arraylist.add(new Employee(2, "Thor", 20000));
		Employee employee = new Employee(1, "Ironman", 100000);
		arraylist.add(employee);
		arraylist.add(new Employee(3, "Hulk", 400000));
		arraylist.add(new Employee(4, "Spiderman", 500000));
		
		Collections.sort(arraylist, new SortBySalary());
		for(Employee e:arraylist) {
			System.out.println(e);
		}
		
		
	}

}
