package BasicJAVA;

public class Super1 extends Super {
	
int a = 45; // global variable 

public void Test() {
	
	int a= 45;  // local variable
	
	System.out.println(a); //local variable calling
	System.out.println(this.a);//global variable calling
	System.out.println(super.a); // global variable calling 
	
}

public static void main(String[] args) {
	
	Super1 x = new Super1(); 
	
	x.Test();
		
		
		
		
		
	}
	

}
