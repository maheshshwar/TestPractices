package Constructor;

public class ConsSample {
	
	int a;
	int b;
	int m;
	String name;
	String velocity;
	
	ConsSample() { // User define cons with zero argument / parameter
		
		a = 89;
		b = 90;
		
	}
	
	ConsSample(int c,int d){ // user define cons with argument/ Parameter
		
		a = c;
		b = d;
		
	}
		ConsSample(int c,int d,int i){//user define cons with argument/parameter
			
		a = c;
		b = d;
		m = i;
		
		}
		
		ConsSample(String name,String velocity){// user define cons with argument/parameter
			
			name = "hello";
			velocity = "Testing";
		}
		public void Addition() {
			System.out.println(m+a+b);
		}
		public void St() {
			System.out.println(name);
			System.out.println(velocity);
		}
		
		public static void main(String[] args) {
			ConsSample x = new ConsSample();
			x.Addition();
			x.St();
			
			ConsSample y = new ConsSample(70,80,90);
			y.Addition();
			
			ConsSample z = new ConsSample(70,80);
			z.Addition();
			
			// ConsSample j = new ConsSample();
				
			
	}
	
	

}
