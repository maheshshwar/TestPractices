package BasicJAVA;

public class This {
	
int a = 70; // global variable

public void Demo () {
	
	int a = 80; // local variable
	
	System.out.println(a);  // local variable calling
	System.out.println(this.a);// global variable calling
}
		
		public static void main(String[] args) {
			
			This x = new This() ;
			x.Demo();
		}
	


	






		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	


