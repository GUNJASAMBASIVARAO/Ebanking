package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelink_parameters {

	public WebDriver driver;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void openURL() {
		driver.get("http://google.co.in");
	}
	public void click(String str) {
		driver.findElement(By.xpath(str)).click();
		
	}
	public static void main(String[] args) {
		Googlelink_parameters g=new Googlelink_parameters();
		g.openBrowser();
		g.openURL();
		g.click("//*[@id='SIvCob']/a[1]");
		g.click("//*[@id=\"SIvCob\"]/a[1]");
		g.click("//*[@id=\"SIvCob\"]/a[3]");

	}
}
