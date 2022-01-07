package com.te.oneToMany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FlipCart {

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.setCardId(101);
		cart.setCartName("digicart");
		Items item1 = new Items();
		item1.setItemId(1);
		item1.setItemName("Earphone");
		item1.setBrand("Boat");
		item1.setCart(cart);
		Items item2 = new Items();
		item2.setItemId(2);
		item2.setItemName("Speaker");
		item2.setBrand("Jbl");
		item2.setCart(cart);
		Items item3 = new Items();
		item3.setItemId(3);
		item3.setItemName("Mobile");
		item3.setBrand("Apple");
		item3.setCart(cart);
		List<Items> list = Arrays.asList(item1,item2,item3);
		cart.setList(list);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("map");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction transaction = em.getTransaction();
	    transaction.begin();
	    em.persist(cart);
	    em.persist(item1);
	    em.persist(item2);
	    em.persist(item3);
	    transaction.commit();
		

	}

}
