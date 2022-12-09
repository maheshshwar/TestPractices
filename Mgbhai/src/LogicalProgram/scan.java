package LogicalProgram;
import  java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		Scanner demo = new Scanner(System.in);
		System.out.println("enter interger value");
		
	int value = demo.nextInt();
	System.out.println("your enter value is "+ value);
	
	System.out.println();
	System.out.println("enter float value");
	float value1 = demo.nextFloat();
	System.out.println("your enter value is"+ value1);
	System.out.println();
	
	System.out.println("enter string value");
	
	String value2 = demo.next();
	System.out.println("enter String is "+ value2);
	
	demo.close();
	
	}

}
