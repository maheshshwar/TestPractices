package Methods;

public class ParameterMethod {
	public static void Addition(int a ,int b) {
	int c= a+b;
	System.out.println("Addtion="+ c);
	}
	public void Multiplication(int x,int y) {
		int z = x*y;
		System.out.println("Multiplication="+ z);
	}
	public static void main(String[] args) {
		Addition(70,70);
		Addition(50,20);
		Addition(40,40);
		
		ParameterMethod s = new ParameterMethod();
		
		s.Addition(20,50);
		s.Addition(70,10);
		s.Multiplication(90,3);
		s.Multiplication(6,70);
		
	
				
		
			
	}


}
