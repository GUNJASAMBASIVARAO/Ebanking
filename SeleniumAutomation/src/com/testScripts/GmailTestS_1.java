package com.testScripts;


import org.testng.annotations.Test;

import com.components.GmailComp_1;
import com.utility.BaseClass;

public class GmailTestS_1 extends BaseClass {
	GmailComp_1 gmailcomponents=new GmailComp_1();
 
  
  @Test(description="Gmail Login")
  public void f() throws Exception {
	  readData.readTestDataFile("D:\\Testing\\Workspace\\SeleniumAutomation\\TestData\\GmailData.xlsx", "1");
	  gmailcomponents.launchApp();
	  gmailcomponents.Login();
  }
}
