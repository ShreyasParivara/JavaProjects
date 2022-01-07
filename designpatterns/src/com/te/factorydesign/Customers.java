package com.te.factorydesign;

import java.util.Scanner;

public class Customers {

	public static void main(String[] args) {
		Shop shop = new Shop();
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell the brand you want");
		String brand = sc.next();
		shop.showBrand(brand);
	}

}
