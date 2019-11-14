package com.Ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic 
{
	public WebDriver driver;

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		
		

	}

}
