package session4;

public class OverridingSubClassPerson extends OverridingBaseClassHuman{
	
	//without over riding , using same mehtod from base class
	/*
	 * public static void main(String[] args) { speak(); walk(); }
	 */
	
	// over riding base class methods

	public void speak() // override method

	{		
		System.out.println("Person can speak All Languages");
		System.out.println("Person can understand all languages");
	}

	public void walk() 
	{
		System.out.println("Person can walk");
		System.out.println("Person can walk fast");
	}
}
