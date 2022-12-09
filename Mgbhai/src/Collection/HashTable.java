package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		
		table.put( 95, "Testing");
		table.put( 78, "Manual");
		table.put( 76, "Automation");
		table.put( 49, "Java");
		table.put( 56 , "Selenium");
		table.put( 35, "API");
		table.put( 89, "122346");
		
		for(Map.Entry< Integer, String> m : table.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
	}

}
