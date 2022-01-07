package pack1;

public class p7 {
	
	public static void main(String[] args) {
		
		
		int m,i,j,a=0,b=1,c=7;
		for(i=0;i<4;i++) {
			if(i%2==0) {
				
				m=a;
				for(j=0;j<c;j++) {
					if(j==m) {
						System.out.print("*");
						m=m+2;
					}
					else
						System.out.print(" ");
					
				}
				a=a+2;
			}
			else {
			
				m=b;
				for(j=0;j<c;j++) {
					if(j==m) {
						System.out.print("*");
						m=m+2;
					}
					else
						System.out.print(" ");
					
				}
				b=b+2;
				
			}
			c--;
			System.out.println();
		}
		
	}
	}