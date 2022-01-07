package com.technoelevate.inheritance;

public class Samsung extends Smartphone {
	
	public static void main(String[] args) {
		Samsung ob = new Samsung();
		ob.calling();
		ob.texting();
		ob.camera();
		ob.music();
		ob.games();
		ob.internet();
		ob.cost=20000;
		ob.color="white";
		ob.sim=2;
		System.out.println("cost: "+ob.cost);
		System.out.println("color: "+ob.color);
		System.out.println("sim: "+ob.sim);
		
			
		
	}

}
