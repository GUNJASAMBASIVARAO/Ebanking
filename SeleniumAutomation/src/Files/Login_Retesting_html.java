package Files;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

public class Login_Retesting_html {
	private WebDriver driver;
	String result=null;
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream(".\\TestData\\Sheet1.xlsx");
	  Workbook w=new XSSFWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  
	  File f=new File(".\\TestResults\\Login_Results.html");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);
	  
	  bw.write("<html><body>");
	  bw.write("<table cellspacing='2' cellpading='3'boarder='2'>");
	  bw.write("<tbody>");
	  bw.write("<tr>");
	  bw.write("<td><font size='4' color='red'>username</font></td>");
	  bw.write("<td><font size='4' color='green'>password</font></td>");
	  bw.write("<td><font size='4' color='blue'>Results</font></td>");
	  bw.write("</tr>");
	  
	  for (int i = 0; i < s.getLastRowNum(); i++) {
		  Row r= s.getRow(i);
		  Cell username= r.getCell(0);
		  Cell password= r.getCell(1);
		  System.out.println(username);
		  System.out.println(password);
		  bw.write("<tr>");
		  bw.write("<td><font size='4' color='black'>"+username+"</font><td>");
		  bw.write("<td><font size='4' color='black'>"+password+"</font></td>");
		  driver.findElement(By.name("username")).sendKeys(username.toString());
		  driver.findElement(By.name("password")).sendKeys(password.toString());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(2000);
		  try {
			  driver.findElement(By.linkText("Logout")).click();
			  Thread.sleep(2000);
			  System.out.println("Pass");
			  result="Pass";
		  } catch (Exception e){
			  System.out.println("Fail");
			  result="Fail";
			  
		  }
		  bw.write("<td><font size='4' color='black'>"+result+"</font><td>");
	      bw.write("</tr>");
		
	}
	    bw.write("</tbody>");
		bw.write("</table>");
		bw.write("</body>");
		bw.write("</html>");
		bw.close();

  
	  
	  
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
