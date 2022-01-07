
public class Main {

	public static void main(String[] args)  {
		System.out.println("main class");
		try {
		throw new MyException();
		}catch(MyException e) {
			System.out.println("catch block");
		}
	}

}
