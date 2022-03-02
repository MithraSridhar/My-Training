package session2;

public class LoopingStatement_CW {

	public static void main(String[] args) {

		int i=1;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		int j=1;
		do {
			System.out.println(j);
			j++;
		}		
		while(j<10);
		
		for(int k =1;k<=10;k++) {
			System.out.println(k);
		}
			
	int a[]= {2,4,5,6,7,8,9};
	
	for (int each : a) {
		System.out.println(each);
	}
	
				
	}

}
