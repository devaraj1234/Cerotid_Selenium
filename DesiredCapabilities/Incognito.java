package DesiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Incognito {

	public  void incognitoTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabitilites = new DesiredCapabilities();
		capabitilites.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	}

}
