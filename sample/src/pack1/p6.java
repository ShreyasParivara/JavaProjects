package pack1;

 public class p6 extends p5 {
	 int b=20;
	 public void test() {
		 System.out.println("from p6");
	 }
	 public static void main(String[] args) {
		 p6 ob1=new p6();
		 p5 ob2=ob1;
		 p6 ob3=(p6)ob2;
		 System.out.println(ob1);
		 System.out.println(ob2);
		 System.out.println(ob3);
		 ob1.test();
		
	 }
	 

}
