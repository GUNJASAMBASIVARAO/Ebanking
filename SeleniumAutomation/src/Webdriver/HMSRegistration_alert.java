package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMSRegistration_alert {
public WebDriver driver;
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	public void openURL(){
		driver.get("http://selenium4testing.com/hms");
	}
	public void login(){
	    driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("submit")).click();
	}
	public void registration(){
		driver.findElement(By.linkText("Registration")).click();
	}
	public void fillregistrationform() throws Exception{
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Robo");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Neelam");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Avinash");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("12345");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Lal");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.className("tcalSelected")).click();
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("27");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Female");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("English");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("image")).sendKeys("D:\\Testing\\AhVWHr.jpg");
		driver.findElement(By.name("ADDRESS1")).sendKeys("5-5-5/8 Abids,hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9885304480");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("neelam0401@gmail.com");
		driver.findElement(By.name("ZIP")).sendKeys("500001");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000); //3 secs	
	}
	public void alert(){
		driver.switchTo().alert().accept(); //to click OK
		//	driver.switchTo().alert().dismiss(); //To click Cancel
	}
	public void adt(){
		driver.findElement(By.linkText("ADT")).click();
	}
	public void fillAdmissionform() throws Exception{
		driver.findElement(By.name("PNT_ID")).sendKeys("222222");
		 driver.findElement(By.name("MR_NO")).sendKeys("ER3773533105");
		 driver.findElement(By.name("BOOKING_ID")).sendKeys("latha");
		 driver.findElement(By.name( "REQ_ID")).sendKeys("023456");
		 new Select(driver.findElement(By.name("ADM_TPYE"))).selectByVisibleText("Accident");
		 driver.findElement(By.name("EXP_DATE")).click();
		 driver.findElement(By.className("tcalSelected")).click();
		 new Select(driver.findElement(By.name("PNT_CLASS"))).selectByVisibleText("ICU");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/table[1]/tbody/tr[5]/td[4]/input" )).sendKeys("9");
		 new Select(driver.findElement(By.name("EXP_STAY_FORMAT"))).selectByVisibleText("Days");
		 new Select(driver.findElement(By.name("INSU_PLAN"))).selectByVisibleText("Yes");
		 Thread.sleep(3000);
		 driver.findElement(By.name("EXP_DISCHARGE_DATE")).click();
		 driver.findElement(By.xpath("//*[@id=\"tcalGrid\"]/tbody/tr[3]/td[6]")).click();
		 new Select(driver.findElement(By.name("ADM_SOURSE"))).selectByVisibleText("General");
		 Thread.sleep(4000);
		 new Select(driver.findElement(By.name("HOSPITAL_SERVICES"))).selectByVisibleText("Consultation");
		 new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/table[1]/tbody/tr[8]/td[4]/select"))).selectByVisibleText("Sai");
		 new Select(driver.findElement(By.name("HOSPITAL_SUB_SERVICES"))).selectByVisibleText("Scanning");
		 new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/table[1]/tbody/tr[9]/td[4]/select"))).selectByVisibleText("Cordialagist");
		 driver.findElement(By.name("PRMRY_CONSULT")).sendKeys("Sindhura");
		 new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/table[1]/tbody/tr[11]/td[4]/select"))).selectByVisibleText("Cordialagist");
		 new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
		 new Select(driver.findElement(By.name("BED_CLASS"))).selectByVisibleText("General");
		 new Select(driver.findElement(By.name("ADM_BED_CLASS"))).selectByVisibleText("General");
		 new Select(driver.findElement(By.name("BED_NUM"))).selectByVisibleText("BED-2");
		 new Select(driver.findElement(By.name("NURSING_STATION"))).selectByVisibleText("Rani");
		 new Select(driver.findElement(By.name("WARD_NUM"))).selectByVisibleText("9");
		 new Select(driver.findElement(By.name("AMBULATORY_STATUS"))).selectByVisibleText("Stretcher");
		 new Select(driver.findElement(By.name("MODE_ARRIVAL"))).selectByVisibleText("Walking");
		 new Select(driver.findElement(By.name("CAPTURED_BY"))).selectByVisibleText("Doctor");
		 driver.findElement(By.name("CAPTURED_DATE")).click();
		 driver.findElement(By.className("tcalWeekend")).click();
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(5000);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HMSRegistration_alert h=new HMSRegistration_alert();
		h.openBrowser();
		h.openURL();
		h.login();
		h.registration();
		h.fillregistrationform();
		h.alert();
	}

}





	