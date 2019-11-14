package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMSLogin {
	public WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
		//log in
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		//Registration
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Permanent Registration")).click();
		
	new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
	new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Father");
	new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Anusha");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Venkat");
		
	new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
	
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Swamy");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123456789");
		driver.findElement(By.name("LAST_NAME")).sendKeys("G");
		
		driver.findElement(By.name("DOB")).click();
		
		driver.findElement(By.className("tcalWeekend")).click();
		
	new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("25");
		
	new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("Yes");
	new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
	new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
	new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
	new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
	new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
	new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("O+");
	new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
	new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
	new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
	
		driver.findElement(By.name("ADDRESS1")).sendKeys("Ameerpet");
		driver.findElement(By.name("ADDRESS2")).sendKeys("Hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9856585523");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("venkatesh@gmail.com");
		driver.findElement(By.name("ZIP")).sendKeys("500073");
		driver.findElement(By.name("COUNTRY_CODE")).sendKeys("India");
		driver.findElement(By.name("image")).sendKeys("D:\\Testing\\AhVWHr.jpg");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		driver.close();

	}

}
