package Files;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_Retesting {
	private WebDriver driver; 
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream(".\\TestData\\Sheet1.xlsx");
	  Workbook w= new XSSFWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  for (int i = 1; i <= s.getLastRowNum(); i++) {
		  Row r=s.getRow(i);
		  
		  Cell c=r.getCell(0);
		  Cell c1=r.getCell(1);
		  
		  System.out.println(c);
		  System.out.println(c1);
		   
		    driver.findElement(By.name("username")).sendKeys(c.toString());
			driver.findElement(By.name("password")).sendKeys(c1.toString());
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			try {
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);	
				System.out.println("Pass");
			}catch(Exception e) {
				driver.switchTo().alert().accept();
				System.out.println("Fail");
			}
			
	}
	
	
	  
  }

  
  @BeforeTest
  public void beforeTest() {
	    
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms");

  }

  @AfterTest
  public void afterTest() {
  }

}
