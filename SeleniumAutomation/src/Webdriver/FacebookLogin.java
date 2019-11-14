package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("u_0_8")).click();
		driver.findElement(By.id("email")).sendKeys("sambagunja442@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Samba@123");
		driver.findElement(By.id("u_0_9")).click();
		driver.quit();

	}

}
