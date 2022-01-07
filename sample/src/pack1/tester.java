package pack1;

public class tester extends employee {
	public tester(String ename,int eid,double sal) {
		super(ename,eid,sal);
	}
	public void work() {
		System.out.println(this.ename+" "+this.eid+" "+this.sal);
		System.out.println("i am a tester");
	}

}
