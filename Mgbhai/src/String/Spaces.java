package String;

public class Spaces {
	
	public static void main(String[] args) {
		
		String s = "Velocity is the best trainnig institute";
		
		int count = 0;
		
		for(int i=0;i<s.length()-1;i++) {
			char s1 = s.charAt(i);
			
			if(s1=='t') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
