package Methods;

public class ABC {
	public void demo() {
		System.out.println("non static method running");
	}
	public void memo() {
		System.out.println("non static method running from memo");
	}
	public static void main(String[] args) {
		ABC s = new ABC () ;
		s.demo();
		s.memo();
	}

}
