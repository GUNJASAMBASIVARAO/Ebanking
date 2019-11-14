package Appium_Basics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Launch_Shareit {
	DesiredCapabilities dc;
	 WebDriver driver;
  @Test
  public void f() throws Exception {
 dc=new DesiredCapabilities();
	  
	  dc.setCapability("deviceName", "ZY223MB7FK");
	  dc.setCapability("platformVersion", "7.1.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("automationName", "uiautomator2");
	  dc.setCapability("appPackage", "com.lenovo.anyshare.gps");
	  dc.setCapability("appActivity", "com.lenovo.anyshare.main.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//android.widget.TextView[@text='SHAREit']")).click();
	  driver.quit();
	 
	  
  }
}
