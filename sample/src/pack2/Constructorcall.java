package pack2;

public class Constructorcall {
	public static void demo() {
		System.out.println("from no argument method");
	}
	public static int demo(int a) {
		System.out.println("from argument method");
		return a;
	}
	

	public static void main(String[] args) {
		/*Constructor d1= new Constructor(1);*/
		Constructor d2= new Constructor(2,3);
		/*System.out.println(d1.a);
		System.out.println(d2.a);
		System.out.println(d1.a);
		System.out.println(d1.b);*/
		

	}

}
