package progressivePagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import progressivePages.EnterZipCode;

public class EnterZipCodeTest {
	
	WebDriver driver = GetByQouteTest.driver;
	
	@Test(priority =1)
	public void sendZipCode() {
		//performActions();
		EnterZipCode enterZip = new EnterZipCode(driver);
		enterZip.enterZipCode("75038");
	}
}
