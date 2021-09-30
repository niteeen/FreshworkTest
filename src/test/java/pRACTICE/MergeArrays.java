package pRACTICE;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {4,2,6};
		
		int[] b = {5,100,56};
		
	int a1= a.length;
	int b1=b.length;
	
	
	int[] c= new int[a1+b1];
	
	
	System.arraycopy(a, 0, c, 0, a1);
	System.arraycopy(b, 0, c, a1, b1);
	
	System.out.println(Arrays.toString(c));

	

	}

}
