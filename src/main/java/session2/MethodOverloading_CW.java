package session2;

public class MethodOverloading_CW {

	public static void main(String[] args) {
		
		

	}
	
	public void sum(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	
	public void sum(int a, int b,int c) {
		int d= a+b+c;
		System.out.println(d);
	}
	
	public void sum(int a, String b) {
		System.out.println(b);
	}
	

}
