package String;

public class Demo {
	
	public static void main(String[] args) {
		
		String a= "Velocity";
		String b="Velocity";
		
		String c= new String("Velocity");
		String d= new String("Velocity");
		
		
		System.out.println(a==b); // True
		System.out.println(c==d); // False comparison of adress
		System.out.println(a==c); // False 
		
		System.out.println("************************");
		
		b="Class";
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b); // False
		
		System.out.println("************************");
		
		b="Velocity";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b); // True
		
	}
}
	
	
	
		
		
	