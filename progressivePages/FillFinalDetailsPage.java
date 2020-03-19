package progressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FillFinalDetailsPage {

	WebDriver driver;

	public FillFinalDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_Y']")
	public WebElement haveAutoInsurance;

	@FindBy(how = How.XPATH, using = "//select[@id='FinalDetailsEdit_embedded_questions_list_RecentAutoInsuranceCompanyPeriod']")
	public WebElement timeWithCurrentCompany;

	@FindBy(how = How.XPATH, using = "//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']")
	public WebElement currentInsuranceLimit;

	@FindBy(how = How.XPATH, using = "//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']")
	public WebElement nonAutoPolicyWithProgressive;

	@FindBy(how = How.XPATH, using = "//input[@id='FinalDetailsEdit_embedded_questions_list_PriorProgressive_N']")
	public WebElement previousAutoPolicyWithProgressive;

	@FindBy(how = How.XPATH, using = "//input[@id='FinalDetailsEdit_embedded_questions_list_AdvancedShopperPolicyEffectiveDate']")
	public WebElement policyStartDate;

	@FindBy(how = How.XPATH, using = "//input[@id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']")
	public WebElement emailAddress;

	@FindBy(how = How.XPATH, using = "//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']")
	public WebElement noOffamilyMember;

	@FindBy(how = How.XPATH, using = "//select[@id='FinalDetailsEdit_embedded_questions_list_TotalPipClaimsCount']")
	public WebElement noOfInjuryClaims;

	@FindBy(how = How.XPATH, using = "//loading-button[contains(.,'Continue')]")
	public WebElement clickContinue;

	@FindBy(how = How.XPATH, using = "//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_Y']")
	public WebElement enrollSnapShot;
	
	@FindBy(how = How.XPATH, using = "//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotEnrollmentExperience_D']")
	public WebElement snapShotEnrollement;
	
	@FindBy(how = How.XPATH, using = "//loading-button[contains(.,'No thanks, just auto')]")
	public WebElement clickNoThanks;
	

	public void hasAutoInsuranceToday() {
		haveAutoInsurance.click();
	}

	public void autoInsurancePolicyTime(String currentCompanyTime) {
		Select autoInsuredTime = new Select(timeWithCurrentCompany);
		autoInsuredTime.selectByVisibleText(currentCompanyTime);
	}

	public void currentInsuredLimit(String currentLimit) {
		Select autoInsuredLimit = new Select(currentInsuranceLimit);
		autoInsuredLimit.selectByVisibleText(currentLimit);
	}

	public void hasNonAutoPolicy() {
		nonAutoPolicyWithProgressive.click();
	}

	public void hasPastAutoPolicyWithUs() {
		previousAutoPolicyWithProgressive.click();
	}

	public void AutoPolicyStartDate(String startDate) {
		policyStartDate.sendKeys(startDate);
	}

	public void policyHolderEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}

	public void policyHolderFamilySize(String familySize) {
		Select holderFamilySize = new Select(noOffamilyMember);
		holderFamilySize.selectByVisibleText(familySize);
	}

	public void previousNoOfInjuryClaims(String claimsNo) {
		Select previousClaims = new Select(noOfInjuryClaims);
		previousClaims.selectByVisibleText(claimsNo);
	}

	public void clickContinueToSnapShotwPage() {
		clickContinue.click();
	}

	public void snapShotEnrolled() {
		enrollSnapShot.click();
	}

	public void snapShotEnrollementOption() {
		snapShotEnrollement.click();
	}

	public void clickContinueToBundleInsurancePage() {
		clickContinue.click();
	}
	
	public void clickToFinalRatePage() {
		clickNoThanks.click();
	}

}
