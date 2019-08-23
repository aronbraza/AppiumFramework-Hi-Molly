package WOG.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name = "InputData")
	public Object[][] getDataforEditField()
	{
		Object[][] obj = new Object[][]
		{
			{"hello"}, {"@#$%"}
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginWithCompanyEmailOnly")
	public Object[][] getCompanyEmailOnly()
	{
		Object[][]obj = new Object[][]
		{
		{"ericadisto@gmail.com"}			
		
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginWithPasswordOnly")
	public Object[][] getPasswordOnly()
	{
		Object[][]obj = new Object[][]
		{
		{"adminadmin123"}			
		
		};
		
		return obj;
	}
	
	
	@DataProvider(name ="LoginValidCompanyEmailInvalidPassword")
	public Object[][] getValidCompanyEmailInvalidPassword()
	{
		Object[][]obj = new Object[][]
		{
		{"ericadisto@gmail.com", "Loremipsum123456789"}			
		
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginInvalidData")
	public Object[][] getInvalidDataForLogin()
	{
		Object[][]obj = new Object[][]
		{
		{"wog.stanleyfuji@gmail.com", "Wog123456789"}			
		
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginValidData")
	public Object[][] getValidDataForLogin()
	{
		Object[][]obj = new Object[][]
		{
		{"ericadisto@gmail.com", "adminadmin123"}			
		
		};
		
		return obj;
	
	}

}
