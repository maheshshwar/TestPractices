package Collection;

public class Generics1 <R,L> {
	
	
	int a;
	R b;
	
		
	public static void main(String[] args) {
		
		Generics1<Integer,String> g = new Generics1 <Integer,String>();
		
		g.a = 56;
		g.b = 78;
		
		System.out.println(g.b);
	}

}
