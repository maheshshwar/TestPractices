package Exceptions;

public class Finaly {
	
	public static void main(String[] args) {
		
		int a = 19;
		int b = 0;
		int c = 0;
		
		int d [] = {23,45,67,89};
		System.out.println("Start");
		
		try {
			c = a/b;
			
		}
		catch(ArithmeticException s) {
			System.out.println("Catch Arithmetic exception");
		}
		 finally {
			 
			 System.out.println("finally block executed");
			System.out.println("exception not handled");
			
		}
		
		System.out.println(c);
		System.out.println("Normal flow");
		
		// exception generated and not get handled
		// try=> finally
		// exception generated and get handled
		// try=> catch=> finally => normal flow
		//exception not generated 
		//try=> finally => normal flow
		
	}

}
