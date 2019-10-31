package Framework.Appium_UD4N.core;

import org.openqa.selenium.WebDriver;

public class MobileDriver {

	private static WebDriver webDriver;
	
	public static WebDriver getDriver() {
		return webDriver;
	}
	
	static void setWebDriver(WebDriver driver) {
		webDriver = driver;
	}

}
