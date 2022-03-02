package session13;

import java.util.Arrays;

public class Arrays_CW {

	public static void main(String[] args) {
		
		String[] tests = new String[6];
		
		tests[0]="Test0";
		tests[1]="Test1";
		tests[2]="Test2";
		tests[3]="Test3";
		tests[4]="Test4";
		tests[5]="Test5";
		
		//length
		
		System.out.println("Length "+tests.length);
		
		System.out.println("value of position "+tests[4]);
		//System.out.println(tests);
		//sorting
		Arrays.sort(tests);
		System.out.println(tests[0]);
		System.out.println(tests[1]);
		System.out.println(tests[2]);
		System.out.println(tests[3]);
		System.out.println(tests[4]);
		System.out.println(tests[5]);
		
		//fillx
		Arrays.fill(tests, "Test6");
		System.out.println(tests[0]);
		System.out.println(tests[1]);
		System.out.println(tests[2]);
		System.out.println(tests[3]);
		System.out.println(tests[4]);
		System.out.println(tests[5]);
	String[] cloned=tests.clone();
	
	System.out.println("cloned array comparison "+Arrays.equals(tests, cloned));
		
	}

}
