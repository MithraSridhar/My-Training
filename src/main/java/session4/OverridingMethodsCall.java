package session4;

public class OverridingMethodsCall {

public static void main(String[] args) //main method
		
	{
	//create object for Human and Person class
	OverridingBaseClassHuman h = new OverridingBaseClassHuman();
	OverridingSubClassPerson p = new OverridingSubClassPerson();
			//call method speak
			p.speak();
			h.speak();
			//call method walk
			h.walk();
			p.walk();
	}
}
