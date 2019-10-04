package WOG.AppiumFramework;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.HomePage;
import pageObjects.Preference;
import pageObjects.PreferenceDependencies;

public class APIDemoTest extends base {
	
	
	
	@Test(dataProvider = "InputData", dataProviderClass=TestData.class)
	public void APIDEMO(String input) throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver =  Capabilities("apiDemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage h = new HomePage(driver);
		Preference p = new Preference(driver);
		PreferenceDependencies pd = new PreferenceDependencies(driver);
		
		
			
			
			
			
		
		//h.Preferences.click();
		//p.PreferenceDependencies.click();
		//pd.Checkbox.click();
		//pd.WifiSettings.click();
		////pd.TextBox.sendKeys(input);
		//pd.OK_Button.click();
		service.stop();
		
	}
	
	
	

}
