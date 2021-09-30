package pRACTICE;

public class Sep25 {

	public static void main(String[] args) {

		int[] a1 = { 3, 5, 1, 444, 445, 2 };
		int secondhighest=0;
		
		int gg=r1(a1);
		
		System.out.println(gg);
		
		
		for (int i = 0; i < a1.length; i++) {

			if (secondhighest < a1[i] &&a1[i]!=gg) {

				secondhighest = a1[i];
			}
			;

			
			
			
			
			
		};
		
		
		
		System.out.println("2nd high: "+secondhighest);
		
		
		

	}
	
	
	
	
	
	
	

	public static int r1(int[] aa) {

		int highest = 0;

		for (int i = 0; i < aa.length; i++) {

			if (highest < aa[i]) {

				highest = aa[i];
			}
			;

		}
		;

		return highest;

	};

}