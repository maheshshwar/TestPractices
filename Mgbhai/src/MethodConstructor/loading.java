package MethodConstructor;

public class loading {
public static void main(String a) {
	System.out.println(a);
}
public static void main(long x) {
	System.out.println(x);
}
public static void main(String[] args) {
	main(1998);
	main('m');
}
}
