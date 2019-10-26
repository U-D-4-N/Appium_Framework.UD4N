package Framework.Appium_UD4N.test;

import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Framework.Appium_UD4N.core.Core;
import Framework.Appium_UD4N.core.ExtentReportClass;

public class ApiDemoTest1 extends Core{

	@Test
	public void sampleTestOne() {
	// creates a toggle for the given test, adds all log events under it
	ExtentTest test = extent.createTest("API Demo Test 1", "Sample description");
	// log(Status, details)
	test.log(Status.INFO, "[Log:] Start automation test in Android");
	test.info("[Test Script Description] register an account");
	// info(details)
	test.info("This step shows usage of info(detailsjordan)");
	
	
	}
}

