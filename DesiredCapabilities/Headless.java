package DesiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Headless {

	public void headLessTest() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		DesiredCapabilities capabitilites = new DesiredCapabilities();
		capabitilites.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabitilites);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println("The title of page is ========> " + driver.getTitle());
	}

}
