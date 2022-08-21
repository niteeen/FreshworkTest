package pRACTICE;

import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		
		int[] a1= {3,1,7};
		
		
	int[] a2=	a1.clone();
	
	
	
	for(int a:a2) {
		
System.out.println(a);
		
	};
	
	
	if(Arrays.equals(a1, a2)) {
		
		
		System.out.println("Hey This is matched ");
		System.out.println("Making Some Chnages ");
		
	};
		
		
		
		
		
		
		

	}

}
