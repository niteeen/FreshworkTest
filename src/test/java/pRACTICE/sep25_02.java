package pRACTICE;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sep25_02 {

	@Test(dataProvider="myname")
	public static void ff(String fname, String lname) {
		
		System.out.println(fname+" "+lname);
		
		
		
		
	};
	
	
	@DataProvider(name="myname")
public static	Object[][] gg() {
		
		Object[][] gf= new Object[1][2];
		
		gf[0][0]="Nitin";
		gf[0][1]="Shrivastava";
		
		return gf;
		
//		return new Object[][] {{"Nitin","Shrivastava"}};
		
	};

	
	
	
	
	

}
