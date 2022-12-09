package Collection;

import java.util.ArrayList;

public class BasicListB {
	
	public static void main(String[] args) { 
		// Homogeneous
		
		ArrayList<Integer> list = new ArrayList<Integer> () ;
			
			list.add(124);
			list.add(567890);
			list.add(2345);
			list.add(3457628);
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
				
			}
			System.out.println("*****************************************");
			list.remove(2);
			int size = list.size();
			System.out.println(size);
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i)) ;
				
			}
			
		}
	}

