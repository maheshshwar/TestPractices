package Logical;

public class Start6 {
	
	public static void main(String[] args) {
		
		int space = 1;
		int start = 4;
		
		for(int i=5;i>=1;i--) {
			for(int j=(5-i);j>1;j-- ) {
				System.out.print(" ");
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
				}
			}
		}
		
}


