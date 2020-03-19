package progressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FillFinalDetailsPage {
	
	WebDriver driver;

	public FillFinalDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
