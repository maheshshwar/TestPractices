package Casting;

public class Son extends Father {  // performing inheritance
	
	public void Bike () {  // property from subclass
		System.out.println("Son property Bike") ;
	}	
		public void Home () {  // property from superclass
			System.out.println("Own Home");
		}
		public void Car () {  // property from superclass
			System.out.println("Father Car");
		
		}
		
		public static void main(String[] args) {
			
			Father x =new Son () ; // upcasting syntax
			// super class ref variable = new sub class();
			
			x.Home ();
			x.Car ();
		    
			
			
			
			
		}
			
		
	}
	
	


