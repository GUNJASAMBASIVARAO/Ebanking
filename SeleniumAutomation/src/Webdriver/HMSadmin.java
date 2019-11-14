package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.SelectChannelEndPoint;

public class HMSadmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
		//log in
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		//ADT
		driver.findElement(By.linkText("ADT")).click();
		
		driver.findElement(By.name("PNT_ID")).sendKeys("123456");
		driver.findElement(By.name("MR_NO")).sendKeys("PR4634984269");
		driver.findElement(By.name("BOOKING_ID")).sendKeys("Saikiran");
		driver.findElement(By.name("REQ_ID")).sendKeys("584269");
		
	new Select(driver.findElement(By.name("ADM_TPYE"))).selectByVisibleText("Accident");
		driver.findElement(By.name("EXP_DATE")).click();
		driver.findElement(By.className("tcalWeekend")).click();
		
	new Select(driver.findElement(By.name("PNT_CLASS"))).selectByVisibleText("General");
	
		driver.findElement(By.name("EXP_STAY_DATE")).sendKeys("10");
	new Select(driver.findElement(By.name("EXP_STAY_FORMAT"))).selectByVisibleText("Days");
	new Select(driver.findElement(By.name("INSU_PLAN"))).selectByVisibleText("Yes");
		driver.findElement(By.name("EXP_DISCHARGE_DATE")).click();
		driver.findElement(By.className("tcalWeekend")).click();
		
	new Select(driver.findElement(By.name("ADM_SOURSE"))).selectByVisibleText("General");
	new Select(driver.findElement(By.name("HOSPITAL_SERVICES"))).selectByVisibleText("Surgery");
	new Select(driver.findElement(By.name("DOC_NAME"))).selectByVisibleText("Sai");
	new Select(driver.findElement(By.name("HOSPITAL_SUB_SERVICES"))).selectByVisibleText("Consultation");
	new Select(driver.findElement(By.name("DOC_SPL"))).selectByVisibleText("Cordialagist");
	new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/table[1]/tbody/tr[9]/td[4]/select"))).selectByVisibleText("Cordialagist");
		
		driver.findElement(By.name("PRMRY_CONSULT")).sendKeys("Sindura");
		
		
	new Select(driver.findElement(By.name("ADD_DOC_SPL"))).selectByVisibleText("Cordialagist");
	
		driver.findElement(By.name("NOTES")).sendKeys("Super Special Hospital");
		
	new Select(driver.findElement(By.name("ADD_DOC_NAME"))).selectByVisibleText("Sai");
	new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
	
		driver.findElement(By.name("EPISODE_NO")).sendKeys("123456");
		driver.findElement(By.name("ENCOUNTER_NO")).sendKeys("123456");
		driver.findElement(By.name("EPISODE_DEC")).sendKeys("Completed");
		
	new Select(driver.findElement(By.name("BED_CLASS"))).selectByVisibleText("1ST");
	new Select(driver.findElement(By.name("ADM_BED_CLASS"))).selectByVisibleText("1ST");
	new Select(driver.findElement(By.name("BED_NUM"))).selectByVisibleText("BED-2");
	new Select(driver.findElement(By.name("NURSING_STATION"))).selectByVisibleText("Rani");
	new Select(driver.findElement(By.name("WARD_NUM"))).selectByVisibleText("9");
	new Select(driver.findElement(By.name("AMBULATORY_STATUS"))).selectByVisibleText("Ambulance");
	new Select(driver.findElement(By.name("MODE_ARRIVAL"))).selectByVisibleText("Ambulance");
	
		driver.findElement(By.name("PNT_VALUBLES")).sendKeys("Purse and money");
		
	new Select(driver.findElement(By.name("CAPTURED_BY"))).selectByVisibleText("Admin");
	
		driver.findElement(By.name("CAPTURED_DATE")).click();
		driver.findElement(By.className("tcalWeekend")).click();
		driver.findElement(By.name("submit")).click();
		
		

	}

}
