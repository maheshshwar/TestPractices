package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {
	
	public static void main(String[] args) {
		
		ClassD x = new ClassD ();
		
		System.out.println(x.a);  //public access specifier
		//	System.out.println(x.b); // private access specifier
	   //   System.out.println(x.c); // default access specifier
        System.out.println(x.d); // protected access specifier
		
		
	}

}
