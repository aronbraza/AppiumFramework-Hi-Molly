package WOG.AppiumFramework;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
	
	@Test
	public void Login_0001() throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithNoData();
		service.stop();
		
	}
	
	@Test(dataProvider = "LoginWithCompanyEmailOnly", dataProviderClass=TestData.class)
	public void Login_0002(String CompanyEmail) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithCompanyEmailOnly(CompanyEmail);
		service.stop();
		
	}
	
	
	@Test(dataProvider = "LoginWithPasswordOnly", dataProviderClass=TestData.class)
	public void Login_0003(String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithPasswordOnly(Password);
		service.stop();
		
	}
	
	@Test(dataProvider = "LoginValidCompanyEmailInvalidPassword", dataProviderClass=TestData.class)
	public void Login_0004(String ValidCompanyEmail, String InvalidPassword) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidCompanyEmailInvalidPassword(ValidCompanyEmail, InvalidPassword);
		service.stop();
	}
	
	@Test(dataProvider = "LoginInvalidData", dataProviderClass=TestData.class)
	public void Login_0005(String InvalidCompanyEmail, String InvalidPassword) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithNonExistingAccount(InvalidCompanyEmail, InvalidPassword);
		service.stop();
	}
	
	
	@Test(dataProvider = "LoginValidData", dataProviderClass=TestData.class)
	public void Login_0006(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		service.stop();
		
	}
	
	

}
