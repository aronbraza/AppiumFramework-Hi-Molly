package WOG.AppiumFramework;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ExcelTestData.ProfileTestData;
import HiMollyAppPageObjects.LanguagePage;
import HiMollyAppPageObjects.LoginPage;
import HiMollyAppPageObjects.ProfilePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ProfileTest extends base {
	
	@BeforeTest
	public void killnode() throws IOException, InterruptedException
	{
		base base = new base();
		base.KillNode();
	}
	
	
	@Test(dataProvider="Profile_0029", dataProviderClass=ProfileTestData.class)
	public void Profile_0029(String CompanyEmail, String Password, String FirstName, String MiddleName, String LastName, String Suffix, String Birthdate, String Expertise, String Interests ) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.EditPersonalInformationWithValidData(FirstName, MiddleName, LastName, Suffix, Birthdate, Expertise, Interests);
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0030", dataProviderClass=ProfileTestData.class)
	public void Profile_0030(String CompanyEmail, String Password, String CompleteAddress, String PhoneNumber, String MobileNumber, String EmailAddress, String ContactNamePerson, String Relationship, String ContactNumber) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.EditContactInformationWithValidData(CompleteAddress, PhoneNumber, MobileNumber, EmailAddress, ContactNamePerson, Relationship, ContactNumber);
		service.stop();
	}
	
	@Test(dataProvider ="Profile_0031", dataProviderClass=ProfileTestData.class)
	public void Profile_0031(String CompanyEmail, String Password, String School, String Degree, String FromYear, String ToYear) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.AddEducationalAttainmentWithValidData(School, Degree, FromYear, ToYear);
		service.stop();
	}
	
	@Test
	public void Profile_0032() throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData("marymary@gmail.com", "adminadmin123");
		_profilePage.EditEducationalAttainmentWithValidData();
		service.stop();
	}
	
	

}
