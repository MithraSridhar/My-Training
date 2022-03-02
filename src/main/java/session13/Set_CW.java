package session13;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_CW {

	public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<String>();
	
	set.add("Test1");
	set.add("Test2");
	set.add("Test3");
	set.add("Test4");
	set.add("Test5");
	set.add("Test6");
	
	//length
	System.out.println("Length "+set.size());
	
	set.add("Test6");
	//length
		System.out.println("Length "+set.size());
		
		for (String eachset : set) {
			System.out.println(eachset);
		}
		
		//contains
		System.out.println("contains "+set.contains("Test5"));
		
		//remove
		set.remove("Test5");
		//contains
		System.out.println("contains "+set.contains("Test5"));
		
		//clear
		set.clear();
		
		//length
		System.out.println("Length "+set.size());
		
		//empty check
		
		System.out.println("Empty check "+set.isEmpty());
	}

}
