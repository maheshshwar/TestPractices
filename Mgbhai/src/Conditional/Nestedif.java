package Conditional;

public class Nestedif {
public static void main(String[] args) {
	String UN = "AC";
	String PWD = "XYZ";
	if (UN=="AC") {
		System.out.println("user name is correct");
		
	if (PWD=="XYZ") {
		System.out.println("password is correct");
		System.out.println("login is succusefull");
	}
	else {
	System.out.println("wrong passwords");
	System.out.println("login is fail");
	}
	
	}
	else {
		System.out.println("wrong username");
		System.out.println("login fail");
	
		}
}
}
