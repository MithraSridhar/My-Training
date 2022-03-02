package session4;

import org.testng.annotations.Test;

public class ClassBImplementsInterfaceAB implements InterfaceA, InterfaceB{

	public static void main(String[] args) {
		System.out.println("Class that implements interfaceA and have its own function too");		

	}
	@Test
	public void run(){
		add(3,4);
		subb(5,3);
		mul(3,5);
		div(10,2);
		addA(3,4);
		subbA(5,3);
		mulA(3,5);
		
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
	public void mul(int a, int b) {
		int mul = a*b;
		System.out.println("Mul is "+mul);
		
	}
	// Class A own method
	public void div(int a, int b){
		int div = a/b;
		System.out.println("Div is "+div);
	}
	//Method implemented from interfaceB
	public void addA(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);
		
	}
	//Method implemented from interfaceB
	public void subbA(int a, int b) {
		int sub = a-b;
		System.out.println("Sub is "+sub);
		
	}
	//Method implemented from interfaceB
	public void mulA(int a, int b) {
		int mul = a*b;
		System.out.println("Mul is "+mul);
				
	}

}
