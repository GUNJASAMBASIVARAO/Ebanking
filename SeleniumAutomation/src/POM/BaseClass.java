package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BaseClass {
	
    
	public WebDriver driver;
     public void OpenBrowser() {
    	 System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
    	 driver =new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	 driver.manage().window().maximize();
     }
    	 
    	 
    public void OpenURL(String URL){
    	driver.get(URL);
    }
    	
    public void CLick(By loc) {
    	driver.findElement(loc).click();
    	
    	 
     }
    public void type(By loc, String Value) {
    	driver.findElement(loc).sendKeys(Value);
    	
    }
    public void select(By loc, String Value) {
    	new Select(driver.findElement(loc)).selectByVisibleText(Value);
    	
    }
    public void CloseBrowser() {
    	driver.quit();
    }
    public void Alert_ok() {
    	driver.switchTo().alert().accept();
    }
    public void Alert_cancel() {
    	driver.switchTo().alert().dismiss();
    }


	
}
