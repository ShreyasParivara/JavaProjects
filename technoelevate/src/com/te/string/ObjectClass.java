package com.te.string;

public class ObjectClass 
  {  int a;
	 public ObjectClass(int a) {
		 this.a=a;
	 }
	 public int hashCode() {
		 return a;
	 }
	  public boolean equals(boolean ObjectClass) {
		  return true;
	  }
	 
	
	public String toString() {
		return "hello how are you";
	}
	public static void main(String[] args) {
		ObjectClass ob = new ObjectClass(3);
		ObjectClass ob1 = new ObjectClass(3);
		System.out.println(ob);
		System.out.println(ob.hashCode());
		System.out.println(ob.equals(ob1));
	}


}
