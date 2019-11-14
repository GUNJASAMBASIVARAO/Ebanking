package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginmethod {
		
		private WebDriver driver;
		
		
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
		}
		public void openURL() {
			driver.get("http://gmail.com");
		}
		public void login() throws InterruptedException  {
			driver.findElement(By.id("identifierId")).sendKeys("sambagunja442");
			driver.findElement(By.id("identifierNext")).click();
			driver.findElement(By.name("password")).sendKeys("Samba@123");
			Thread.sleep(3000); //3 secs
			driver.findElement(By.id("passwordNext")).click();
			
		}
		public void logout() {
			driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div/div/a/span")).click();
			driver.findElement(By.linkText("Sign out")).click();
		}
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			GmailLoginmethod g=new GmailLoginmethod();
			g.openBrowser();
			g.openURL();
			g.login();
			g.logout();
	  

	}

}
