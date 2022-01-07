package com.technoelevate.programs;

public class Loosecoupling {

	public static void main(String[] args) {
		animal ob = new Cat();
		ob.child();
		animal ob1 =new dog(); 
		ob1.child();

	}

}
   interface animal{
	   public void child();
	  
  }
    class Cat implements animal{
	   public void child() {
		   System.out.println("kitten");
	   }
    }
	   
	class dog implements animal{
		public void child() {
			System.out.println("puppy");
		}
	}
