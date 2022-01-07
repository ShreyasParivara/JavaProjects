package pack1;

public class employ_driver {
	public static void main(String[] args) {
		employee ob1=new developer("Mr bean",123,52000.3f);
		employee ob2= new tester("oggy",369,63000.5f);
		employee ob3=new hr("dave",852,45000.6);
		employee[] arr= {ob1,ob2,ob3};
		for(int i=0;i<arr.length;i++) {
			{
				arr[i].work();
			}
		}
		
		}
		
	}


