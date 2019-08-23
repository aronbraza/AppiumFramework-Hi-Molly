package HiMollyAppPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	 public LoginPage(AndroidDriver<AndroidElement> driver ) 
	 {
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	 }
	 

	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_email")
	public WebElement CompanyEmail_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_password")
	public WebElement Password_Textbox;
	
	@AndroidFindBy (id = "com.wog.himolly:id/btn_submit")
	public WebElement Login_Button;
	
	public void LoginWithNoData()
	{

		Login_Button.click();
	}
	
	public void LoginWithCompanyEmailOnly(String CompanyEmail)
	{
		CompanyEmail_Textbox.sendKeys(CompanyEmail);
		Login_Button.click();
	}
	
	public void LoginWithPasswordOnly(String Password)
	{
		Password_Textbox.sendKeys(Password);
		Login_Button.click();
	}
	
	public void LoginWithValidCompanyEmailInvalidPassword(String ValidCompanyEmail, String InvalidPassword)
	
	{
		CompanyEmail_Textbox.sendKeys(ValidCompanyEmail);
		Password_Textbox.sendKeys(InvalidPassword);
		Login_Button.click();
	}
	
	
	
	public void LoginWithNonExistingAccount(String InvalidCompanyEmail, String InvalidPassword)
	{
		CompanyEmail_Textbox.sendKeys(InvalidCompanyEmail);
		Password_Textbox.sendKeys(InvalidPassword);
		Login_Button.click();
	}
	
	public void LoginWithValidData(String CompanyEmail, String Password)
	{
		CompanyEmail_Textbox.sendKeys(CompanyEmail);
		Password_Textbox.sendKeys(Password);
		Login_Button.click();
	}
	
}
