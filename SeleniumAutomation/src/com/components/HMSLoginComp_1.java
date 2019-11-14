package com.components;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectRepository.HMSLoc_1;
import com.utility.BaseClass;

public class HMSLoginComp_1 extends BaseClass {
	HMSLoc_1 HMSLocators=new HMSLoc_1();
	
	public void LaunchAPP() throws Exception {
		
		try {
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("Launch App", "Application Should open URL", "Successfully opened the Url", "Pass", "Y");
			
		}catch (Exception e) {
			
			readData.addStepDetails("Launch App", "Application Should open URL", "Unable to opened the Url", "Fail", "N");
		}
	}
	public void Login() throws Exception {
		try {
			type(HMSLocators.username,readData.testDataValue.get("Username"));
			type(HMSLocators.password,readData.testDataValue.get("Password"));
			click(HMSLocators.submit);
			readData.addStepDetails("Login", "Application should Login", "Login success", "Pass", "Y");
			
		}catch(Exception e) {
			readData.addStepDetails("Login", "Application should Login", "Login Failed", "Fail", "N");
			
		}
	}
	
	
	public void NavigateToRegistration() throws Exception {
		try {
			click(HMSLocators.Registration);
			readData.addStepDetails("NavigateToRegistration", "Application Should NavigateToRegistration", "NavigateToRegistration success", "pass", "Y");
			
		}catch (Exception e){
			readData.addStepDetails("NavigateToRegistration", "Application Should NavigateToRegistration", "Unable to NavigateToRegistration ", "Fail", "N");
			
		}
		
		
		
	}
	
	public void Createpatient() throws Exception {
		try {
			select(HMSLocators.Patient_Category, readData.testDataValue.get("Patient Category"));
			select(HMSLocators.Relation, readData.testDataValue.get("Relation"));
			select(HMSLocators.Title, readData.testDataValue.get("Title"));
			type(HMSLocators.First_Name, readData.testDataValue.get("First Name"));
			select(HMSLocators.Patient_Identifier, readData.testDataValue.get("Patient Identifier"));
			type(HMSLocators.PAN_Nos, readData.testDataValue.get("PAN/Voter ID/AADAR Nos"));
			type(HMSLocators.Last_Name, readData.testDataValue.get("Last Name"));
			click(HMSLocators.DOB);
			click(HMSLocators.Date);
			select(HMSLocators.Nationality, readData.testDataValue.get("Nationality"));
			type(HMSLocators.Age, readData.testDataValue.get("Age"));
			select(HMSLocators.VIP, readData.testDataValue.get("VIP"));
			select(HMSLocators.Gender, readData.testDataValue.get("Gender"));
			select(HMSLocators.Education, readData.testDataValue.get("Education"));
			select(HMSLocators.Marital_Status, readData.testDataValue.get("Marital Status"));
			select(HMSLocators.Occupation, readData.testDataValue.get("Occupation"));
			select(HMSLocators.Religion, readData.testDataValue.get("Religion"));
			select(HMSLocators.Blood_Group, readData.testDataValue.get("Blood Group"));
			select(HMSLocators.Primary_Language, readData.testDataValue.get("Primary Language"));
			select(HMSLocators.Citizenship, readData.testDataValue.get("Citizenship"));
			select(HMSLocators.Senior_Citizen_Proof_Submited, readData.testDataValue.get("Senior Citizen Proof Submited"));
			type(HMSLocators.Address1, readData.testDataValue.get("Address1"));
			type(HMSLocators.Phone, readData.testDataValue.get("Phone"));
			type(HMSLocators.Pin, readData.testDataValue.get("Pin or Zip"));
			select(HMSLocators.Country, readData.testDataValue.get("Country"));
			
			type(HMSLocators.image, readData.testDataValue.get("Path"));
			Thread.sleep(2000);
			click(HMSLocators.submit);
			String str = getAlertMessageText();
			
			alertaction("ok");
			Thread.sleep(2000);
			System.out.println(str);
			
			readData.addStepDetails("Createpatient", "Application Should Createpatient", "Created patient success", "pass", "Y");
			
			
		}catch (Exception e) {
			readData.addStepDetails("Createpatient", "Application Should Createpatient", "Unable to Create patient success"+e.getMessage(), "Fail", "N");
			
			
		}
		
	}
	
	
	
	
  
	
}
