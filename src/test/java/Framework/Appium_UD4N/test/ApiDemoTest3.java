package Framework.Appium_UD4N.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Framework.Appium_UD4N.core.Core;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class ApiDemoTest3 extends Core {

	@Test
	public void appinvite() {
		ExtentTest test = extent.createTest("API Demo Test 3", "Testing App invite");
		driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
		test.pass("Change Log Clicked");
		test.info("Navigating to Main Menu List");
		driver.findElements(By.id("android:id/text1")).get(0).click();
		test.pass("Appinvite Menu List Clicked");
	//	test.addScreencastFromPath("screenshot.png");
		driver.navigate().back();
		test.info("Navigate back to Main Menu List");
	}

	@Test
	public void click() {
		driver.findElementsById("android:id/text1").get(1).click();
		driver.navigate().back();
	}

	
	public void appDemo() {
		ExtentTest test = extent.createTest("API Demo Test 4", "Testing App invite");
		driver.findElements(By.id("android:id/text1")).get(1).click();
		test.pass("Appinvite Menu List Clicked");
		// driver.findElements(By.id("android:id/text1")).get(0).click();
		driver.navigate().back();
		// driver.findElements(By.id("android:id/text1")).get(1).click();
	}

	public void aaa() {
		ExtentTest test = extent.createTest("API Demo Test 5", "Testing App invite");
		test.fail("fail test");
		driver.findElements(By.id("android:id/text1")).get(2).click();
		driver.navigate().back();
	}

}
