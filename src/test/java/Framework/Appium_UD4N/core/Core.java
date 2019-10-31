package Framework.Appium_UD4N.core;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

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
	
	@BeforeTest
	public void setUP() {

		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
			dc.setCapability(MobileCapabilityType.UDID, ""); // ADB ID
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			// --------
			//dc.setCapability(MobileCapabilityType.APP,
			//		"//home//ud4n//Desktop//APK//API Demos for Android_v1.9.0_apkpure.com.apk"); // LOOCATION of APK
			dc.setCapability("appPackage","com.touchboarder.android.api.demos");
			dc.setCapability("appActivity","com.touchboarder.androidapidemos.MainActivity");
			// dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome'");
			// ---------
			
			dc.setCapability(MobileCapabilityType.NO_RESET, false);
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, dc);
	
			// driver.set(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc));
		} catch (Exception exp) {
			System.out.println("Cause :" + exp.getCause());
			System.out.println("Message :" + exp.getMessage());
			exp.printStackTrace();
		}
	}

	// public static sd findElement(By by){
	// AndroidElement element = null;

	// return element;
	// }

	// public static ExtentTest getLogger() {
	// return logger.get();
	// }

	@AfterTest
	public void quitdriver() {
		driver.quit();
	}
	@AfterSuite
	public void tearDown() {
		
		extent.flush(); // Extent Report
		/**
		 * if (!getDriver().equals(null)) { getDriver().quit(); }
		 */

	}

}
