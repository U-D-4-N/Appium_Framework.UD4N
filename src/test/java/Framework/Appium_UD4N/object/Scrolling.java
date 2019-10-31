package Framework.Appium_UD4N.object;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Framework.Appium_UD4N.core.Core;
import Framework.Appium_UD4N.core.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Scrolling extends Core{
	
	public void scrollDown() {
		Dimension dimension = MobileDriver.getDriver().manage().window().getSize();
		
		Double scroll_HeightStart = dimension.getHeight() * 0.5;
		Double scroll_HeightEnd = dimension.getHeight() * 0.2;
		System.out.println("Scroll Height Start: "+ scroll_HeightStart);
		System.out.println("Scroll Height Start: "+ scroll_HeightEnd );	
		
		int scrollStart =  scroll_HeightStart.intValue();
		int scrollEnd = scroll_HeightEnd.intValue();
		

		new TouchAction((PerformsTouchActions) MobileDriver.getDriver())
		.press(PointOption.point(0,scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release()
		.perform();
	}
	
	public WebElement getItemViews() {
		return MobileDriver.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Views']"));
	}
	
	public List<WebElement> getItemWebView(){
		return MobileDriver.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Tabs and Pager']"));
	}
	
	public void scrollTillWebView() throws InterruptedException {
		getItemViews().click();
		
		while(getItemWebView().size() == 0) {
			scrollDown();
		}
		
		if(getItemWebView().size() > 0) {
			getItemWebView().get(0).click();
		}
		Thread.sleep(4000);	
		
	}
	
	
   public void scrollAndClick(String visibleText) {
	   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();   
   }

}
