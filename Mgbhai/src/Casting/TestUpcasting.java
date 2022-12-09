package Casting;

public class TestUpcasting {
	
	
	public static void main(String[] args) {
		
	System.out.println("*********With super class object********");
		Upcasting x = new Upcasting ();
		
		x.Demo ();
		x.Set ();
		x.Test ();
		Upcasting.Test ();
		
		System.out.println("*********With sub class object*********");
		Upcastin1 y = new Upcastin1 ();
		
		y.Demo ();
		y.Set ();
		y.Sub ();
		y.Test ();
		
		System.out.println("*********With Upcating********");
		Upcasting z = new Upcastin1 ();  // Upcasting
		
		z.Demo ();
		z.Set ();
		z.Test ();
		
		System.out.println("********Down casting********");
		Upcastin1 ar = (Upcastin1) new Upcasting ();  // Down casting syntax
		// Down casting
		ar.Demo ();
		ar.Set ();
		ar.Test ();
		ar.Sub ();
		
		
		
		
		
				
		
	}
		
}