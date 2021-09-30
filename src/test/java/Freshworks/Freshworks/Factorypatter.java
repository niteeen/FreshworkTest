package Freshworks.Freshworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Factorypatter {
	
	WebDriver driver;
	public Factorypatter(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	};
	
	
	@FindBy(id="ff")
	WebElement element;
	
	
	
	public WebElement chkp() {
		
		
		SoftAssert ff= new SoftAssert();
//		ff.assertEquals(actual, expected);
	ff.assertAll();
		
		return element;
		
	};

}
