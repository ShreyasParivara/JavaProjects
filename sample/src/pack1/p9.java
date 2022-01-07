package pack1;

public class p9 extends p8 {
	public void debit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
	}
	public double getbalance() {
		return this.balance;
	}

}
