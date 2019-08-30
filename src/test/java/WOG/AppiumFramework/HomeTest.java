package WOG.AppiumFramework;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import ExcelTestData.HomeTestDataStatus;
import HiMollyAppPageObjects.HomePage;
import HiMollyAppPageObjects.LanguagePage;
import HiMollyAppPageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomeTest extends base {
	
	@BeforeTest
	public  void killAllNodes() throws IOException, InterruptedException 
	{
		base base = new base();
		base.KillNode();
		
	}
	
	@Test(dataProvider = "Home_0001" , dataProviderClass=HomeTestDataStatus.class)
	public void Home_0001(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag ) throws IOException, InterruptedException
	{
		
		//System.out.println(CompanyEmail +" "+Password+" "+WhatAreYouWorkingOn);
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.PostStatusWithValidData(WhatAreYouWorkingOn,TagAPersonOrGroup, Hashtag);
		service.stop();

		
	}
	
	@Test(dataProvider = "Home_0006" , dataProviderClass=HomeTestDataStatus.class)
	public void Home_0006(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws IOException, InterruptedException
	{
		
		//System.out.println(CompanyEmail +" "+Password+" "+WhatAreYouWorkingOn);
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.PostStatusWithValidDataWithTagPersonOrGroup(WhatAreYouWorkingOn, TagAPersonOrGroup, Hashtag);
		service.stop();

		
	}
	

	
	

}
