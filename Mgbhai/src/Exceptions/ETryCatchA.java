package Exceptions;

public class ETryCatchA {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 2;
		int c = 0;
		
		int d [] = {10,35,65,85};
		
		System.out.println("Start");
		
		try { 
			c = a/b;  // resky code
			
			System.out.println(d[2]);
		}
		catch (ArrayIndexOutOfBoundsException s) {
			
			System.out.println(d[3]);
			
		}
		
		System.out.println(c);
		System.out.println("Normal Flow");
		
		// Exception generated and not gate handled try =>
		// Exception generated and not gate handled try =>catch=> normal flow
		// Exception not generated try=> normal flow
	
		
		}
		
		
	}
