package POM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HMSLogin extends BaseClass  {
  
	HMSLocators locators=new HMSLocators();
	String prNo;
	
@Test
public void f() {
	OpenBrowser();
	OpenURL("http://selenium4testing.com/hms/");
	type(locators.username, "admin");
	type(locators.password, "admin");
	CLick(locators.login);
	CLick(locators.Registration);

	select(By.name("PATIENT_CAT"), "Insurance");
	select(By.name("RELATION"), "Father");
	select(By.name("TITLE"), "Mr.");

    type(locators.MOTHER_NAME, "Anusha");
	type(locators.PNT_NAME, "Venkat");
	
	select(By.name("PAT_IDENTITY"), "Voter ID");
	type(locators.MIDDLE_NAME, "Swamy");
	type(locators.PAT_IDENTITY_PROOF, "123456789");
	type(locators.LAST_NAME, "G");
	
	CLick(locators.DOB);
	CLick(By.className("tcalWeekend"));
	
	select(By.name("NATIONALITY"), "Indian");
	type(locators.AGE, "25");
	select(By.name("IS_MLC"), "Yes");
	select(By.name("SEX"), "Male");
	select(By.name("EDUCATION"), "B.Tech");
	select(By.name("MTRL_STATUS"), "Single");
	select(By.name("OCCUPATION"), "Employee");
	select(By.name("RELIGION"), "Hindu");
	select(By.name("BLOOD_GRP_CODE"), "O+");
	select(By.name("PLANGUAGE"), "Telugu");
	select(By.name("CITIZENSHIP"), "Indian");
	select(By.name("SC_PROOF"), "Yes");
	type(locators.ADDRESS1, "Ameerpet");
	type(locators.ADDRESS2, "Hyderabad");
	type(locators.MOBILE_NO, "9856585523");
	type(locators.EMAIL_ID, "venkatesh@gmail.com");
	type(locators.ZIP, "500073");
	select(By.name("COUNTRY_CODE"), "India");
	type(locators.image, "D:\\Testing\\AhVWHr.jpg");
	CLick(locators.submit);
	
		
}




@Test
public void g() throws Exception {
	
	
	String text=driver.switchTo().alert().getText();
	  System.out.println(text);
	  driver.switchTo().alert().accept();
	 
	  Thread.sleep(3000); 
	  
	  String[] s=text.split(" ");
	  System.out.println(s.length);
	  for (int i = 0; i < s.length; i++) {
		  if(s[i].contains("PR"))
		  {
			  prNo=s[i];
			  System.out.println(prNo);
		  }

}




}
@Test
public void h() {
	
	CLick(By.xpath("//*[@id=\"navigation\"]/li[1]/ul/li[3]/a"));
	CLick(By.xpath("//input[@name=\"search\"]"));
	type(locators.search, "PR5937986746");
	CLick(By.xpath("//input[@name=\"submit\"]"));
	 
	String av=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/form/div/table[3]/tbody/tr/td[3]")).getText();
	  System.out.println(av);
	  if(av.equalsIgnoreCase("Venkat")) {
		  System.out.println("Record matched");
	  }else {
		  System.out.println("Record not matched");
	  }
}



}

