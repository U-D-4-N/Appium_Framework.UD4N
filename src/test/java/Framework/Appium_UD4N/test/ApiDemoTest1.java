package Framework.Appium_UD4N.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Framework.Appium_UD4N.core.Core;
import Framework.Appium_UD4N.core.ExtentReportClass;
import io.appium.java_client.MobileElement;

public class ApiDemoTest1 extends Core {

	@Test
	public void sampleTestOne() throws InterruptedException {

		driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
		// MobileElement appInviteDemo =
		// driver.findElement(By.xpath("//android.widget.TextView[@test='App Invite
		// Demo']"));
		// creates a toggle for the given test, adds all log events under it
		// appInviteDemo.click();
		ExtentTest test = extent.createTest("App Invite Demo", "Sample description");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='App Invite Demo']")).click();
		// log(Status, details)
		test.log(Status.INFO, "[Log:] Start automation test in Android");
		test.info("[Test Script Description] register an account");
		// info(details)
		test.info("This step shows usage of info(detailsjordan)");

	}
}
