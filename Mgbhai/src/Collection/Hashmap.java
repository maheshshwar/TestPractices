package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(25, "Testing") ;
		map.put(30, "Automation") ;
		map.put(40, "Java") ;
		map.put(45, "Selenium") ;
		map.put(60, "API") ;
		
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
			
		}
		map.put(25, "c++");
		System.out.println("*****************************************");
		
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
			
			
		}
	}

}
