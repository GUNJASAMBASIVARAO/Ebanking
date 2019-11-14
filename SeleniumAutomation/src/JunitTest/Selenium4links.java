package JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Selenium4links {
	public WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown()  {
		driver.quit();
	}

	@Test
	void test1() {
		driver.get("http://selenium4testing.com");
		driver.findElement(By.xpath("//*[@id=\'closediv\']")).click();
	}
	@Test
	void test2() throws Exception {
		test1();
		driver.findElement(By.xpath("//a[contains(text(),'Manual FAQs')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Selenium FAQs')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Core Java FAQs')]")).click();
	}

}
