package WOG.AppiumFramework;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;




public class Ecommerce_tc_4 extends base {
		
		@Test
		public void TotalValidation() throws IOException, InterruptedException{
			service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));").click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Aron Paul G. Braza");
		driver.hideKeyboard();
		driver.findElementByAndroidUIAutomator("text(\"Female\")").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(4000);
		
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double expectedTotalAmount=0;
		for (int i = 0; i<count; i++)
		{
			String amount = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			double TotalAmount = getAmount(amount);
			expectedTotalAmount=expectedTotalAmount+TotalAmount;
		}
		System.out.println(expectedTotalAmount);
		String TotalAmount = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		TotalAmount = TotalAmount.substring(2);
		Double actualTotalAmount = Double.parseDouble(TotalAmount);
		Assert.assertEquals(expectedTotalAmount, actualTotalAmount);
		service.stop();
		}
		

		
		public static double getAmount(String value)
		{
			value = value.substring(1);
			double amountvalue = Double.parseDouble(value);
			return amountvalue;
		}

	
	
	

}
