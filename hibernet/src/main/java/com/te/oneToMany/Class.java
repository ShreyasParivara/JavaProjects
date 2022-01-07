package com.te.oneToMany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.mapping.Laptop;
import com.te.mapping.Student;

public class Class {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		laptop1.setLaptopId(101);
		laptop1.setLaptopName("Hp");
	    Laptop laptop2 = new Laptop();
	    laptop2.setLaptopId(102);
	    laptop2.setLaptopName("Dell");
	    Student student = new Student();
	    student.setId(1);
	    student.setName("hello");
	    student.setMarks(90);
	    laptop1.setStud(student);
	    laptop2.setStud(student);
	    List<Laptop> list = Arrays.asList(laptop1,laptop2);
	    student.setLaptops(list);
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("map");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction transaction = em.getTransaction();
	    transaction.begin();
	    em.persist(student);
	    em.persist(laptop1);
	    em.persist(laptop2);
	    transaction.commit();
	    
	}

}
