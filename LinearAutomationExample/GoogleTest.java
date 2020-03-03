package LinearAutomationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com"); // open url
		driver.manage().window().maximize(); // maximize the browser
		
		WebElement textBoxSearch = driver.findElement(By.xpath("//input[@name='q']"));
		textBoxSearch.sendKeys("What is selenium?");
		
		WebElement searchBtn = driver.findElement(By.name("btnK"));
		searchBtn.sendKeys(Keys.RETURN);
		

	}

}
