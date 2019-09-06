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
	
	@Test(dataProvider = "Home_0002", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0002(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.PostImageOnly();
		service.stop();
	}
	
	@Test(dataProvider = "Home_0003", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0003(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homepage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homepage.PostMultipleImages();
		service.stop();
	}
	
	@Test(dataProvider = "Home_0004", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0004(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homepage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homepage.RemoveAttachedImage();
		service.stop();
	}
	
	@Test(dataProvider = "Home_0005", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0005(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homepage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homepage.RemoveMultipleAttachedImages();
		service.stop();
	}
	

	@Test(dataProvider = "Home_0006" , dataProviderClass=HomeTestDataStatus.class)
	public void Home_0006(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws IOException, InterruptedException
	{
		
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
	
	/**@throws InterruptedException 
	 * @throws IOException 
	 * @Test(dataProvider = "Home_0007", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0007(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String 	TagAPersonOrGroup, String TagAPersonOrGroup2, String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.PostStatusWithMultipleTagPersonOrGroup(WhatAreYouWorkingOn, TagAPersonOrGroup, TagAPersonOrGroup2, Hashtag);
		service.stop();
	}*/
	
	

	
	  @Test(dataProvider= "Home_0008", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0008(String CompanyEmail, String Password, String WhatAreYouWorkingOn, String 	TagAPersonOrGroup, String TagAPersonOrGroup2, String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.PostStatusWithTagPersonOrGroupAndHashtag(WhatAreYouWorkingOn, TagAPersonOrGroup, TagAPersonOrGroup2, Hashtag);
		service.stop();
	}
	

	@Test(dataProvider= "Home_0012", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0012(String CompanyEmail, String Password,String WhatsThisPollABout, String Option1, String Option2) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.PostPollWithValidData(WhatsThisPollABout, Option1, Option2);
		service.stop();
	}
	
	@Test(dataProvider= "Home_0013", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0013(String CompanyEmail, String Password, String WhatsThisPollABout, String Option1, String Option2, String Option3, String Option4) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.PostPollWithMoreThanTwoOption( WhatsThisPollABout,  Option1,  Option2,  Option3,  Option4);
		service.stop();
	}
	
	@Test(dataProvider = "Home_0014", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0014(String CompanyEmail, String Password, String CategoryName, String SelectColor) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_homePage.AddNewCategory(CategoryName,SelectColor );
		service.stop();
	}
	
	@Test
	public void Home_0017() throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData("marymary@gmail.com", "adminadmin123");
		_homePage.PostEventWithValidData();
		service.stop();
	}
	
	
	@Test(dataProvider = "Home_0020", dataProviderClass=HomeTestDataStatus.class)
	public void Home_0020(String CompanyEmail, String Password, String ThisAnnouncementIsAbout, String TypeYourAnnouncementDetails) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password );
		_homePage.PostAnnouncementWithValidData(ThisAnnouncementIsAbout, TypeYourAnnouncementDetails);
		service.stop();
	}
	
	@Test
	public void Home_0024() throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		HomePage _homePage = new HomePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData("marymary@gmail.com", "adminadmin123");
		_homePage.SearchColleagueOrGroup();
		service.stop();
	}
	

}
