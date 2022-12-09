package String;

public class Reverse1A {
	
	public static void main(String[] args) {
			
	String a = "212";
	String rev = " ";
	
	for(int i=a.length()-1;i>=0;i--) {
		
		rev = rev + a.charAt(i);
	}
	 System.out.println(rev);
	 
	 if(a.equals(rev)) {
		 
		System.out.println("string is pallidrome") ;
	 }
	 else {
		 System.out.println("sting is not pallidrome");
		 
	 }
	
	
	
	}
}
