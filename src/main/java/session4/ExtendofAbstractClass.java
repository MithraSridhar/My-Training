package session4;

import org.testng.annotations.Test;

public class ExtendofAbstractClass extends AbstractClass{
//To run the methods as test cases we are adding @Test annotation here
	@Test
	public void run() {
		sum();
		sub();
	}
	
	  @Override 
	  public void sum() {
		  System.out.println("SUM");
		  }
	  
	 @Override 
	  public void sub() { 
		  System.out.println("SUB");
	  
	  }
	 

}
