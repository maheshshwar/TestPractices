package Constructor;

public class ConsSample1 {
	int a;
	int b;
	int m;
	String name;
	String velocity;
	
	ConsSample1() {
		a = 80;
		b = 90;
				
	}
	ConsSample1(int c,int d) {
		a = c;
		b = d;
	}
	ConsSample1(int c,int d,int i) {
		a = c;
		b = d;
		m = i;
	}
	ConsSample1(String name,String velocity) {
		
		name = "hello";
		velocity = "testing";
	}
		
public void addition() {
	System.out.println(m+a+b);
	
	}
public void st() {
	System.out.println(name);
	System.out.println(velocity);
}
public static void main(String[] args) {
	ConsSample1 x = new ConsSample1();
	x.addition();
	x.st();

ConsSample1 y = new ConsSample1(70,80,90);
y.addition();

ConsSample1 z = new ConsSample1(78,98);
   z.addition();
   
   ConsSample1 j = new ConsSample1("mahesh","testing");
      j.st();
  




	
	
				
		
	}

}
