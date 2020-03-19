package com.Cerotid.webpageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CerotidWebisteLinearExample {

	static WebDriver driver;

	public static void main(String[] args) {

		invokeBrowser();
		
		fillForm();

	}

	private static void fillForm() {
		
		// to select the course
		WebElement course = driver.findElement(By.xpath("//select[@id='classType']"));
		Select chooseCourse = new Select(course);
		String[] selectCource = {"QA Automation", "Java", ".Net", "SQL / MSBI", "Security", "Identity Access Management"};
		//String selectCourse = "QA Automation";
		for(int i=0; i<selectCource.length; i++) {
			
			chooseCourse.selectByVisibleText(selectCource[i]);
		}
		
		// to select the session
		WebElement session = driver.findElement(By.xpath("//select[@id='sessionType']"));
		Select choosesession = new Select(session);
		String selectSession = "Upcoming Session";
		choosesession.selectByVisibleText(selectSession);
		
		// to input the name
		WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
		inputName.sendKeys("Dev Acharya");
		
		// to input address
		WebElement inputAddress = driver.findElement(By.xpath("//input[@id='address']"));
		inputAddress.sendKeys("Dallas");
		
		// to input City
		WebElement inputCity = driver.findElement(By.xpath("//input[@id='city']"));
		inputCity.sendKeys("Irving");
		
		// to select State
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select selectState = new Select(state);
		selectState.selectByVisibleText("TX");
		
		// to input Zipcode
		WebElement inputZipcode = driver.findElement(By.xpath("//input[@id='zip']"));
		inputZipcode.sendKeys(String.valueOf(75038));
		
		// to input email
		WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
		inputEmail.sendKeys("dev.acharya286@gmail.com");
		
		// to input phone
		WebElement inputPhone = driver.findElement(By.xpath("//input[@id='phone']"));
		inputPhone.sendKeys("972-251-9902");
		
		// to choose Visa Status
		WebElement visaStatus = driver.findElement(By.xpath("//select[@id='visaStatus']"));
		Select selectVisaStatus = new Select(visaStatus);
		selectVisaStatus.selectByVisibleText("GreenCard");
		
		WebElement mediaSource = driver.findElement(By.xpath("//select[@id='mediaSource']"));
		Select selectMediaSource = new Select(mediaSource);
		selectMediaSource.selectByVisibleText("Other");
		
		WebElement relocate = driver.findElement(By.xpath("//input[@type='radio'][@value='N0']"));
		relocate.click();
		
		WebElement eduDetails = driver.findElement(By.xpath("//textarea[@id='eduDetails']"));
		eduDetails.sendKeys("Masters in Business Studies");
	}


	private static void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("http://www.cerotid.com");
		System.out.println(driver.getTitle()+"------------- was launched");
		driver.manage().window().maximize();
		

	}

}
