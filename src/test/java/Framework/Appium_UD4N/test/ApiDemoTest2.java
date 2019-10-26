package Framework.Appium_UD4N.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Framework.Appium_UD4N.core.Core;
import Framework.Appium_UD4N.core.ExtentReportClass;

public class ApiDemoTest2 extends Core {

	@Test
	public void changelog() {

		ExtentTest test = extent.createTest("API Demo Test 2", "Sample description");
		// log(Status, details)
		test.log(Status.INFO, "[Log:] Start automation test in Android");
		test.info("[Test Script Description] register an account");

		// driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
		test.pass("Button clicked");
	}
}
