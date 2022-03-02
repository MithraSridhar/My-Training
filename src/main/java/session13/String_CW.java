package session13;

public class String_CW {

	public static void main(String[] args) {
		//stringAddress();
		stringBuffer();
		//basicString();
	}
	
	public static void stringAddress() {
		//literall calling
		String a ="Selenium";
		
		System.out.println("Memory address of string a is "+ System.identityHashCode(a));
		
		//using new keyword
		String b= new String("Selenium1");
		System.out.println("Memory address of string b is "+ System.identityHashCode(b));

	}
	
	public static void stringBuffer() {
		String str ="STR";		
		str=str.concat("1");
		System.out.println("String value is "+str);
		StringBuffer stb = new StringBuffer("stringbuffer");
		//reverse
		System.out.println("Reverse "+stb.reverse());
		stb.append("1");
		System.out.println("StringBuffer value is "+stb);		
	}
	
	public static void basicString() {
		//Length
		String text = "SeleniumBatch1";		
		System.out.println("Length "+text.length());
		
		//string to char array
		
		char[] array = text.toCharArray();
		System.out.println("Stirng to Char array is" +array.length);
		
		//char to string
		
		char[] chararray = {'t','e','s','t'};
		System.out.println("Char to String "+chararray.toString());
		
		//charat
		System.out.println("Char at position "+text.charAt(4));
		//to get last character
		System.out.println("Char at position "+text.charAt(text.length()-1));
		//to get position
		System.out.println("Position of char "+text.indexOf('e'));
		
		//to get position last occ
		System.out.println("Last Position of char "+text.lastIndexOf('e'));
		
		//convert Stirng to integer	
		String num = "3456";
		Integer i= Integer.parseInt(num);
		System.out.println("String to int "+i);
		//int to string
		Integer number = 10;
		System.out.println("Interger to string "+number.toString());
		
		//substring
		System.out.println("Substring "+text.substring(5,9));
		//trailing space
		String space = "Testing ";
		System.out.println("Trimming "+space.trim());
		
		//Lowercase
		System.out.println("Lowercase "+text.toLowerCase());
		
		//uppercase
		System.out.println("Uppercase "+text.toUpperCase());
		
		//replace
		System.out.println("Replace "+text.replace('e', 'Z'));
		
	//split
		String split = "Split ting";
		String[] splitted =split.split(" ");
		System.out.println("Splitted value is "+splitted);
	}

}
