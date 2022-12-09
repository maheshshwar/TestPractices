package Collection;

import java.util.ArrayList;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class BasicList {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList() ;
			
			list.add(123) ;
			list.add("maheshwar") ;
			list.add(98.23f);
			list.add("#") ;
			
			int size = list.size() ;
		   System.out.println(size) ;
		   for(int i=0;i<=list.size();i++) {
			   System.out.println(list.get(i)) ;
			   
		   }
		System.out.println("**********************************************") ;
		list.remove(2);
		
		for(int i=0;i<=list.size();i++) {
			
			System.out.println(list.get(i));
		 }
		
		}
		
	}


