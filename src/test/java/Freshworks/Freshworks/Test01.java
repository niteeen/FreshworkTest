package Freshworks.Freshworks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pRACTICE.sep25_02;

public class Test01 extends sep25_02 {

	@Parameters("Browser")
	@Test
	public void tst(String Browser) {
		
		
		System.out.println(Browser);
		
		
		
	};
	
	@Test(dataProvider="myname")
	public static void FreshTest(String fname, String lname) {
		
		System.out.println(fname+" "+lname);
		
		
		
		
	};
	
	@Test
	public void NitinTest() {
		
		
		System.out.println("HEy This is Nitin Testing");
		
		
		
	};
	
	
}
