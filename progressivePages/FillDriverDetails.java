package progressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FillDriverDetails {

	WebDriver driver;

	public FillDriverDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_M']")
	public WebElement selectGender;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']")
	public WebElement selectMaritalStatus;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']")
	public WebElement selectLevelOfEducation;
	
	@FindBy(how = How.XPATH, using = "//*[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']")
	public WebElement selectEmployementStatus;

	@FindBy(how = How.XPATH, using = "//input[@id='DriversAddPniDetails_embedded_questions_list_Occupation']")
	public WebElement fillOccupation;

	@FindBy(how = How.XPATH, using = "//input[@id='DriversAddPniDetails_embedded_questions_list_SocialSecurityNumber']")
	public WebElement fillSSN;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']")
	public WebElement selectPrimaryResidence;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']")
	public WebElement selectMovedInLast2Month;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']")
	public WebElement selectLicenseStatus;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']")
	public WebElement selectYearLicensed;

	@FindBy(how = How.XPATH, using = "//*[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']")
	public WebElement selectAccidentClaimOrNot;

	@FindBy(how = How.XPATH, using = "//*[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']")
	public WebElement selectTicketVoilationOrNot;

	@FindBy(how = How.XPATH, using = "//loading-button[contains(.,'Continue')]")
	public WebElement clickContinue;

	public void chooseGender() {
		selectGender.click();
	}

	public void chooseMaritalStatus(String maritalStatus) {
		Select maritalstatus = new Select(selectMaritalStatus);
		maritalstatus.selectByVisibleText(maritalStatus);
	}

	public void chooseLevelOfEducation(String education) {
		Select levelOfEdu = new Select(selectLevelOfEducation);
		levelOfEdu.selectByVisibleText(education);
	}
	
	public void chooseEmployeementStatus(String employementStatus) {
		Select driverEmployementStatus = new Select(selectEmployementStatus);
		driverEmployementStatus.selectByVisibleText(employementStatus);
	}

	public void driverOccupation(String occupation) {
		fillOccupation.sendKeys(occupation);
	}

	public void driverSSN(String ssn) {
		fillSSN.sendKeys(ssn);
	}

	public void choosePrimaryResidence(String residence) {
		Select driverResidence = new Select(selectPrimaryResidence);
		driverResidence.selectByVisibleText(residence);
	}

	public void chooseLatestMoved(String latestMoved) {
		Select driverMovedStatus = new Select(selectMovedInLast2Month);
		driverMovedStatus.selectByVisibleText(latestMoved);
	}

	public void chooseLicenseStatus(String licenseStatus) {
		Select driverLicenseStatus = new Select(selectLicenseStatus);
		driverLicenseStatus.selectByVisibleText(licenseStatus);
	}

	public void chooseYearLicensed(String yearLicensed) {
		Select driverYearLicensed = new Select(selectYearLicensed);
		driverYearLicensed.selectByVisibleText(yearLicensed);
	}

	public void clickAccidentClaimOrNot() {
		selectAccidentClaimOrNot.click();
	}

	public void clickTicketVoilationOrNot() {
		selectTicketVoilationOrNot.click();
	}

	public void clickContinueForNextPage() {
		clickContinue.click();
	}
	
	public void clickContinueToReviewPage() {
		clickContinue.click();
	}
	
	public void clickContinueToFinalDetailPage() {
		clickContinue.click();
	}
}
