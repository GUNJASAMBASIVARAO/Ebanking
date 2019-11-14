package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.manage().window().maximize();
		driver.findElement(By.id("log-username")).sendKeys("selenium4u");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-password")).sendKeys("selenium@123");
		driver.findElement(By.id("login-signin")).click();

	}

}
