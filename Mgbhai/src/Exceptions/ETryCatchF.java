package Exceptions;

public class ETryCatchF {
	
	public static void main(String[] args) {
		
		int a = 19;
		int b = 0;
		int c = 0;
		
		int d []= {23,45,67,89};
		
		System.out.println("Start");
		
		try {
			try {
				c=a/b;
				
			}
			catch(ArithmeticException s) {
				
				System.out.println("Arithmetic exception");
			}
		
		}
	}
}

// not run 


