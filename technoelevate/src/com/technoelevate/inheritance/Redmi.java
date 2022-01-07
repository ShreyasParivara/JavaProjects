package com.technoelevate.inheritance;

public class Redmi extends Smartphone {
	public static void main(String[] args) {
		Redmi ob = new Redmi();
		ob.calling();
		ob.texting();
		ob.camera();
		ob.music();
		ob.games();
		ob.internet();
		ob.cost=7000;
		ob.color="black";
		ob.sim=2;
		System.out.println("cost: "+ob.cost);
		System.out.println("color: "+ob.color);
		System.out.println("sim: "+ob.sim);
		

}
}