package Framework.Appium_UD4N.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Framework.Appium_UD4N.core.Core;

public class ApiDemoTest4 extends Core {

	@Test
	public void clickasdasdasd(){
		driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElements(By.id("android:id/text1")).get(0).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void asdas () {
		
		driver.findElements(By.id("android:id/text1")).get(1).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
