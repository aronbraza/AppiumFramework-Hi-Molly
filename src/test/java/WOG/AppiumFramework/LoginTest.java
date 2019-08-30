package WOG.AppiumFramework;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ExcelTestData.LoginTestData;
import HiMollyAppPageObjects.LanguagePage;
import HiMollyAppPageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTest extends base {
	
	@BeforeTest
	public  void killAllNodes() throws IOException, InterruptedException 
	{
		base base = new base();
		base.KillNode();
		
	}
	
	@Test(dataProvider = "Login_0001", dataProviderClass=LoginTestData.class)
	public void Login_0001(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		service.stop();
		
	}
	
	@Test(dataProvider = "Login_0002", dataProviderClass=LoginTestData.class)
	public void Login_0002(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithNoData(CompanyEmail, Password);
		service.stop();
		
	}
	
	@Test(dataProvider = "Login_0003", dataProviderClass=LoginTestData.class)
	public void Login_0003(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithCompanyEmailOnly(CompanyEmail, Password);
		service.stop();
		
	}
	
	
	@Test(dataProvider = "Login_0004", dataProviderClass=LoginTestData.class)
	public void Login_0004(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithPasswordOnly(CompanyEmail, Password);
		service.stop();
		
	}
	
	@Test(dataProvider = "Login_0005", dataProviderClass=LoginTestData.class)
	public void Login_0005(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidCompanyEmailInvalidPassword(CompanyEmail, Password);
		service.stop();
	}
	
	@Test(dataProvider = "Login_0006", dataProviderClass=LoginTestData.class)
	public void Login_0006(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithNonExistingAccount(CompanyEmail, Password);
		service.stop();
	}
	
	
	
	
	
	
	

}
