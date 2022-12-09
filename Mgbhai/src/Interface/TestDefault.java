package Interface;

public abstract  class TestDefault implements Default {
	
	public void Mart () { // method from interface is complete
		System.out.println("All shops");
	}
	
	public void Dmart () { // this default method is from interface
		
		System.out.println("shoping grocery"); // implementation change
		
	}


	}
	
	


