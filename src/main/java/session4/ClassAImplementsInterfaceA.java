package session4;

import org.testng.annotations.Test;

public class ClassAImplementsInterfaceA implements InterfaceA{

	public static void main(String[] args) {
		System.out.println("Class that implements interfaceA and have its own function too");		

	}
	@Test
	public void run(){
		add(3,4);
		subb(5,3);
		mul(3,5);
		div(10,2);
	}	
	//Method implemented from interfaceA
	public  void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);
		
	}
	//Method implemented from interfaceA
	public void subb(int a, int b) {
		int sub = a-b;
		System.out.println("Sub is "+sub);
		
	}
	//Method implemented from interfaceA
	
	  public void mul(int a, int b) { int mul = a*b;
	  System.out.println("Mul is "+mul);
	  
	  }
	 
	// Class A own method
	public void div(int a, int b){
		int div = a/b;
		System.out.println("Div is "+div);
	}

	

}
