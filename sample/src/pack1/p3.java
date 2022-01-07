package pack1;

public class p3 {
	static int a=10;
	static
	{
		System.out.println("from static block of p3 1");
		System.out.println(a);
		a=40;
		
	}
	static{
		
		System.out.println("from static block of p3 2");
		System.out.println(a);
	}
	int b=200;
	static {
		a=70;
		System.out.println("from ststic block of p3 3");
		System.out.println(a);
	}
	public p3() {
		System.out.println("from constructor of p3");
	}
	{
		System.out.println("from non static block of p3");
	}

}
