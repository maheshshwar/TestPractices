package Exceptions;

public class ETryCatchD {
	
	public static void main(String[] args) {
		
		int a = 19;
		int b = 0;
		int c = 0;
		
		int d [] = {23,45,67,89} ;
		System.out.println("Start");
		
		// new try catch inside catch
		
		try {
			c = a/b; // resky code
			System.out.println(d[5]);
			
		}
		catch(ArithmeticException s) {
			
			System.out.println("Catch Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch array index out of bound exception");
			
			try {
				c = a/b;
				
			}
			
			catch(ArithmeticException s) {
				System.out.println("Arithmetic exception");
			}
		}
	}
}


