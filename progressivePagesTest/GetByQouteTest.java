package progressivePagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import progressivePages.EnterZipCode;
import progressivePages.FillDriverDetails;
import progressivePages.FillFinalDetailsPage;
import progressivePages.FillPersonalInformation;
import progressivePages.FillVehicleDetails;
import progressivePages.HomePage;

public class GetByQouteTest {

	static WebDriver driver;
	FillPersonalInformation fillPI;
	FillVehicleDetails fillVehicleDetails;
	FillDriverDetails fillDriverDetails;
	FillFinalDetailsPage fillFinalDetails ;

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void invokeBrowser() {
		driver.get("https://www.progressive.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();

	}

	@Test(priority = 0)
	public void performActions() {
		invokeBrowser();

		HomePage obj = new HomePage(driver);
		obj.getQuoteForQuto();
	}

	@Test(priority = 1)
	public void sendZipCode() throws InterruptedException {
		EnterZipCode enterZip = new EnterZipCode(driver);
		enterZip.enterZipCode("75038");
		Thread.sleep(4000);
	}

	@Test(priority = 2)
	public void fillPersonalInformation() throws InterruptedException {
		fillPI = new FillPersonalInformation(driver);

		fillPI.enterFirstName("Jhon");
		fillPI.enterMiddleName("D");
		fillPI.enterLastName("Keller");
		fillPI.selectSuffix("");
		fillPI.enterDob("03081989");
		fillPI.enterApartmentNo("2149");
		fillPI.selectPOBoxMilitiry();
		fillPI.enterStreetAddress("3143 W Walnut Hill Lane");
		fillPI.clickStartMyQuote();
		Thread.sleep(4000);
	}

	@Test(priority = 3)
	public void fillVehicleInformation() throws InterruptedException {

		fillVehicleDetails = new FillVehicleDetails(driver);

		fillVehicleDetails.chooseVehicleYear("2019");
		Thread.sleep(2000);
		fillVehicleDetails.chooseVehicleMake("Audi");
		Thread.sleep(2000);
		fillVehicleDetails.chooseVehicleModel("A6");
		Thread.sleep(2000);
		fillVehicleDetails.chooseBodyType("4DR 4CYL");
		Thread.sleep(2000);
		fillVehicleDetails.choosePrimaryUse("Personal (to/from work or school, errands, pleasure)");
		Thread.sleep(2000);
		fillVehicleDetails.chooseOwnOrLease("Own");
		Thread.sleep(2000);
		fillVehicleDetails.chooseOwnPeriod("1 year - 3 years");
		Thread.sleep(2000);
		fillVehicleDetails.chooseBlindSpotWarning();
		fillVehicleDetails.clickOnDone();
		Thread.sleep(2000);
		fillVehicleDetails.continueToNextPage();
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void fillDriverInformation() throws InterruptedException {
		fillDriverDetails = new FillDriverDetails(driver);

		fillDriverDetails.chooseGender();
		fillDriverDetails.chooseMaritalStatus("Single");
		fillDriverDetails.chooseLevelOfEducation("College degree");
		fillDriverDetails.chooseEmployeementStatus("Employed");
		Thread.sleep(2000);
		fillDriverDetails.driverOccupation("Software Developer");
		fillDriverDetails.driverSSN("867234789");
		Thread.sleep(2000);
		fillDriverDetails.choosePrimaryResidence("Rent");
		fillDriverDetails.chooseLatestMoved("No");
		Thread.sleep(2000);
		fillDriverDetails.chooseLicenseStatus("Valid");
		fillDriverDetails.chooseYearLicensed("3 years or more");
		Thread.sleep(2000);
		fillDriverDetails.clickAccidentClaimOrNot();
		Thread.sleep(2000);
		fillDriverDetails.clickTicketVoilationOrNot();
		Thread.sleep(2000);
		fillDriverDetails.clickContinueForNextPage();
		Thread.sleep(4000);
		fillDriverDetails.clickContinueToReviewPage();
		Thread.sleep(4000);
		fillDriverDetails.clickContinueToFinalDetailPage();
		Thread.sleep(4000);
	}
	
	@Test(priority = 5)
	public void fillFinalInformation() throws InterruptedException {
		
		fillFinalDetails = new FillFinalDetailsPage(driver);
		fillFinalDetails.hasAutoInsuranceToday();
		Thread.sleep(2000);
		fillFinalDetails.autoInsurancePolicyTime("3 to 5 years");
		Thread.sleep(2000);
		fillFinalDetails.currentInsuredLimit("$30,000/$60,000 (State Min) or less");
		Thread.sleep(2000);
		fillFinalDetails.hasNonAutoPolicy();
		fillFinalDetails.hasPastAutoPolicyWithUs();
		Thread.sleep(2000);
		fillFinalDetails.AutoPolicyStartDate("04012020");
		fillFinalDetails.policyHolderEmailAddress("jhon.keller2347@gmail.com");
		Thread.sleep(2000);
		fillFinalDetails.policyHolderFamilySize("2");
		Thread.sleep(2000);
		fillFinalDetails.previousNoOfInjuryClaims("0");
		fillFinalDetails.clickContinueToSnapShotwPage();
		Thread.sleep(4000);
		fillFinalDetails.snapShotEnrolled();
		fillFinalDetails.snapShotEnrollementOption();
		Thread.sleep(4000);
		fillFinalDetails.clickContinueToBundleInsurancePage();
		Thread.sleep(4000);
		fillFinalDetails.clickToFinalRatePage();
	}

//	@AfterTest
//	public void closeBrowser() {
//		driver.close();
//		driver.quit();
//	}

}