package session14;

import java.lang.reflect.Method;


public class DynClass {

	public static void main(String[] args) throws ClassNotFoundException {
       
		Class wr = Class.forName("session8.GenericWrappers"); 
        Method[] allMethods = wr.getDeclaredMethods();
        for (Method method : allMethods) {
			System.out.println(method.getName());
		}
	}

}
