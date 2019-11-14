package com.components;
import org.testng.annotations.Test;
import com.objectRepository.GmailLoc_1;
import com.utility.BaseClass;

public class GmailComp_1 extends BaseClass {
	GmailLoc_1 gmailLocators=new GmailLoc_1();
	public void launchApp() throws Exception {
		try {
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("launch App", "Application Should OpenURl", "successfully opened URL", "Pass", "Y");
			
		}catch (Exception e) {
			readData.addStepDetails("launch App", "Application Should OpenURl", "Unable to open  URL", "Fail", "N");
		
	}
	}	
		public void Login() throws Exception {
			try {
				type(gmailLocators.username,readData.testDataValue.get("Username"));
				click(gmailLocators.next);
				type(gmailLocators.password,readData.testDataValue.get("Password"));
				click(gmailLocators.next);
				readData.addStepDetails("Login", "Application Should Login", "Login Success", "Pass", "Y");
			}catch (Exception e) {
				readData.addStepDetails("Login", "Application Should Login", "Login Failed", "Fail", "N");
		}
	

}
}
	
	

