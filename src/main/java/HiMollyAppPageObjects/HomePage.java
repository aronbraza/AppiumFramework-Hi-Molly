package HiMollyAppPageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	public HomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_status")
	public WebElement Status_Icon;
	
	@AndroidFindBy(id = "com.wog.himolly:id/action_send")
	public WebElement Send_Icon;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement WhatAreYouWorkinOn_Textbox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Tag a person or group']")
	public WebElement TagPersonOrGroup_Textbox;
	
	@AndroidFindBy(className ="androidx.recyclerview.widget.RecyclerView")
	public WebElement Hashtag_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_tag_person")
	public WebElement TagPersonOrGroup_Icon;
	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_add_hashtag")
	public WebElement Hashtag_Icon;
	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_add_image")
	public WebElement Camera_Icon;
	
	
	
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_poll")
	public WebElement Poll_Icon;
	
	
	public void PostStatusWithValidData(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws InterruptedException
	{
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Textbox.sendKeys(TagAPersonOrGroup);
		Send_Icon.click();
	}
	
	public void PostStatusWithValidDataWithTagPersonOrGroup(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws InterruptedException
	{
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Textbox.sendKeys(TagAPersonOrGroup);
		Send_Icon.click();
	}
	
	

}
