package pack1;

public class Recursion {
	public int fact(int num) {
		if(num==1) {
			return 1;
		}
		return (num*fact(num-1));
		
	}

	public static void main(String[] args) {
		Recursion obj= new Recursion();		
		System.out.println(obj.fact(5));
		
	}

}
