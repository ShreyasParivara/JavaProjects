package pack1;

public class p4 extends p3{
	int m=40;
	static int n=60;
	static {
		System.out.println("from static block of p4");
	}
	{
		System.out.println("from non static block of p4");
	}
	public p4() {
		System.out.println("fron constructor of p4");
	}
	public static void main(String[] args) {
		p4 ob1= new p4();
		System.out.println(ob1.b);
	
	}

}
