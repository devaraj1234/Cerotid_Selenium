package DesiredCapabilities;

public class DesiredCapabilitiesTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");

		Incognito incognito = new Incognito();
		incognito.incognitoTest();
		Headless headLess = new Headless();
		headLess.headLessTest();
		AdBlocker adBlocker = new AdBlocker();
		adBlocker.adBlockerTest();
	}

}
