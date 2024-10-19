package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC03_LoginPage extends BaseClass{
	
	@Test(groups= {"Sanity","Master"})
	public void Login_Page_Verification()
	{
		
		RegistrationPage rg = new RegistrationPage(driver);
		rg.setUserName(prop.getProperty("UserName"));
		rg.setUserPassword(prop.getProperty("Password"));
		rg.loginPage();
		
		// Verification
		
	String	msg  = rg.Displayed();
	Assert.assertEquals(msg, "Log out");
	
	boolean successmsg = rg.loginMessage();
	Assert.assertEquals(successmsg, true);
		
		rg.logOut();
		
	}
	
	

}
