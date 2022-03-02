package session4;

public class MethodOverloading {

	public static void main(String[] args) {
		int c =0;
		int m=	addN(3,4);
		addN(3,4,5);
		addN(3,4,5,"mithra");
		addN();
		addN(9,6);
System.out.println(c);
	}
	public static int addN(){
		int a=5, b=6;
		int c=a+b;
		System.out.println("C is "+c);
		return c;
	}
	
	public static int addN(int a, int b){
		
		int c = a +b;
		System.out.println("The value of C is "+c);
		return c;
		
	}
	
public static void addN(int a, int b, int c){
		
		int d = a +b+c;
		System.out.println("The value of D is "+d);
		
	}

public static void addN(int a, int b, int c, String s){
	
	int d = a +b+c;
	System.out.println("The value of D is "+d);
	System.out.println("The value of String is "+s);
	
}
public static void addN(int a, int b, int c, String s,String m){
	
	int d = a +b+c;
	System.out.println("The value of D is "+d);
	System.out.println("The value of String is "+s);
	
}

}
