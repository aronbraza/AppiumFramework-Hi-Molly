package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PreferenceDependencies {
	
	 public PreferenceDependencies(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "android:id/checkbox")
	public WebElement Checkbox;
	
	@AndroidFindBy(xpath ="(//android.widget.RelativeLayout)[2]")
	public WebElement WifiSettings;
	
	
	@AndroidFindBy(id ="android:id/edit")
	public WebElement TextBox;
	
	@AndroidFindBy(id ="android:id/button2")
	public WebElement OK_Button;
}
