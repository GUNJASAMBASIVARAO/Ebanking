package Appium_Basics;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Whatsapp {
	DesiredCapabilities dc;
	 WebDriver driver;
 @Test
 public void f() throws Exception{
	  
	  driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='WhatsApp']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text,'Sivapriya Sis']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).click();
	  
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).sendKeys("Hello");
	  
 }
 @BeforeTest
 public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  
	  dc.setCapability("deviceName", "ZY223MB7FK");
	  dc.setCapability("platformVersion", "7.1.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("automationName", "uiautomator2");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.HomeActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }
 @AfterTest
 public void afterTest() {
	 driver.quit();
	  
 }


}
