package session2;

public class LoopingStatements {

	public static void main(String[] args) {
		
		//while loop
		int i=1;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	    }  
		
	  //do-while loop
	  int j =1;  
	    do{    
	        System.out.println(j);    
	    j++;    
	    }
	    while(j<=10);    
	   
	
	//for loop
	for(int k=1; k<=10; k++){  
        System.out.println(k);  
    }  
	
	//for each
	//Declaring an array  
    int arr[]={12,23,44,56,78};  
    //Printing array using for-each loop  
    for(int eacharray:arr){  
        System.out.println(eacharray);  
    }  
	
	}
}
