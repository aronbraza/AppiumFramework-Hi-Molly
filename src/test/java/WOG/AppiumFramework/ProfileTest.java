package WOG.AppiumFramework;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
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
	
	@Test(dataProvider ="Profile_0001", dataProviderClass=ProfileTestData.class)
	public void Profile_0001(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.ChangeProfilePicture();
		service.stop();
	}
	
	@Test(dataProvider="Profile_0002", dataProviderClass=ProfileTestData.class)
	public void Profile_0002(String CompanyEmail, String Password,String WhatAreYouWorkingOn, String TagAPersonOrGroup,String TagAPersonOrGroup2 ,String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.PostStatusWithValidData(WhatAreYouWorkingOn, TagAPersonOrGroup, Hashtag);
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0003", dataProviderClass=ProfileTestData.class)
	public void Profile_0003(String CompanyEmail, String Password,String WhatAreYouWorkingOn, String TagAPersonOrGroup,String TagAPersonOrGroup2 ,String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.PostStatusWithValidData(WhatAreYouWorkingOn, TagAPersonOrGroup, Hashtag);
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0004", dataProviderClass=ProfileTestData.class)
	public void Profile_0004(String CompanyEmail, String Password,String WhatAreYouWorkingOn, String TagAPersonOrGroup,String TagAPersonOrGroup2 ,String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.PostMultipleImages();
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0005", dataProviderClass=ProfileTestData.class)
	public void Profile_0005(String CompanyEmail, String Password,String WhatAreYouWorkingOn, String TagAPersonOrGroup,String TagAPersonOrGroup2 ,String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.RemoveAttachedImage();
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0006", dataProviderClass=ProfileTestData.class)
	public void Profile_0006(String CompanyEmail, String Password,String WhatAreYouWorkingOn, String TagAPersonOrGroup,String TagAPersonOrGroup2 ,String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.RemoveMultipleAttachedImages();
		service.stop();
		
	}
	
	
	@Test(dataProvider="Profile_0007", dataProviderClass=ProfileTestData.class)
	public void Profile_0007(String CompanyEmail, String Password,String WhatAreYouWorkingOn, String TagAPersonOrGroup,String TagAPersonOrGroup2 ,String Hashtag) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.PostStatusWithValidDataWithTagPersonOrGroup(WhatAreYouWorkingOn, TagAPersonOrGroup, TagAPersonOrGroup2, Hashtag);
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0013", dataProviderClass=ProfileTestData.class)
	public void Profile_0013(String CompanyEmail, String Password, String WhatsThisPollABout, String Option1, String Option2, String Option3, String Option4) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.PostPollWithValidData(WhatsThisPollABout, Option1, Option2);
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0014", dataProviderClass=ProfileTestData.class)
	public void Profile_0014(String CompanyEmail, String Password, String WhatsThisPollABout, String Option1, String Option2, String Option3, String Option4) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.PostPollWithMoreThanTwoOption(WhatsThisPollABout, Option1, Option2, Option3, Option4);
		service.stop();
		
	}
	
	
	
	@Test(dataProvider="Profile_0030", dataProviderClass=ProfileTestData.class)
	public void Profile_0030(String CompanyEmail, String Password, String FirstName, String MiddleName, String LastName, String Suffix, String Birthdate, String Expertise, String Interests ) throws IOException, InterruptedException
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
	
	@Test(dataProvider="Profile_0031", dataProviderClass=ProfileTestData.class)
	public void Profile_0031(String CompanyEmail, String Password, String CompleteAddress, String PhoneNumber, String MobileNumber, String EmailAddress, String ContactNamePerson, String Relationship, String ContactNumber) throws IOException, InterruptedException
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
	
	@Test(dataProvider ="Profile_0032", dataProviderClass=ProfileTestData.class)
	public void Profile_0032(String CompanyEmail, String Password, String School, String Degree) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.AddEducationalAttainmentWithValidData(School, Degree);
		service.stop();
	}
	
	@Test(dataProvider ="Profile_0033", dataProviderClass=ProfileTestData.class)
	public void Profile_0033(String CompanyEmail, String Password ,String School, String Degree) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.EditEducationalAttainmentWithValidData(School, Degree);
		service.stop();
	}
	
	@Test(dataProvider="Profile_0034", dataProviderClass=ProfileTestData.class)
	public void Profile_0034(String CompanyEmail, String Password, String School, String Degree) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.DeleteEducationalBackground(School,  Degree);
		service.stop();
	}
	
	@Test(dataProvider="Profile_0035", dataProviderClass=ProfileTestData.class)
	public void Profile_0035(String CompanyEmail, String Password, String Company, String Department, String JobTitle, String WorkAccomplishments, String CertificatesReceived, String ProfessionalSkills) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password );
		_profilePage.AddWorkExperience(Company, Department, JobTitle, WorkAccomplishments, CertificatesReceived, ProfessionalSkills);
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0036", dataProviderClass=ProfileTestData.class)
	public void Profile_0036(String CompanyEmail, String Password, String Company, String Department, String JobTitle, String WorkAccomplishments, String CertificatesReceived, String ProfessionalSkills) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.EditProfessionalInformationWithValidData(Company, Department, JobTitle, WorkAccomplishments, CertificatesReceived, ProfessionalSkills);
		service.stop();
		
	}
	
	@Test(dataProvider="Profile_0037", dataProviderClass=ProfileTestData.class)
	public void Profile_0037(String CompanyEmail, String Password, String Company, String Department, String JobTitle, String WorkAccomplishments, String CertificatesReceived, String ProfessionalSkills) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.DeleteWorkProfessionalInformation(Company, Department, JobTitle, WorkAccomplishments, CertificatesReceived, ProfessionalSkills);
		service.stop();
	}
	
	@Test(dataProvider = "Profile_0038", dataProviderClass=ProfileTestData.class)
	public void Profile_0038(String CompanyEmail, String Password) throws InterruptedException, IOException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.FilterFilesByDocuments();
		service.stop();
	}
	
	@Test(dataProvider="Profile_0039", dataProviderClass=ProfileTestData.class)
	public void Profile_0039(String CompanyEmail, String Password) throws InterruptedException, IOException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.FilterFilesByImages();
		service.stop();
	}
	
	@Test(dataProvider="Profile_0040", dataProviderClass=ProfileTestData.class)
	public void Profile_0040(String CompanyEmail, String Password) throws InterruptedException, IOException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.FilterFilesByVideos();
		service.stop();
	}
	
	@Test(dataProvider="Profile_0041", dataProviderClass=ProfileTestData.class)
	public void Profile_0041(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.FilterAllFiles();
		service.stop();
	}
	
	
	@Test(dataProvider ="Profile_0042", dataProviderClass=ProfileTestData.class)
	public void Profile_0042(String CompanyEmail, String Password, String SearchFile) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.SearchFile(SearchFile);
		service.stop();
	}
	
	@Test(dataProvider ="Profile_0043", dataProviderClass=ProfileTestData.class)
	public void Profile_0043(String CompanyEmail, String Password, String File_Name) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement>driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.RenameFile(File_Name);
		service.stop();
	}
	
	@Test(dataProvider= "Profile_0044", dataProviderClass=ProfileTestData.class)
	public void Profile_0044(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.DownloadFile();
		service.stop();
		
		
	}
	
	@Test(dataProvider= "Profile_0045", dataProviderClass=ProfileTestData.class)
	public void Profile_0045(String CompanyEmail, String Password, String ColleagueNameOrGroupName) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.ShareFileViaLink(ColleagueNameOrGroupName);
		service.stop();
		
		
	}
	
	
	@Test(dataProvider= "Profile_0046", dataProviderClass=ProfileTestData.class)
	public void Profile_0046(String CompanyEmail, String Password, String ColleagueName, String Note) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.ShareFileViaEmail(ColleagueName, Note);
		service.stop();
		
		
	}
	
	@Test(dataProvider= "Profile_0047", dataProviderClass=ProfileTestData.class)
	public void Profile_0047(String CompanyEmail, String Password) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData(CompanyEmail, Password);
		_profilePage.DeleteFile();
		service.stop();
		
	}
	
	@Test
	public void Profile_0048() throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("HiMollyApp");
		LanguagePage _languagePage = new LanguagePage(driver);
		LoginPage _loginPage = new LoginPage(driver);
		ProfilePage _profilePage = new ProfilePage(driver);
		_languagePage.ChooseEnglishLanguage();
		_loginPage.LoginWithValidData("marymary@gmail.com", "adminadmin123");
		_profilePage.ViewGroup();
		service.stop();
	}
	

}
