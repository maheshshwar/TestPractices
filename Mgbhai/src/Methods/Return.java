package Methods;

public class Return {
	
	static int Demo() {
		int a=25;
		int b=15;
		int c=a+b;
		int d;
		return d=c;
	}
	static String Test() {
		return "welcome to maheshwar";
	}
	
	public static void main(String[] args) {
		int d=Demo();
		System.out.println(d);
		
		String f=Test();
		System.out.println(f);
		
		
				
	}

}
