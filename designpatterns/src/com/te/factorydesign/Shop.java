package com.te.factorydesign;

public class Shop {
	Brand brand;

	public void showBrand(String s) {
		if (s.equalsIgnoreCase("adidas"))
			brand = new Adidas();
		else if (s.equalsIgnoreCase("Puma"))
			brand = new Puma();
		else if (s.equalsIgnoreCase("Nike"))
			brand = new Nike();
		else
			System.out.println("Sorry There are no other brand");
		
		if (brand != null) {
			brand.pant();
			brand.shirt();
			brand.shoes();
			brand.slippers();
		}
		
	}

}
