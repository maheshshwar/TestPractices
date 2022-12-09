package Array;

public class Basic {
	
	public static void main(String[] args) {
		
		String ar [] = new String [6] ; // array declaration with size
		
		ar [0] = "JAVA" ; // array intialised
		ar [1] = "Automation" ;
		ar [2] = "Manual" ;
		ar [3] = "SQL" ;
		ar [4] = "API" ;
		ar [5] = "UNIX" ;
	//	ar [6] = "Jira" ;
	//	ar [7] = "Maven" ;
		
		
		// System.out.println(ar[2]);
		
		System.out.println("---------------print all info array-----------");
		
		
		for(int i =0;i<=5;i++) { //calling all info in array
			System.out.println(ar[1]);
		}
				
	}

}
