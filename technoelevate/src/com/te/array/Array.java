package com.te.array;

public class Array {

	public static void main(String[] args) {
		int []a= {123,0,120,540,88,-99,-88,77};
		int smallest = a[0];
	     for(int i=0; i<a.length;i++) {
	    	 if(smallest>a[i]) {
	    		 smallest=a[i];
	    	 }
	    	 System.out.println(smallest);
	     }

	

}
}