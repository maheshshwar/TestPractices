package Inheritance;

public class TestHirarchicle {
	
	public static void main(String[] args) {
		
		Son x = new Son();
		
		x.Bike();
		System.out.println(x.a);
		x.Car();
		x.Money();
		x.Home();
		
		
		System.out.println("method from another sub class");
		
		
		Son123 y = new Son123();
		y.Loptop();
		y.wathch();
		y.Car();
		y.Money();
		y.Home();
		System.out.println(y.a);
		
	}
	
	

}
