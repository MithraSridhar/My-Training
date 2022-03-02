package session13;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable_CW {

	public static void main(String[] args) {
	Map<Integer,String> tests = new Hashtable<Integer,String>();
		
		tests.put(5, "Test1");
		tests.put(2, "Test2");
		tests.put(7, "Test2");
		tests.put(8, "Test8");
		tests.put(8, "Test10");
		//tests.put(null, null);
		
		//length		
		System.out.println("Length "+tests.size());
		
		//to get value
		System.out.println("To get value using key "+tests.get(2));
		
		for (Entry<Integer,String> eachmap : tests.entrySet()) {
			
			System.out.println("The key is "+eachmap.getKey());
			System.out.println("The Value is "+eachmap.getValue());
			
		}
		
		//contains key
		System.out.println("Contains "+tests.containsKey(8));
		

		//contains value
		System.out.println("Contains "+tests.containsValue("Test8"));
		
		//clear
		tests.clear();
		
		//length		
		System.out.println("Length "+tests.size());
				
//empty
				
		 System.out.println("Empty check "+tests.isEmpty());


	}

}
