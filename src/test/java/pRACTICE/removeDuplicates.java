package pRACTICE;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {

	public static void main(String[] args) {


		int[] a1 = { 4, 2, 1, 7, 4, 2, 33, 54, 33 };
		

		ArrayList<Integer> aL = new ArrayList<Integer>();

		for (int i = 0; i < a1.length; i++) {

			if (!aL.contains(a1[i])) {
				aL.add(a1[i]);

			}
			;

		}
		;
//		System.out.println(aL);
		
	
	Object[] aa=aL.toArray();
	
	System.out.println(Arrays.toString(aa));

	

	}

}
