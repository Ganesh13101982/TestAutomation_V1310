package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.RegistrationPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC02_TestLoginPage extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class) // getting dataprovider from different class
	public void LoginPage_verification(String userName, String PWD, String exp)
	{
	
		
		logger.info("************ Starting of the Test ***************");
		
		try
		{
	
	RegistrationPage rg = new RegistrationPage(driver);
	
	rg.setUserName(userName);
	rg.setUserPassword(PWD);
	rg.loginPage();
	
	
	/*
	
	String loginmsg = rg.loginMessage();
	
	Assert.assertEquals(loginmsg,"Logged In Successfully");

	
	if(rg.Displayed()=="Log out")
	{
		System.out.println("Login Successfully..");
		
	}else
	{
		System.out.println("Login Unsuccessfull");
		
	}
	
	
	rg.logOut();  */
	
	
	/* Data is valid = login success - test pass - logout
	                 = login failed - test fail
	                 
	   Data is invalid = login success - test fail - logout
	                   = login failed  - test pass
	                                 
	*/
	
	
	boolean msg = rg.loginMessage();
	       
	
	if (exp.equalsIgnoreCase("Valid"))
	{
		if (msg == true)
		{
			rg.logOut();
			Assert.assertTrue(true);			
		}
		else
		{
			Assert.assertTrue(false);			
		}		
	}
	
	if (exp.equalsIgnoreCase("Invalid"))	
	{
		if(msg ==true)		
		{
			rg.logOut();
			Assert.assertTrue(false);			
		}
		else
		{			
			Assert.assertTrue(true);
		}
	}
		}catch(Exception e)		
		{
			System.out.println(e.getMessage());
		}
				
	
	
	logger.info("*********** End of the Testing **************");

}

		
		
		
	
	
}
