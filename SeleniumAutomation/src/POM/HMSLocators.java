package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HMSLocators  {
      
	
	
	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//input[@name=\'submit\']");
	By Registration=By.xpath("//*[@id=\"navigation\"]/li[1]/a");
	By MOTHER_NAME=By.xpath("//input[@name=\"MOTHER_NAME\"]");
	By PNT_NAME=By.xpath("//input[@name=\"PNT_NAME\"]");
	By MIDDLE_NAME=By.xpath("//input[@name=\"MIDDLE_NAME\"]");
	By PAT_IDENTITY_PROOF=By.xpath("//input[@name=\"PAT_IDENTITY_PROOF\"]");
	By LAST_NAME=By.xpath("//input[@name=\"LAST_NAME\"]");
	
	By DOB=By.name("DOB");
	
	By AGE=By.xpath("//input[@name=\"AGE\"]");
	By ADDRESS1=By.xpath("//input[@name=\"ADDRESS1\"]");
	By ADDRESS2=By.xpath("//input[@name=\"ADDRESS2\"]");
	By MOBILE_NO=By.xpath("//input[@name=\"MOBILE_NO\"]");
	By EMAIL_ID=By.xpath("//input[@name=\"EMAIL_ID\"]");
	By ZIP=By.xpath("//input[@name=\"ZIP\"]");
	
	By image=By.xpath("//input[@value=\"Upload Image\"]");
	By submit=By.xpath("//input[@name=\'submit\']");
	
	
	
	
	By search=By.name("search");
}










