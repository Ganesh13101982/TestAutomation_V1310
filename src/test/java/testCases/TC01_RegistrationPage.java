package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC01_RegistrationPage extends BaseClass {
	

	
	@Test(groups ={"Regresstion","Master"})
	public void verify_Account_Registration()
	{
		HomePage hp = new HomePage(driver);
		hp.setClickPractice();
		hp.setClickLoginPage();
		
	
	
		String titleName = hp.getTitlePage();
		
		Assert.assertEquals(titleName, "Test login");
		
	
	// Login page
		
		RegistrationPage lp = new  RegistrationPage(driver);
		lp.setUserName(prop.getProperty("UserName"));
		lp.setUserPassword(prop.getProperty("Password"));
		lp.loginPage();
		
		
		boolean loginVerification = lp.loginMessage();
		Assert.assertEquals(loginVerification, true);
		
		
	}
}
