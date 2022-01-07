package pack2;

public class Constructor {
	
	int a,b;
	Constructor(int a){
		this.a=a;
		System.out.println("single");
		System.out.println(this.a);
		System.out.println(this.b);
		
		
		
	}
	Constructor(int a,int b){
		this(a);
		this.b=b;
		System.out.println("double");
		System.out.println(this.a);
		System.out.println(this.b);
	}

}
