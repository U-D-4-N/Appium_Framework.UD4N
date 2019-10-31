package Framework.Appium_UD4N.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Framework.Appium_UD4N.core.Core;
import Framework.Appium_UD4N.object.Scrolling;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class ApiDemoTest5 extends Core{
	
	
	//Mobile Element
	String fragmentXpath ="//android.widget.TextView[@text='Fragment']";
	@Test
	public void scrollDown() throws InterruptedException {
		driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Support v4 Demos']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fragmentXpath)).click();
		Thread.sleep(5000);
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Tabs and Pager\").instance(0))").click();
		//Thread.sleep(5000);
		Scrolling scroll = new Scrolling();
		scroll.scrollAndClick("Dialog");
		Thread.sleep(5000);
		driver.navigate().back();
		scroll.scrollAndClick("Tabs and Pager");
		Thread.sleep(5000);	
	}
	
	
	
	
	

}
