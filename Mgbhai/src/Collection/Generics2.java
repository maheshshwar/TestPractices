package Collection;

public class Generics2 <R,L> {
	
	int a;
	R b;
	
	R test(L s) { // method
		
		return  b;
		
	}
	
	public static void main(String[] args) {
		
		Generics2<Integer,String> g = new Generics2<Integer,String>();
		
		g.a = 98;
		
		g.b = 49;
		
		System.out.println(g.b);
		
	}
	
	

}
