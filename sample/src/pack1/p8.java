package pack1;

public abstract class p8 {
	public double balance=50000;
	public abstract void withdraw(double amount);
	public abstract void debit(double amount);
	public abstract double getbalance();
	public static void main(String[] args) {
		p8 ob1=new p9();
		System.out.println(ob1.getbalance());
		ob1.debit(20000);
		System.out.println(ob1.getbalance());
		ob1.withdraw(3000);
		System.out.println(ob1.getbalance());
	}
	
	

}
