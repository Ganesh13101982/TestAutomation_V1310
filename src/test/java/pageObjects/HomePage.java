package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver)
	
	{
		
		super(driver);
		
	}

	
	@FindBy(xpath="//a[text()='Practice']")
	WebElement clickPractice;
	
	@FindBy(xpath="//a[text()='Test Login Page']")
	WebElement clickTestLoginPage;
	
	@FindBy(xpath="//h2[text()='Test login']")
	WebElement chkTitle;
	
	
	public void setClickPractice()
	{
		clickPractice.click();
		
	}
	
	public void setClickLoginPage()
	{
		
		clickTestLoginPage.click();
	}
	
	
	public String getTitlePage()
	{
	 try
	 {
		 return (chkTitle.getText());
		 
	 }catch(Exception e)
	 {
		return e.getMessage();
	 }
		 
		
	}
}
