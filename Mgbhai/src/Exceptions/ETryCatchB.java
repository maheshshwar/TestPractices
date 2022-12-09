package Exceptions;

public class ETryCatchB {

	public static void main(String[] args) {
		 
	  int a = 20;
	  int b = 0;
	  int c = 0;
	  
	  int d [] = {25,45,78,92} ;
	  
	  System.out.println("Start");
	  
	  // open try block or multiple catch
	  
	  try {
		  c = a/b; // resky code
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
	  System.out.println(c);
	  System.out.println("Normal flow");
	  
	}
	
}
