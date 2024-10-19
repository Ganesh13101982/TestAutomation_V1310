package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	public RegistrationPage(WebDriver driver)
	{
		
		super(driver);
		
	}

	
	@FindBy(xpath="//input[@name='username']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement btnLogout;
	
	@FindBy(xpath="//h1[text()='Logged In Successfully']")
	WebElement successMsg;
	
	
	
	public void setUserName(String userName)
	{
		txtUserName.sendKeys(userName);
		
	}
	
	public void setUserPassword(String userPWD)
	
	{
		txtPassword.sendKeys(userPWD);
		
	}
	
	public void loginPage()
	{
		btnSubmit.click();
		
	}
	
	public void logOut()
	{
		
		btnLogout.click();
		
		
	}
	
	public String Displayed()
	{
		try {
			
		return (btnLogout.getText());
		
		}catch(Exception e)
		{
			return e.getMessage();
		}
		
	}
	
	public boolean loginMessage()
	{
		try
		{
			 successMsg.isDisplayed();
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		return true;
		
		
	}
	
}
