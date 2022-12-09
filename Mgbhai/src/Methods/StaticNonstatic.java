package Methods;

public class StaticNonstatic {
	static int a = 10;
	int b = 20;
	
	public static void main(String[] args) {
		System.out.println("Static variable ="+a);
		
		StaticNonstatic x = new StaticNonstatic(); // object creation
		System.out.println("Non-static variable call with ref of x ="+x.b);
		
		StaticNonstatic y = new StaticNonstatic(); // object creation
		System.out.println("Non-static variable call with ref of y ="+y.b);
		
		x.b=45;
		System.out.println("Non-static variable call with ref of x update ="+x.b);
		System.out.println("Non-static variable call with ref of y update ="+y.b);
		
		System.out.println("static variable call with ref of x ="+x.a);
		System.out.println("static variable call with ref of y ="+y.a);
		
		x.a =80;
		
		System.out.println("static variable call with ref of x update ="+x.a);//80
		System.out.println("static variable call with ref of y update ="+y.a);//80
		
	}
	

}
