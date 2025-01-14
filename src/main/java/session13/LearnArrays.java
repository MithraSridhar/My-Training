package session13;

import java.util.Arrays;

public class LearnArrays {

	/**
	 * An array is a container object that holds a fixed number  
	 * of values of a single type. 
	 * The length of an array is established when the array is 
	 * created.After creation, its length is fixed. 
	 * 
	 * Each item in an array is called an element, and 
	 * each element is accessed by its numerical index.
	 * Starting index : 0
	 * 
	 */

	public static void main(String[] args) {

		// It is 6 sized array supports only String
		String[] tests = new String[6];
		tests[0] = "Test1";
		tests[1] = "Test2";
		tests[2] = "Test3";
		tests[3] = "Test4";
		tests[4] = "Test5";
		tests[5] = "Test6"; // if not assigned ; so default value is null
		System.out.println("The number of tests are :"+tests.length);

		System.out.println(tests[1]);
		System.out.println(tests[5]);
		//System.out.println(tests[6]); // accessing beyond size, throws exception


		// Array sort for string throw error
		Arrays.sort(tests);
		System.out.println(tests[0]);
		System.out.println(tests[5]);

		// Filling an array to place a specific value at each index 
		Arrays.fill(tests, 0, 4, "Test9");
	//	Arrays.fill(tests, "Test7");
		System.out.println(tests[0]);
		System.out.println(tests[1]);
		System.out.println(tests[2]);
		System.out.println(tests[3]);
		System.out.println(tests[4]);

		// Another way of creating
		int[] weeks = {1,2,3,4,5,6,11,7,9};
		System.out.println("int array "+weeks[0]);


		// Searching for a mentor
		System.out.println("The index of 4 is Searching for a mentor"
				+ " :"+Arrays.binarySearch(weeks, 4));
		// binarySearch not applicable to String but can be used for character


		int[] anotherWeek = weeks.clone();
		System.out.println(anotherWeek[2]);

		anotherWeek[2]=23;
		// Compare 2 arrays
		System.out.println("The comparison of the 2 int arrays are:"
				+ " clone : "+Arrays.equals(weeks, anotherWeek));

		
		//System.out.println(sort.toString());



	}

}
