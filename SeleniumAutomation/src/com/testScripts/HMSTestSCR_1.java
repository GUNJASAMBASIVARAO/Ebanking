package com.testScripts;

import org.testng.annotations.Test;

import com.components.HMSLoginComp_1;
import com.utility.BaseClass;

public class HMSTestSCR_1 extends BaseClass{
	
	HMSLoginComp_1 HMSComponent=new HMSLoginComp_1();

@Test(description="HMS Login")
public void f() throws Exception {
	
	readData.readTestDataFile("D:\\Testing\\Workspace\\SeleniumAutomation\\TestData\\HMSTestData.xlsx", "2");
	HMSComponent.LaunchAPP();
	HMSComponent.Login();
	HMSComponent.NavigateToRegistration();
	HMSComponent.Createpatient();
	
	
}
	
 
	
	
}
