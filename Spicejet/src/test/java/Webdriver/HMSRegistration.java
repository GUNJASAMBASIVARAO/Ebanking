package Webdriver;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HMSRegistration {
	 WebDriver driver;
		
	  @Test
	  public void Test() {
		  
		  driver.findElement(By.xpath("//*[@name=\'username\']")).sendKeys("admin");
		  driver.findElement(By.xpath("//*[@name=\'password\']")).sendKeys("admin");
	   	driver.findElement(By.xpath("//*[@name=\'submit\']")).click();
	   	
	   	driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Permanent Registration')]")).click();
		 
	  }
	  @BeforeTest
	  public void beforeTest() {
		    System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://selenium4testing.com/hms/");
			
			
			

			
	  }

	  @AfterTest
	  public void afterTest() {
		  
		  driver.quit();
	  }

}
