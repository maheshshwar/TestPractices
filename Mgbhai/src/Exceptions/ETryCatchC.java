package Exceptions;

public class ETryCatchC {
	
	public static void main(String[] args) {
		
		int a = 50;
		int b = 0;
		int c = 0;
		
		int d [] = {20,45,67,34};
		
		System.out.println("start");
		
		// don't take the catch block me catch block
		
		try {
			c = a/b;  // resky code
			System.out.println(d[4]);
		}
		catch(ArrayIndexOutOfBoundsException s) {
			
			System.out.println("Alternative code");
			System.out.println(d[3]);
		}
		catch(ArithmeticException s) {
			
			b = 2;
			c = a/b;
			
		}
		
		}
}	
		
	