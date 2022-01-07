package com.technoelevate.inheritance;
import java.util.Scanner;


public class Quadratic {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter value of a");
    	  double x1,x2;
    	  double a= sc.nextDouble();
    	  System.out.println("Enter value of b");
    	  double b = sc.nextDouble();
    	  System.out.println("Enter the value of c");
    	  double c = sc.nextDouble();
    	  double d = b*b - 4*a*c;
    	  if(d>0.0) {
    		  x1=(-b+Math.sqrt(d))/(2*a);
    		  x2=(-b-Math.sqrt(d))/(2*a);  
    		  System.out.println("The roots are "+x1+" and"+x2);
    	  }
    	  else if(d==0.0) {
    		 x1=-b/(2*a);
    		 System.out.println("The root is "+x1);
    	  }
    	  else
    		  System.out.println("Roots are not real");	  
	}
}
