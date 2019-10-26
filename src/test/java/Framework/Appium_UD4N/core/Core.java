package Framework.Appium_UD4N.core;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Core {
	/** EXTENT REPORT */
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	/** EXTENT REPORT */

	@BeforeSuite
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	/////////////////////////////////////////////////////////////
	
	public static AndroidDriver<MobileElement> driver;
	@BeforeSuite
	public void setUP() {

		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
			dc.setCapability(MobileCapabilityType.UDID, ""); // ADB ID
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			// --------
			dc.setCapability(MobileCapabilityType.APP,
					"//home//ud4n//Desktop//APK//API Demos for Android_v1.9.0_apkpure.com.apk"); // LOOCATION of APK
			// dc.setCapability("appPackage","");
			// dc.setCapability("appActivity","");
			// dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome'");
			// ---------

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, dc);

			// driver.set(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc));
		} catch (Exception exp) {
			System.out.println("Cause :" + exp.getCause());
			System.out.println("Message :" + exp.getMessage());
			exp.printStackTrace();
		}
	}

	// public static AndroidElement findElement(By by){
	// AndroidElement element = null;

	// return element;
	// }

	// public static ExtentTest getLogger() {
	// return logger.get();
	// }

	@AfterSuite
	public void tearDown() {
		driver.quit();
		extent.flush(); // Extent Report
		/**
		 * if (!getDriver().equals(null)) { getDriver().quit(); }
		 */

	}

}
