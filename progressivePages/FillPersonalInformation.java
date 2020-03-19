package progressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FillPersonalInformation {

	WebDriver driver;

	public FillPersonalInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_FirstName")
	public WebElement enterFirstName;

	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_MiddleInitial")
	public WebElement enterMiddleName;

	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_LastName")
	public WebElement enterlastName;

	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_Suffix")
	public WebElement selectSuffix;

	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	public WebElement enterDOB;

//	@FindBy(how = How.XPATH, using = "//input[@name='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
//	public WebElement enterStreetNoandName;
//	
	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
	public WebElement enterAddress;

	// By streetName =
	// By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_MailingAddress']");

	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_ApartmentUnit")
	public WebElement enterAptNo;

	@FindBy(how = How.ID, using = "NameAndAddressEdit_embedded_questions_list_MailingZipType")
	public WebElement selectPOBoxMilitiry;

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Okay, start my quote.')]")
	public WebElement clickStartMyQuote;

	public void enterFirstName(String firstName) {
		enterFirstName.sendKeys(firstName);
	}

	public void enterMiddleName(String milddleInitial) {
		enterMiddleName.sendKeys(milddleInitial);
	}

	public void enterLastName(String lastName) {
		enterlastName.sendKeys(lastName);
	}

	public void selectSuffix(String suffix) {
		Select select = new Select(selectSuffix);
		select.selectByVisibleText(suffix);
	}

	public void enterDob(String dateOfBirth) {
		enterDOB.sendKeys(dateOfBirth);
	}

	public void enterStreetAddress(String streetAddress) {
		enterAddress.sendKeys(streetAddress);
	}

	public void enterApartmentNo(String aptNo) {
		enterAptNo.sendKeys(aptNo);
	}

	public void selectPOBoxMilitiry() {
		selectPOBoxMilitiry.click();
	}

	public void clickStartMyQuote() {
		clickStartMyQuote.click();
	}

}
