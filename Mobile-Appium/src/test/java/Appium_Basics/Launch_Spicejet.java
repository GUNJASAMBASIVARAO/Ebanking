package Appium_Basics;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Launch_Spicejet {
	
	DesiredCapabilities dc;
	AndroidDriver<WebElement> driver;
	
  @Test
  public void f() throws Exception {
	  
	  
	  driver.findElementByXPath("//android.widget.TextView[@text='One Way']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text='PNQ']").click();
	  driver.findElementByXPath("//android.widget.EditText[@text='Enter airport code/city']").sendKeys("mumbai");
	  driver.findElementByXPath("//android.widget.TextView[@text='BOM - Mumbai, India']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text='BLR']").click();
	  driver.findElementByXPath("//android.widget.EditText[@text='Enter airport code/city']").sendKeys("delhi");
	  driver.findElementByXPath("//android.widget.TextView[@text='DEL - Delhi, India']").click();
	  
	  driver.findElementByXPath("//android.widget.TextView[@text='Thu, 25 Jul']").click();
	  
	  driver.findElementByXPath("//android.widget.TextView[@index='14']").click();
	  
	  driver.findElementByXPath("//android.widget.TextView[@text='1 Traveller']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text='3']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text='2']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text='1']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text='Search']").click();
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZY223MB7FK");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("platformversion", "7.1.1");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  
	  driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
