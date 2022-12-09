package Exceptions;

public class ETryCatch {
	
	public static void main(String[] args) {
		
		int a = 23;
		int b = 0;
		int c = 0;
		
		System.out.println("Start");
		
		try {
			c = a/b;  // resky code
		}
		
		catch (ArithmeticException s ) {
			
			a = 50;
			b = 2;
			c = a/b;
			
			System.out.println("Alternative code");
		}
		
	System.out.println(c);
		
	}
	
	

}
