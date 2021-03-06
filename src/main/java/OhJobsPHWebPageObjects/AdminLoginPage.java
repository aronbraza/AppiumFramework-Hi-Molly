package OhJobsPHWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AdminLoginPage {
	
	 public AdminLoginPage(WebDriver driver) 
	 {
		PageFactory.initElements(driver, this);
	 }
	
	//Login//
	@FindBy(id = "email")
	private WebElement emailAddress_Textbox;
	
	@FindBy(id = "password")
	private WebElement password_Textbox;
	
	@FindBy(id = "login")
	private WebElement login_Button;
	//Login//
	
	
	public void setEmailAddress(com.relevantcodes.extentreports.ExtentTest logger, String email)
	{
		emailAddress_Textbox.clear();
		emailAddress_Textbox.sendKeys(email);
		logger.log(LogStatus.INFO, "<b>"+email+"</b> has been entered on the Email Address field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		password_Textbox.clear();
		password_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}
	
	public void clickLogin(ExtentTest logger) 
	{
		login_Button.click();
		logger.log(LogStatus.INFO, "<b>Login button</b> has been clicked.");
	}

}
