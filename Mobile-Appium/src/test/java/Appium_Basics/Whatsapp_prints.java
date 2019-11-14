package Appium_Basics;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class Whatsapp_prints {
 
	DesiredCapabilities dc;
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws InterruptedException {
	  TouchAction t=new TouchAction <> (driver);
	  driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.whatsapp:id/fab']").click();

	for(int p=0; p<10; p++) {  
	  List<WebElement> names = driver.findElementsById("com.whatsapp:id/contactpicker_row_name");
	  System.out.println(names.size());
	  for (int i = 0; i < names.size(); i++) {
		System.out.println(names.get(i).getText());
	}
	t.press(ElementOption.point(126, 1169)).waitAction().moveTo(ElementOption.point(126, 385)).release().perform();
	Thread.sleep(2000);
}
	
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZY223MB7FK");
	  dc.setCapability("platformVersion", "7.1.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.HomeActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }

  @AfterTest
  public void afterTest() {
  }


}
