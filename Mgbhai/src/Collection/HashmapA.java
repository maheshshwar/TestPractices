package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapA {
	
	public static void main(String[] args) {
		
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	map.put(15, "Testing");
	map.put(25, "Automation");
	map.put(40, null);
	map.put(35, null);
	map.put(null, "Java");
	map.put(null, "API");
	map.put(null, null);
	
	for(Map.Entry<Integer, String> m : map.entrySet()) {
		System.out.println(m.getKey()+ " " + m.getValue());
	}
	}
}
