package com.objectRepository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HMSLoc_1 {
	
 
	public By username = By.xpath("//input[@name=\"username\"]");
	public By password = By.xpath("//input[@name=\"password\"]");
	public By submit = By.xpath("//input[@name=\"submit\"]");
	
	public By Registration = By.linkText("Registration");
	public By Permanent_Registration = By.linkText("Permanent Registration");
	
	public By Patient_Category = By.xpath("//select[@name=\"PATIENT_CAT\"]");
	public By Relation = By.xpath("//select[@name=\"RELATION\"]");
	public By Title = By.xpath("//select[@name=\"TITLE\"]");
	public By First_Name = By.xpath("//input[@name=\"PNT_NAME\"]");
	public By Patient_Identifier = By.xpath("//select[@name=\"PAT_IDENTITY\"]");
	public By PAN_Nos = By.xpath("//input[@name=\"PAT_IDENTITY_PROOF\"]");
	public By Last_Name = By.xpath("//input[@name=\"LAST_NAME\"]");
	
	
	public By DOB = By.xpath("//input[@name=\"DOB\"]");
    public By Date = By.xpath("//*[@id=\"tcalGrid\"]/tbody/tr[4]/td[6]");
	
	public By Nationality = By.xpath("//select[@name=\"NATIONALITY\"]");
	public By Age = By.xpath("//input[@name=\"AGE\"]");
	public By VIP = By.xpath("//select[@name=\"IS_MLC\"]");
	public By Gender = By.xpath("//select[@name=\"SEX\"]");
	public By Education = By.xpath("//select[@name=\"EDUCATION\"]");
	public By Marital_Status = By.xpath("//select[@name=\"MTRL_STATUS\"]");
	public By Occupation = By.xpath("//select[@name=\"OCCUPATION\"]");
	public By Religion = By.xpath("//select[@name=\"RELIGION\"]");
	public By Blood_Group = By.xpath("//select[@name=\"BLOOD_GRP_CODE\"]");
	public By Primary_Language = By.xpath("//select[@name=\"PLANGUAGE\"]");
	public By Citizenship = By.xpath("//select[@name=\"CITIZENSHIP\"]");
	public By Senior_Citizen_Proof_Submited = By.xpath("//select[@name=\"SC_PROOF\"]");
	
	
	public By Address1 = By.xpath("//input[@name=\"ADDRESS1\"]");
	public By Phone = By.xpath("//input[@name=\"MOBILE_NO\"]");
	public By Pin = By.xpath("//input[@name=\"ZIP\"]");
	public By Country = By.xpath("//select[@name=\"COUNTRY_CODE\"]");
	public By image = By.xpath("//input[@name=\"image\"]");
	public By Submit = By.xpath("//input[@name=\"submit\"]");
	
	
	
	
	

	
}
