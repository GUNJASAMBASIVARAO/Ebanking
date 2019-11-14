package testNG_Spicejet;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Actions_spicejet {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Actions a=new Actions(driver);
	  WebElement str=driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  a.moveToElement(str).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Corporate Accounts")).click();
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  Thread.sleep(2000);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();

	  
  }
  @BeforeTest
  public void beforeTest() {
	    
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
  }

 

}
