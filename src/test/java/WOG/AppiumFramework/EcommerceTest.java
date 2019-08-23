package WOG.AppiumFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckOutPage;
import pageObjects.FormPage;
import pageObjects.ProductPage;

public class EcommerceTest extends base {
	
	@BeforeTest
	public  void killAllNodes() throws IOException, InterruptedException 
	{
		base base = new base();
		base.KillNode();
	}
	
	@Test
	public void TotalPriceValidation() throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Utilities _utilities = new Utilities(driver);
		FormPage _formPage = new FormPage(driver);
		ProductPage _productPage = new ProductPage(driver);
		CheckOutPage _checkOutPage = new CheckOutPage(driver);
		
		_formPage.Country_DropDown.click();
		_utilities.ScrollToText("Argentina");
		_formPage.Name_TextBox.sendKeys("Aron Paul G. Braza");
		_formPage.Female_RadioButton.click();
		_formPage.LetsShop_Button.click();
		_productPage.AddToCart_Button.get(0).click();
		_productPage.AddToCart_Button.get(0).click();
		_productPage.Cart_Button.click();
		
		int count = _checkOutPage.ProductPrice.size();
		double expectedtotalamount = 0;
		for(int i=0; i<count; i++)
		{
			String expected = _checkOutPage.ProductPrice.get(i).getText();
			Double expectedamount = getAmount(expected);
			expectedtotalamount = expectedtotalamount + expectedamount;
		}
		String actualamount = _checkOutPage.TotalAmount.getText();
		actualamount = actualamount.substring(1);
		Double actualtotalamount = Double.parseDouble(actualamount);
		Assert.assertEquals(expectedtotalamount, actualtotalamount);
		System.out.println(expectedtotalamount);
		service.stop();
		
		
	}
	
	public static double getAmount(String value)
	{
		value = value.substring(1);
		double amountvalue = Double.parseDouble(value);
		return amountvalue;
	}

}
