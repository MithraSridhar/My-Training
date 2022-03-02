package session13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_CW {

	public static void main(String[] args) {
	List<String> lists = new LinkedList<String>();
	
	//to add values to the list
	lists.add("Test1");
	lists.add("Test2");
	lists.add("Test3");
	lists.add("Test4");
	lists.add("Test5");
	lists.add("Test6");
	
	//to find the lenght
	
	System.out.println("Length "+lists.size());
	
	//duplicate
	lists.add("Test6");
	
	System.out.println("Length "+lists.size());
	for (String list : lists) {
		System.out.println(list);		
	}
	
	//contains
	System.out.println("contains "+lists.contains("Test5"));
	
	lists.remove("Test5");
	
	//contains
		System.out.println("contains "+lists.contains("Test5"));
		
		//sort
		Collections.sort(lists);
		
		for (String list : lists) {
			System.out.println(list);		
		}
		
		lists.clear();
		
		System.out.println("Length "+lists.size());
		
		//empty verification
		System.out.println("Check empty "+lists.isEmpty());
	}

}
