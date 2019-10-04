package HiMollyAppPageObjects;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import WOG.AppiumFramework.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends base {
	
	public HomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public WebDriverWait wait = new WebDriverWait(driver, 10);
	
	
	//Status
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_status")
	public WebElement Status_Icon;
	
	@AndroidFindBy(id = "com.wog.himolly:id/action_send")
	public WebElement Send_Icon;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement WhatAreYouWorkinOn_Textbox;
	
	@AndroidFindBy(uiAutomator = "text(\"Tag a person or group\")")
	public WebElement TagPersonOrGroup_Textbox;
	
	@AndroidFindBy(id = "com.wog.himolly:id/img_photo")
	public WebElement Image_Photo;
	
	@AndroidFindBy(uiAutomator = "text(\"Add a hashtag\")")
	public WebElement Hashtag_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_hashtag")
	public WebElement Hashtag_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_tag_person")
	public WebElement TagPersonOrGroup_Icon;
	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_add_hashtag")
	public WebElement Hashtag_Icon;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@resource-id='com.wog.himolly:id/btn_add_image']")
	public WebElement Camera_Icon;
	
	@AndroidFindBy (id = "com.wog.himolly:id/check_view")
	public List<WebElement> CheckView_Photo;
	
	@AndroidFindBy (id = "com.wog.himolly:id/photo_thumbnail")
	public WebElement Photo_Thumbnail;
	
	@AndroidFindBy (id = "com.wog.himolly:id/button_apply")
	public WebElement Apply_Button;
	
	@AndroidFindBy (id = "com.wog.himolly:id/button_preview")
	public WebElement Preview_Button;
	
	@AndroidFindBy (id = "com.wog.himolly:id/button_preview")
	public WebElement Back_Button;
	
	@AndroidFindBy (id = "com.wog.himolly:id/btn_remove")
	public List<WebElement> RemoveImage_Icon;
	
	@AndroidFindBy (id ="com.wog.himolly:id/img_thumbnail")
	public WebElement Attached_Image;
	
	
	//Poll
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_poll")
	public WebElement Poll_Icon;
	
	@AndroidFindBy (id = "com.wog.himolly:id/txt_content")
	public WebElement WhatsThisPollAbout_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_label")
	public List<WebElement> Option_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/img_add")
	public WebElement AddOption_Button;
	
	//Event
	@AndroidFindBy (id ="com.wog.himolly:id/lnr_event")
	public WebElement Event_Icon;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_content")
	public WebElement SaySomething_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_content")
	public WebElement UploadEventBanner_Button;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_name")
	public WebElement EventName_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_detail")
	public WebElement AboutTheEvent_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/cb_holiday")
	public WebElement MarkThisAsHoliday_Checkbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_place")
	public WebElement AddAPlace_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_start")
	public WebElement StartDate_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_end")
	public WebElement EndDate_Textbox;
	

	//Category
	@AndroidFindBy (id ="com.wog.himolly:id/lnr_category")
	public WebElement SelectCategory;
	
	@AndroidFindBy (xpath ="//android.widget.TextView[@text='ADD NEW CATEGORY']")
	public WebElement AddNewCategory_Button;
	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select Category\"));")
	public WebElement ScrollInto_SelectCategory;
	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_option")
	public WebElement MoreIcon;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Edit']")
	public WebElement Edit_Category;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Delete']")
	public WebElement Delete_Category;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_name")
	public List<WebElement> Category_Name;
	
	@AndroidFindBy (id ="com.wog.himolly:id/dlg_txt_input")
	public WebElement CategoryName_Textbox;
	
	@AndroidFindBy (id = "com.wog.himolly:id/txt_picker")
	public WebElement SelectPicker_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_positive")
	public WebElement SaveCategory_Button;
	
	@AndroidFindBy (id ="Cancel")
	public WebElement CancelCategory_Button;
	
	//Announcement
	@AndroidFindBy (uiAutomator ="text(\"Announcement\")")
	public WebElement Announcement_Icon;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_title")
	public WebElement ThisAnnouncementisAbout_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_detail")
	public WebElement TypeYourAnnouncementDetails_Textbox;
	
	//Search Molly
	@AndroidFindBy (accessibility = "Navigate up")
	public WebElement Search_Icon;
	
	@AndroidFindBy (id ="com.wog.himolly:id/search_src_text")
	public WebElement SearchMolly_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_title")
	public List<WebElement> ColleagueOrGroupName_Text;
	
	@AndroidFindBy (id ="com.wog.himolly:id/img_photo")
	public WebElement ColleagueOrGroup_Picture;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_name")
	public WebElement ColleagueOrGroup_Name;
	
	
	@AndroidFindBy (xpath = "//android.widget.Toast[1]")
	public WebElement ToastMessage;

	
	//Test Case ID: Home_0001
	//Test Scenario: Verify if the user can post status with valid data. 
	public void PostStatusWithValidData(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws InterruptedException
	{
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertEquals(toastmessage, expectedmessage);
	}
	
	//Test Case ID: Home_0002
	//Test Scenario: Verify if the user can post image only. 
	public void PostImageOnly()
	{
		Status_Icon.click();
		Camera_Icon.click();
		Photo_Thumbnail.click();
		CheckView_Photo.get(0).click();
		Apply_Button.click();
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertEquals(toastmessage, expectedmessage);
		
	}
	
	//Test Case ID: Home_0003
	//Test Scenario: Verify if the user can post multiple images.
	public void PostMultipleImages()
	{
		Status_Icon.click();
		Camera_Icon.click();
		CheckView_Photo.get(0).click();
		CheckView_Photo.get(1).click();
		Apply_Button.click();
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertEquals(toastmessage, expectedmessage);
	}
	
	//Test Case ID: Home_0004
	//Test Scenario: Verify if the user can delete attached image on Post Status page.
	public void RemoveAttachedImage() throws InterruptedException
	{
	
		try
		{
			Status_Icon.click();
			Camera_Icon.click();
			Photo_Thumbnail.click();
			CheckView_Photo.get(0).click();
			Apply_Button.click();
			RemoveImage_Icon.get(0).click();
			Assert.assertTrue(!Attached_Image.isDisplayed());
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("No image attached.");
		}
		
		
		
	}
	
	//Test Case ID: Home_0005
	//Test Scenario: Verify if the user can delete multiple images on Post Status page.
	public void RemoveMultipleAttachedImages() throws InterruptedException
	{
		try
		{
			Status_Icon.click();
			Camera_Icon.click();
			CheckView_Photo.get(0).click();
			CheckView_Photo.get(1).click();
			Apply_Button.click();
			RemoveImage_Icon.get(0).click();
			RemoveImage_Icon.get(0).click();
			Assert.assertFalse(Attached_Image.isDisplayed());
		}
		catch (NoSuchElementException e)
		{
			System.out.println("No image attached.");
		}
		
		
	}
	
	//Test Case ID: Home_0006
	//Test Scenario: Verify if the user can post status with tag person or group.
	public void PostStatusWithValidDataWithTagPersonOrGroup(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String TagAPersonOrGroup2, String Hashtag) throws InterruptedException
	{
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Textbox.sendKeys(TagAPersonOrGroup);
		Image_Photo.click();
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertEquals(toastmessage, expectedmessage);
	}
	
	//Test Case ID: Home_0007
	//Test Scenario: Verify if the user can post status with multiple tag person or group.

	/* public void PostStatusWithMultipleTagPersonOrGroup(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String TagAPersonOrGroup2, String Hashtag) throws InterruptedException
	{
		
			Status_Icon.click();
			Hashtag_Icon.click();
			WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
			TagPersonOrGroup_Textbox.sendKeys(TagAPersonOrGroup);
			Image_Photo.click();
			TagPersonOrGroup_Textbox.sendKeys(TagAPersonOrGroup2);
			Image_Photo.click();
			Send_Icon.click();
			Thread.sleep(3000);
			String toastmessage = ToastMessage.getText();
			String expectedmessage = "Your post was successfully posted.";
			Assert.assertEquals(toastmessage, expectedmessage);
			
	
		
	}*/
	
	
	//Test Case ID: Home_0008
	//Test Scenario: Verify if the user can post status with tag person or group and hashtag.
	public void PostStatusWithTagPersonOrGroupAndHashtag(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String TagAPersonOrGroup2, String Hashtag) throws InterruptedException
	{
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Textbox.sendKeys(TagAPersonOrGroup);
		Image_Photo.click();
		Hashtag_Textbox.click();
		Hashtag_Textbox.sendKeys(Hashtag +"");
		Hashtag_Text.click();
		//Send_Icon.click();
		//String toastmessage = ToastMessage.getText();
		//String expectedmessage = "Your post was successfully posted.";
		//Assert.assertEquals(toastmessage, expectedmessage);
		
	}
	
	
	//Test Case ID: Home_00012
	//Test Scenario: Verify if the user can post poll with valid data.
	public void PostPollWithValidData(String WhatsThisPollABout, String Option1, String Option2)
	{
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		String expectedMessage = "Your post was successfully posted.";
		String toastMessage = ToastMessage.getText();
		Assert.assertEquals(expectedMessage, toastMessage);
			
	}
	
	//Test Case ID: Home_00013
	//Test Scenario: Verify if the user can post poll with more than two option.
	public void PostPollWithMoreThanTwoOption(String WhatsThisPollABout, String Option1, String Option2, String Option3, String Option4)
	{
		Poll_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatsThisPollABout);
		AddOption_Button.click();
		AddOption_Button.click();
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Option_Textbox.get(2).sendKeys(Option3);
		Option_Textbox.get(3).sendKeys(Option4);
		Send_Icon.click();
		String expectedMessage = "Your post was successfully posted.";
		String toastMessage = ToastMessage.getText();
		Assert.assertEquals(expectedMessage, toastMessage);
		
	}
	
	//Test Case ID: Home_0014
	//Test Scenario: Verify if the user can add new category on event. 
	public void AddNewCategory(String CategoryName, String SelectColor)
	{
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		AddNewCategory_Button.click();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(SelectColor);
		SaveCategory_Button.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "New category was successfully added.";
		Assert.assertEquals(toastmessage, expectedmessage);
	}
	
	
	//Test Case ID: Home_0015
	//Test Scenario: Verify if the user can edit category on event. 
	public void EditCategory(String CategoryName, String SelectColor)
	{
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		MoreIcon.click();
		Edit_Category.click();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(SelectColor);
		SaveCategory_Button.click();
		List<String> Category_List = new ArrayList<String>();
		for (WebElement item : Category_Name) 
		{
			Category_List.add(item.getText().toString());
			
		}
		System.out.println(Category_List.toString());
		
		
	}
	
	//Test Case ID: Home_0017
	//Test Scenario: Verify if the user can post Event with valid data on the fields. 
	public void PostEventWithValidData()
	{
		Event_Icon.click();
		SaySomething_Textbox.sendKeys("Test");
		EventName_Textbox.sendKeys("Test Event");
		AboutTheEvent_Textbox.sendKeys("Lorem ipsum");
		AddAPlace_Textbox.sendKeys("Malolos, Bulacan");
		StartDate_Textbox.sendKeys("September 07, 2019 8:30 AM");
		EndDate_Textbox.sendKeys("September 07, 2019 5:00 PM");
	}
	
	
	
	//Test Case ID: Home_0020
	//Test Scenario: Verify if the user can post announcement with valid data.
	public void PostAnnouncementWithValidData(String ThisAnnouncementisAbout, String TypeYourAnnouncementDetails )
	{
		Status_Icon.click();
		Announcement_Icon.click();
		ThisAnnouncementisAbout_Textbox.sendKeys(ThisAnnouncementisAbout);
		TypeYourAnnouncementDetails_Textbox.sendKeys(TypeYourAnnouncementDetails);
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertEquals(toastmessage, expectedmessage);
	}
	
	
	
	//Test Case ID: Home_0024
	//Test Scenario: Verify if the user can search colleague or group.
	public void SearchColleagueOrGroup(String SearchMolly)
	{
		Search_Icon.click();
		SearchMolly_Textbox.sendKeys(SearchMolly);
		List<String> getRes = new ArrayList<String>();
		for (WebElement item : ColleagueOrGroupName_Text) 
		{
			getRes.add(item.getText().toString());
		}
		Assert.assertTrue(getRes.toString().contains(SearchMolly.toString()));

		
	}
	
	//Test Case ID: Home_0025
	//Test Scenario: Verify if the user can view profile of colleague or group thru search.
	
	public void ViewProfile(String SearchMolly)
	{
		Search_Icon.click();
		SearchMolly_Textbox.sendKeys(SearchMolly);
		ColleagueOrGroup_Picture.click();
		Assert.assertEquals(SearchMolly.toString(), ColleagueOrGroup_Name.getText());
		
		
	}
	
	
	
	

}
