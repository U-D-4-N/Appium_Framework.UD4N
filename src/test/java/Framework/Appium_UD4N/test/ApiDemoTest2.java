package Framework.Appium_UD4N.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Framework.Appium_UD4N.core.Core;
import Framework.Appium_UD4N.core.ExtentReportClass;

public class ApiDemoTest2 extends Core {

	@Test
	public void apiDemos1() throws InterruptedException {
		driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
		ExtentTest test = extent.createTest("Api Demos", "Accesibility Testing");
		driver.findElement(By.xpath("//android.widget.TextView[@text='API Demos']")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Node Querying']")).click(); // CheckBox
	    driver.navigate().back(); //Back to Accesiblity Menu
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Service']")).click();
	    driver.navigate().back(); //Back to Accesiblity Menu
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Custom View']")).click();
	    driver.navigate().back(); //Back to Accesiblity Menu
	    driver.navigate().back(); //Back to API Demos Menu
	    
	    // log(Status, details)
		test.log(Status.INFO, "[Log:] Start automation test in Android");
		test.info("[Test Script Description] register an account");

		// driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();
		test.pass("Button clicked");
	}
	@Test
	public void apiDemosAnimation() throws InterruptedException {
		ExtentTest test = extent.createTest("Api Demos - Animation");
		   driver.findElement(By.xpath("//android.widget.TextView[@text='Animation']")).click();
		   driver.findElement(By.xpath("//android.widget.TextView[@text='Activity Transition']")).click();
		   
		   driver.findElement(By.id("com.touchboarder.android.api.demos:id/ducky")).click();
		   Thread.sleep(1000);driver.navigate().back();
		   /**
		   driver.findElement(By.id("com.touchboarder.android.api.demos:id/woot")).click();
		   Thread.sleep(1000);driver.navigate().back();
		   driver.findElement(By.id("com.touchboarder.android.api.demos:id/ball")).click();
		   Thread.sleep(1000);driver.navigate().back();
		   driver.findElement(By.id("com.touchboarder.android.api.demos:id/block")).click();
		   Thread.sleep(1000);driver.navigate().back();
		   driver.findElement(By.id("com.touchboarder.android.api.demos:id/mug")).click();
		   Thread.sleep(1000);driver.navigate().back();
		   driver.findElement(By.id("com.touchboarder.android.api.demos:id/pencil")).click();
		   Thread.sleep(1000);driver.navigate().back();
		   driver.findElement(By.id("com.touchboarder.android.api.demos:id/scissors")).click();
		   Thread.sleep(1000);driver.navigate().back();
		   */
		   driver.navigate().back(); //Back to Animation Menu
		   
		test.log(Status.INFO, "[Log:] Start automation test in Android");
		test.info("[Test Script Description] register an account");
		test.pass("Button clicked");
		
	}

	@Test
	public void animation_cloning() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Cloning']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='RUN']")).click();
		Thread.sleep(2000); // Ball Animation
		driver.navigate().back(); // Back to Animation Menu
	}

	@Test
	public void animation_CustomEvaluator() {
		driver.findElement(By.xpath("//android.widget.TextView[text='Custom Evaluator'])")).click();

	}
}
