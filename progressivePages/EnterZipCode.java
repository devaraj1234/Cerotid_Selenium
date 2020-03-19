package progressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EnterZipCode {
	
	WebDriver driver = null;
	
	public EnterZipCode(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.XPATH, using = "//input[@id='zipCode_overlay']")
	public WebElement enterZipCode;
	
	@FindBy(how = How.XPATH, using = "//input[@id='qsButton_overlay']")
	public WebElement clickGetQuote;
	
	public void enterZipCode(String zipCode) {
		enterZipCode.clear();
		enterZipCode.sendKeys(zipCode);
		clickGetQuote.click();
	}


}
