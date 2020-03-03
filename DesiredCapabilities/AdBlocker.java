package DesiredCapabilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AdBlocker {

	public void adBlockerTest() {

		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".\\libs\\extension_4_6_0_0.crx"));
		DesiredCapabilities capabitilites = new DesiredCapabilities();
		capabitilites.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabitilites);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.guru99.com/smoke-testing.html");
	}

}
