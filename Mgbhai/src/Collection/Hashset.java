package Collection;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		HashSet <Character> set = new HashSet<Character> () ;
		
		set.add('$');
		set.add('@');
		set.add('#');
		set.add('m');
		
		// odder of insertion maintain 
		// advance forloop
		
		
		for(char t:set) { // syntax for advance for loop
			System.out.println(t);
		}
	}

}
