package HiMollyAppPageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePage {
	
	
	 public ProfilePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	 AndroidDriver<AndroidElement> driver;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Profile']")
	public WebElement Profile_Icon;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='About']")
	public WebElement About_Tab;
	
	
	@AndroidFindBy(accessibility ="Navigate up")
	public WebElement Back_Icon;
	
	@AndroidFindBy (id ="com.wog.himolly:id/btn_save")
	public WebElement UpdateProfile_Button;
	
	
	//Personal Information	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_edit_personal_info")
	public WebElement PersonalInformation_EditIcon;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_first_name")
	public WebElement FirstName_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_middle_name")
	public WebElement MiddleName_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_last_name")
	public WebElement LastName_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_suffix")
	public WebElement Suffix_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_birth_date")
	public WebElement Birthdate_Textbox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='12']")
	public WebElement Expertise_Textbox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='14']")
	public WebElement Interests_Textbox;
	
	//Contact Information
	@AndroidFindBy(id ="com.wog.himolly:id/btn_edit_contact_info")
	public WebElement ContactInformation_EditIcon;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_address")
	public WebElement CompleteAddress_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_phone")
	public WebElement PhoneNumber_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_mobile")
	public WebElement MobileNumber_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_email")
	public WebElement EmailAddress_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_name")
	public WebElement ContactPersonName_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_relationship")
	public WebElement Relationship_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_contact")
	public WebElement ContactNumber_Textbox;
	
	
	
	//Educational Attainment
	

	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_add")
	public WebElement AddEducationalAttainment;
	
	@AndroidFindBy(id= "com.wog.himolly:id/btn_edit_educ_attainment")
	public WebElement EducationalAttainment_EditIcon;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_school")
	public List<WebElement> School_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_degree")
	public List<WebElement> Degree_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_start")
	public List<WebElement> FromYear_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_end")
	public List<WebElement> ToYear_Textbox;
	
	
	
	
	//Test Case ID: Profile_0029
	public void EditPersonalInformationWithValidData(String FirstName, String MiddleName, String LastName, String Suffix, String Birthdate, String Expertise, String Interests)
	{
		Profile_Icon.click();
		About_Tab.click();
		PersonalInformation_EditIcon.click();
		
		//Clear Data on text fields
		FirstName_Textbox.clear();
		MiddleName_Textbox.clear();
		LastName_Textbox.clear();
		Suffix_Textbox.clear();
		Birthdate_Textbox.clear();
		 
		int ExpertiseTextLength = Expertise_Textbox.getText().length();
		int InterestTextLength = Interests_Textbox.getText().length();		
		
		for(int i=0; i<=ExpertiseTextLength ;i++)
		{
			Expertise_Textbox.clear();
		}
		
		for(int i=0; i<=InterestTextLength ;i++)
		{
			Interests_Textbox.clear();
		}
	
		FirstName_Textbox.sendKeys(FirstName);
		MiddleName_Textbox.sendKeys(MiddleName);
		LastName_Textbox.sendKeys(LastName);
		Suffix_Textbox.sendKeys(Suffix);
		Birthdate_Textbox.sendKeys(Birthdate);
		Expertise_Textbox.sendKeys(Expertise);
		Interests_Textbox.sendKeys(Interests);
		
		
	}
	
	
	//Test Case ID: Profile_0030
	public void EditContactInformationWithValidData(String CompleteAddress, String PhoneNumber, String MobileNumber, String EmailAddress, String ContactPersonName,String Relationship, String ContactNumber)
	{
		Profile_Icon.click();
		About_Tab.click();
		ContactInformation_EditIcon.click();
		
		//Clear Data on textfields.
		CompleteAddress_Textbox.clear();
		PhoneNumber_Textbox.clear();
		MobileNumber_Textbox.clear();
		ContactPersonName_Textbox.clear();
		Relationship_Textbox.clear();
		ContactNumber_Textbox.clear();
		
		CompleteAddress_Textbox.sendKeys(CompleteAddress);
		PhoneNumber_Textbox.sendKeys(PhoneNumber);
		MobileNumber_Textbox.sendKeys(MobileNumber);
		EmailAddress_Textbox.sendKeys(EmailAddress);
		ContactPersonName_Textbox.sendKeys(ContactPersonName);
		Relationship_Textbox.sendKeys(Relationship);
		ContactNumber_Textbox.sendKeys(ContactNumber);
				
		
	}
	
	//Test Case ID: Profile_0031
	public void AddEducationalAttainmentWithValidData(String School, String Degree, String FromYear, String ToYear)
	{
		Profile_Icon.click();
		About_Tab.click();
		EducationalAttainment_EditIcon.click();
		AddEducationalAttainment.click();		
		int SchoolTextbox_Size = School_Textbox.size();
		int DegreeTextbox_Size = Degree_Textbox.size();
		int FromYearTextbox_Size = FromYear_Textbox.size();
		int ToYearTextbox_Size = ToYear_Textbox.size();
		int getSchoolTextbox=0;
		int getDegreeTextbox=0;
		int getFromYearTextbox=0;
		int getToYearTextbox=0;
		for(int i=0; i<SchoolTextbox_Size;i++)
		{
			getSchoolTextbox = i;
			
			for(int j=0; j<DegreeTextbox_Size; j++)
			{
				getDegreeTextbox = j;
			}
			
			for(int l=0; l<FromYearTextbox_Size; l++)
			{
				getFromYearTextbox = l;
			}
			
			for(int k=0; k<ToYearTextbox_Size; k++)
			{
				getToYearTextbox = k;
			}
		}
		
		
		School_Textbox.get(getSchoolTextbox).sendKeys(School);
		Degree_Textbox.get(getDegreeTextbox).sendKeys(Degree);
		FromYear_Textbox.get(getFromYearTextbox).sendKeys(FromYear);
		ToYear_Textbox.get(getToYearTextbox).sendKeys(ToYear);
		UpdateProfile_Button.click();
						
	}
	
	public void EditEducationalAttainmentWithValidData()
	{
		Profile_Icon.click();
		About_Tab.click();
		EducationalAttainment_EditIcon.click();
		
		int SchoolTextbox_Size = School_Textbox.size();
		int DegreeTextbox_Size = Degree_Textbox.size();
		int getSchoolTextbox=0;
		int getDegreeTextbox=0;
		
		for(int i=SchoolTextbox_Size; i>0;--i)
		{
			getSchoolTextbox = i;
		}
		System.out.print(getDegreeTextbox);
		//Clear data on text fields
		School_Textbox.get(getSchoolTextbox).clear();
		
		School_Textbox.get(getSchoolTextbox).sendKeys("STI");
		//Degree_Textbox.get(2).sendKeys("BSIT");
		FromYear_Textbox.get(0).sendKeys("2018");
		ToYear_Textbox.get(0).sendKeys("2019");
		
		
		
	}
		}

