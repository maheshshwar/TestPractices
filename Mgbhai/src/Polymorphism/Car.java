package Polymorphism;

public class Car extends Bike {
	
	public void Addition () { // non static method 
		System.out.println(" Addition method ended");
		
	}
	
	public static void main(String[] args) {
		Bike x = new Car () ;
		x.Addition ();
	}
	
	
	
	
	
	
	}


